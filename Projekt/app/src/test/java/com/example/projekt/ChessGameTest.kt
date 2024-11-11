package com.example.projekt

import junit.framework.TestCase

class ChessGameTest : TestCase() {

    fun testToString()
    {
        assertTrue(ChessGame.toString().contains("0 r n b q k b n r"))
    }

    fun testMovePiece() {}

    fun testReset() {}

    fun testPieceAt() {
        assertNotNull(ChessGame.pieceAt(0, 0))
        assertEquals(Player.WHITE, ChessGame.pieceAt(0, 0)?.player)
    }
}