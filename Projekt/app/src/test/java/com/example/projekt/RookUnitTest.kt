package com.example.projekt

import org.junit.Test
import org.junit.Assert.*

class RookUnitTest {
        @Test
        fun canRookMove_singlePiece() {
            ChessGame.clear()
            ChessGame.addPiece(ChessPiece(3, 3, Player.WHITE, ChessMan.ROOK, -1))
            println(ChessGame)

            assertTrue(ChessGame.canMove(Square(3,3), Square(3,0)))
            assertFalse(ChessGame.canMove(Square(3,3), Square(4,4)))
            assertTrue(ChessGame.canMove(Square(3,3), Square(7,3)))

            @Test
            fun canRookMove_blocked() {
                ChessGame.clear()
                ChessGame.addPiece(ChessPiece(3,3, Player.WHITE, ChessMan.ROOK, -1))
                ChessGame.addPiece(ChessPiece(3,3, Player.WHITE, ChessMan.KNIGHT, -1))
                println(ChessGame)
                assertFalse(ChessGame.canMove(Square(3,3), Square(7,3)))
            }

        }
    }