package com.example.projekt

import junit.framework.TestCase

class ChessGameTest : TestCase() {

    fun testToString()
    {
        assertTrue(ChessGame.toString().contains("0 r n b q k b n r"))
    }

    fun testMovePiece() {
        assertNotNull(ChessGame.pieceAt(0, 2))
        ChessGame.movePiece(0, 1, 0, 2)
        assertNotNull(ChessGame.pieceAt(0, 2))
    }

    fun testReset() {
        assertNotNull(ChessGame.pieceAt(0, 2))
        ChessGame.movePiece(0, 1, 0, 2)
        assertNotNull(ChessGame.pieceAt(0, 2))
    }

    fun testPieceAt() {
        assertNotNull(ChessGame.pieceAt(0, 0))
        assertEquals(Player.WHITE, ChessGame.pieceAt(0, 0)?.player)
    }
}