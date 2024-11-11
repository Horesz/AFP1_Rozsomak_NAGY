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

    private lateinit var chessView: ChessView
    private var printWriter: PrintWriter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        chessView = findViewById<ChessView>(R.id.chess_view)
        chessView.chessDelegate = this

        findViewById<Button>(R.id.reset_button).setOnClickListener{
            ChessGame.reset()
            chessView.invalidate()
        }

    }

    override fun pieceAt(col: Int, row: Int): ChessPiece? = ChessGame.pieceAt(col, row)

    override fun movePiece(fromCol: Int, fromRow: Int, toCol: Int, toRow: Int) {

        Log.d(TAG, "$fromCol, $fromRow, $toCol, $toRow")
        ChessGame.movePiece(fromCol, fromRow, toCol, toRow)
        chessView.invalidate()

        printWriter.let {
            val moveStr = "$fromCol, $fromRow, $toCol, $toRow"
            Executors.newSingleThreadExecutor().execute{
                it?.println(moveStr)
            }
        }
    }
}