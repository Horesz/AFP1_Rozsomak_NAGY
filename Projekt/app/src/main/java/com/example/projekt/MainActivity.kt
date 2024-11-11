package com.example.projekt

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.PrintWriter
import java.util.concurrent.Executors

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity(), ChessDelegate{

    private var chessModel = ChessModel()
    private lateinit var chessView: ChessView
    private var printWriter: PrintWriter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        chessView = findViewById<ChessView>(R.id.chess_view)
        chessView.chessDelegate = this

        findViewById<Button>(R.id.reset_button).setOnClickListener{
            chessModel.reset()
            chessView.invalidate()
        }

        }

    override fun pieceAt(col: Int, row: Int): ChessPiece? {
        return chessModel.pieceAt(col, row)
    }

    override fun movePiece(fromCol: Int, fromRow: Int, toCol: Int, toRow: Int) {

        Log.d(TAG, "$fromCol, $fromRow, $toCol, $toRow")
        if(fromCol == toCol && fromRow == toRow){
            return
        }

        chessModel.movePiece(fromCol, fromRow, toCol, toRow)
        findViewById<ChessView>(R.id.chess_view).invalidate()

        printWriter.let {
            val moveStr = "$fromCol, $fromRow, $toCol, $toRow"
            Executors.newSingleThreadExecutor().execute{
                it?.println(moveStr)
            }
        }
    }
}