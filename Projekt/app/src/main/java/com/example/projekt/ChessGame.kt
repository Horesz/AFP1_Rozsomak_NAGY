package com.example.projekt

import kotlin.math.abs

object ChessGame {
    private var piecesBox = mutableSetOf<ChessPiece>()

    init {
        reset()
    }

    fun clear(){
        piecesBox.removeAll(piecesBox)
    }

    fun addPiece(piece: ChessPiece){
        piecesBox.add(piece)
    }

    fun canKnightMove(from: Square, to: Square): Boolean{
        return abs(from.col - to.col) == 2 && abs(from.row - to.row) == 1 ||
                abs(from.col - to.col) == 1 && abs(from.row - to.row) == 2
    }

    fun canRookMove(from: Square,to: Square): Boolean{
        if(from.col == to.col || from.row == to.row){
            return true
        }
        return false
    }

    private fun isClearHorizontallyBetween(from: Square,to: Square): Boolean{
        if(from.row != to.row) return false
        val gap = abs(from.col - to.col) - 1
        if (gap == 0) return true
        for (i in 1..gap){
            if (pieceAt(Square(from.col + i,from.row)) != null){
                return false
            }
        }
        return true
    }

    fun canMove(from: Square, to: Square): Boolean{
        if(from.col == to.col && from.row == to.row){
            return false
        }
        val movingPiece = pieceAt(from) ?: return false
        when(movingPiece.man){
            ChessMan.KNIGHT -> return canKnightMove(from, to)
            ChessMan.ROOK -> return canRookMove(from,to)
            ChessMan.KING -> TODO()
            ChessMan.QUEEN -> TODO()
            ChessMan.BISHOP -> TODO()
            ChessMan.PAWN -> TODO()
        }
        return true
    }

    fun movePiece(from: Square, to: Square){
        if (canMove(from, to)){
            movePiece(from.col,from.row,to.col,to.row)
        }
    }

    private fun movePiece(fromCol: Int, fromRow: Int, toCol: Int, toRow: Int){
        if (fromCol == toCol && fromRow == toRow) return
        val movingPiece = pieceAt(fromCol, fromRow) ?: return

        pieceAt(toCol, toRow)?.let {
            if (it.player == movingPiece.player) {
                return
            }
            piecesBox.remove(it)
        }

        piecesBox.remove(movingPiece)
        addPiece(movingPiece.copy(col = toCol, row = toRow))

    }

    fun reset(){
        clear()
        for (i in 0 until 2){
            addPiece(ChessPiece(0 + i * 7, row = 0, Player.WHITE, ChessMan.ROOK, R.drawable.rook_white))
            addPiece(ChessPiece(0 + i * 7, row = 7, Player.BLACK, ChessMan.ROOK, R.drawable.rook_black))

            addPiece(ChessPiece(1 + i * 5, row = 0, Player.WHITE, ChessMan.KNIGHT, R.drawable.knight_white))
            addPiece(ChessPiece(1 + i * 5, row = 7, Player.BLACK, ChessMan.KNIGHT, R.drawable.knight_black))

            addPiece(ChessPiece(2 + i * 3, row = 0, Player.WHITE, ChessMan.BISHOP, R.drawable.bishop_white))
            addPiece(ChessPiece(2 + i * 3, row = 7, Player.BLACK, ChessMan.BISHOP, R.drawable.bishop_black))
        }

        for (i in 0 until 8){
            addPiece(ChessPiece(i, row = 1, Player.WHITE, ChessMan.PAWN, R.drawable.pawn_white))
            addPiece(ChessPiece(i, row = 6, Player.BLACK, ChessMan.PAWN, R.drawable.pawn_black))
        }

        addPiece(ChessPiece(3, row = 0, Player.WHITE, ChessMan.QUEEN, R.drawable.queen_white))
        addPiece(ChessPiece(3, row = 7, Player.BLACK, ChessMan.QUEEN, R.drawable.queen_black))

        addPiece(ChessPiece(4, row = 0, Player.WHITE, ChessMan.KING, R.drawable.king_white))
        addPiece(ChessPiece(4, row = 7, Player.BLACK, ChessMan.KING, R.drawable.king_black))

    }

    fun pieceAt(square: Square): ChessPiece?{
        return pieceAt(square.col, square.row)
    }

    private fun pieceAt(col: Int, row: Int) : ChessPiece?{
        for (piece in piecesBox){
            if(col == piece.col && row == piece.row){
                return  piece
            }
        }
        return null
    }

    override fun toString(): String {
        var desc = " \n"
        for (row in 7 downTo 0) {

            val r = 7 - row
            desc += "$r"
            for (col in 0 until 8) {

                desc += " "
                desc += pieceAt(col,r)?.let {
                    val white = it.player == Player.WHITE
                    desc += " "
                    when (it.man){
                        ChessMan.KING -> {if (white) " k" else " K"}
                        ChessMan.QUEEN -> {if (white) " q" else " Q"}
                        ChessMan.BISHOP -> {if (white) " b" else " B"}
                        ChessMan.ROOK -> {if (white) " r" else " R"}
                        ChessMan.KNIGHT -> {if (white) " n" else " N"}
                        ChessMan.PAWN -> {if (white) " p" else " P"}
                    } ?: "."
                }

            }
            desc += "\n"
        }
        desc += "  0 1 2 3 4 5 6 7"

        return desc
    }
}