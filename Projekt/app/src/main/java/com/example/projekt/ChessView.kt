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
import android.view.View

class ChessView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {
    private final val originX: Float = 20f
    private final val originY: Float = 200f
    private final val cellSide: Float = 130f
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
    private final val bitmaps = mutableMapOf<Int, Bitmap>()
    private final val paint = Paint()

    init {
        loadBitmaps()
    }

    override fun onDraw(canvas: Canvas) {
        drawChessBoard(canvas)
        drawPieces(canvas)

    }

    private fun drawPieces(canvas: Canvas?){
        drawPieaceAt(canvas, 0, 0, R.drawable.rook_white)
    }

    private fun drawPieaceAt(canvas: Canvas?,col: Int, row: Int, resID: Int){
        val whiteQueenBitmap = bitmaps[resID]!!
        canvas?.drawBitmap(whiteQueenBitmap, null, RectF(originX + col * cellSide,originY + (7 - row ) * cellSide,originX + (col + 1) * cellSide,originY + ((7 - row) + 1) * cellSide), paint)
    }

    private fun loadBitmaps(){
        imgResIDs.forEach{
            bitmaps[it] = BitmapFactory.decodeResource(resources, it)
        }
    }

    private fun drawChessBoard(canvas: Canvas?){
        for (i in 0..7){
            for (j in 0..7){
                paint.color = if ((i + j) % 2 == 1) Color.DKGRAY else Color.LTGRAY
                canvas?.drawRect(originX + i * cellSide, originY + j * cellSide, originX + (i + 1)* cellSide, originY + (j + 1) * cellSide, paint)
            }
        }
    }
}