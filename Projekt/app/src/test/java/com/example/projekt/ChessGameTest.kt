package com.example.projekt

import org.junit.Test
import org.junit.Assert.*

class ChessGameTest{

    @Test
    fun toString_isCorrect() {
        assertTrue(ChessGame.toString().contains("0 r n b q k b n r"))
    }

    @Test
    fun testMovePiece() {
        assertNull(ChessGame.pieceAt(0, 2))
        ChessGame.movePiece(0, 1, 0, 2)
        assertNotNull(ChessGame.pieceAt(0, 2))
    }

    @Test
    fun testReset() {
        assertNull(ChessGame.pieceAt(0, 2))
        ChessGame.movePiece(0, 1, 0, 2)
        assertNotNull(ChessGame.pieceAt(0, 2))
        ChessGame.reset()
        assertNull(ChessGame.pieceAt(0, 2))
    }

    @Test
    fun testPieceAt() {
        assertNotNull(ChessGame.pieceAt(0, 0))
        assertEquals(Player.WHITE, ChessGame.pieceAt(0, 0)?.player)
    }


}