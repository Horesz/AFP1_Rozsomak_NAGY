package com.example.projekt

import org.junit.Test
import org.junit.Assert.*

class KingUnitTest {
    @Test
    fun canKingMove_singlePiece(){
        ChessGame.clear()
        ChessGame.addPiece(ChessPiece(3,3, Player.WHITE, ChessMan.KING, -1))
        println(ChessGame)

        assertTrue(ChessGame.canMove(Square(3,3), Square(2,2)))
        assertTrue(ChessGame.canMove(Square(3,3), Square(2,3)))
        assertTrue(ChessGame.canMove(Square(3,3), Square(2,4)))

        assertTrue(ChessGame.canMove(Square(3,3), Square(2,2)))
        assertTrue(ChessGame.canMove(Square(3,3), Square(2,3)))
        assertTrue(ChessGame.canMove(Square(3,3), Square(2,4)))

        assertTrue(ChessGame.canMove(Square(3,3), Square(3,2)))
        assertTrue(ChessGame.canMove(Square(3,3), Square(3,4)))

        assertFalse(ChessGame.canMove(Square(3,3), Square(5,3)))

    }
}