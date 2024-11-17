package com.example.projekt

import com.example.projekt.ChessGame.addPiece
import com.example.projekt.ChessGame.clear
import org.junit.Test
import org.junit.Assert.*

    class CanRookMoveUnitTest {
        @Test
        fun canRookMove_singlePiece() {
            ChessGame.clear()
            ChessGame.addPiece(ChessPiece(3, 3, Player.WHITE, ChessMan.ROOK, -1))
            println(ChessGame)


        }
    }