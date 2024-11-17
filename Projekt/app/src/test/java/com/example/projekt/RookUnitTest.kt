package com.example.projekt

import org.junit.Test

class RookUnitTest {
        @Test
        fun canRookMove_singlePiece() {
            ChessGame.clear()
            ChessGame.addPiece(ChessPiece(3, 3, Player.WHITE, ChessMan.ROOK, -1))
            println(ChessGame)


        }
    }