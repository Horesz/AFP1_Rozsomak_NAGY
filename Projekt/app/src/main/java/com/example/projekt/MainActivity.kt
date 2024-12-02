package com.example.projekt

import android.nfc.Tag
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.PrintWriter
import java.util.concurrent.Executors

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity(), ChessDelegate, ChessGameListener{

    private val PORT: Int = 50001
    private lateinit var chessView: ChessView
    private var printWriter: PrintWriter? = null
    private val isEmulator = Build.FINGERPRINT.contains("generic")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ChessGame.gameListener = this

        chessView = findViewById<ChessView>(R.id.chess_view)
        chessView.chessDelegate = this

        findViewById<Button>(R.id.reset_button).setOnClickListener{
            ChessGame.reset()
            chessView.invalidate()
        }

    }

    override fun showMessage(message: String) {
        runOnUiThread {
            AlertDialog.Builder(this)
                .setMessage(message)
                .setPositiveButton("OK") { dialog, _ ->
                    dialog.dismiss()
                }
                .show()
        }
    }

    override fun pieceAt(square: Square): ChessPiece? {
        return ChessGame.pieceAt(square)
    }

    override fun movePiece(from: Square, to: Square) {

        ChessGame.movePiece(from, to)
        chessView.invalidate()

        printWriter.let {
            val moveStr = "${from.col}, ${from.row}, ${to.col}, ${to.row}"
            Executors.newSingleThreadExecutor().execute{
                it?.println(moveStr)
            }
        }
    }
}