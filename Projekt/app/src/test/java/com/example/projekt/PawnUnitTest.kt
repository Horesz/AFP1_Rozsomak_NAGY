package com.example.projekt

import org.junit.Test
import org.junit.Assert.*
import kotlin.math.sqrt

class PawnUnitTest {
    @Test
    fun canPawnMove_firstMove() {
        println(ChessGame)
        assertTrue(ChessGame.canMove(Square(3, 1), Square(3,2)))
        assertTrue(ChessGame.canMove(Square(3, 1), Square(3,3)))

        assertFalse(ChessGame.canMove(Square(3, 1), Square(4,3)))
    }
}