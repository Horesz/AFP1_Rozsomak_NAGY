package com.example.projekt

interface ChessDelegate {
    fun pieceAt(col: Int, row: Int) : ChessPiece?
}