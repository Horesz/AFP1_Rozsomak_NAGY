package com.example.projekt

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.RectF
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import kotlin.math.min

class ChessView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {
    private val scalefactor = .9f
    private var originX: Float = 20f
    private var originY: Float = 200f
    private var cellSide: Float = 130f
    private val lightColor = Color.parseColor("#EEEEEE")
    private val darkColor = Color.parseColor("#BBBBBB")

    private final val imgResIDs = setOf(
        R.drawable.bishop_black,
        R.drawable.bishop_white,
        R.drawable.king_black,
        R.drawable.king_white,
        R.drawable.queen_black,
        R.drawable.queen_white,
        R.drawable.rook_black,
        R.drawable.rook_white,
        R.drawable.knight_black,
        R.drawable.knight_white,
        R.drawable.pawn_black,
        R.drawable.pawn_white
    )
    private val bitmaps = mutableMapOf<Int, Bitmap>()
    private val paint = Paint()
    private var fromCol: Int = -1
    private var fromRow: Int = -1

    var chessDelegate: ChessDelegate? = null

    init {
        loadBitmaps()
    }

    override fun onDraw(canvas: Canvas) {

        canvas ?: return

        val chessBoardSide= min(width, height) * scalefactor
        cellSide = chessBoardSide / 8f
        originX = (width - chessBoardSide) / 2f
        originY = (height - chessBoardSide) /2f

        drawChessBoard(canvas)
        drawPieces(canvas)

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        event ?: return false
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                fromCol = ((event.x-originX)/cellSide).toInt()
                fromRow = 7- ((event.y-originY)/cellSide).toInt()
            }
            MotionEvent.ACTION_MOVE -> {}
            MotionEvent.ACTION_UP -> {
                val col = ((event.x-originX)/cellSide).toInt()
                val row = 7- ((event.y-originY)/cellSide).toInt()
                Log.d(TAG, "from ($fromCol, $fromRow) to ($col, $row)")
                chessDelegate?.movePiece(fromCol, fromRow, col, row)
            }
        }
        return true
    }

    private fun drawPieces(canvas: Canvas){

        for (row in 0..7){
            for (col in 0..7){
                chessDelegate?.pieceAt(col,row)?.let {drawPieceAt(canvas, col, row, it.resID)}
            }
        }
    }

    private fun drawPieceAt(canvas: Canvas,col: Int, row: Int, resID: Int){
        val whiteQueenBitmap = bitmaps[resID]!!
        canvas.drawBitmap(whiteQueenBitmap, null, RectF(originX + col * cellSide,originY + (7 - row ) * cellSide,originX + (col + 1) * cellSide,originY + ((7 - row) + 1) * cellSide), paint)
    }

    private fun loadBitmaps(){
        imgResIDs.forEach{
            bitmaps[it] = BitmapFactory.decodeResource(resources, it)
        }
    }

    private fun drawChessBoard(canvas: Canvas){
        for (row in 0..7){
            for (col in 0..7){
                drawSquareAt(canvas, col, row, (col + row) % 2 == 1)

         //       paint.color = if ((i + j) % 2 == 1) darkColor else lightColor
           //     canvas?.drawRect(originX + i * cellSide, originY + j * cellSide, originX + (i + 1)* cellSide, originY + (j + 1) * cellSide, paint)
            }
        }
    }

    private fun drawSquareAt(canvas: Canvas, col: Int, row: Int, isDark: Boolean) {
        paint.color = if (isDark) darkColor else lightColor
        canvas.drawRect(originX + col * cellSide, originY + row * cellSide, originX + (col + 1)* cellSide, originY + (row + 1) * cellSide, paint)
    }
}