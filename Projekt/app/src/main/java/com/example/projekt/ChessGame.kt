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

    private fun canKnightMove(from: Square, to: Square): Boolean{
        return abs(from.col - to.col) == 2 && abs(from.row - to.row) == 1 ||
                abs(from.col - to.col) == 1 && abs(from.row - to.row) == 2
    }

    private fun canRookMove(from: Square,to: Square): Boolean{
        if(from.col == to.col && isClearVerticallyBetween(from, to) || from.row == to.row && isClearHorizontallyBetween(from,to)){
            return true
        }
        return false
    }

    private fun isClearVerticallyBetween(from: Square,to: Square): Boolean{
        if(from.col != to.col) return false
        val gap = abs(from.row - to.row) - 1
        if (gap == 0) return true
        for (i in 1..gap){
            val nextRow = if (to.row > from.row) from.row + i else from.row - 1
            if (pieceAt(Square(from.col, nextRow)) != null){
                return false
            }
        }
        return true
    }

    private fun isClearHorizontallyBetween(from: Square,to: Square): Boolean{
        if(from.row != to.row) return false
        val gap = abs(from.col - to.col) - 1
        if (gap == 0) return true
        for (i in 1..gap){
            val nextCol = if (to.col > from.col) from.col + i else from.col - i
            if (pieceAt(Square(nextCol,from.row)) != null){
                return false
            }
        }
        return true
    }

    private fun isClearDiagonally(from: Square,to: Square) : Boolean{
        if (abs(from.col - to.col) == abs(from.row - to.row)) return false
        val gap = abs(from.col - to.col) - 1
        for (i in 1..gap){
            val nextCol = if (to.col > from.col) from.col + i else from.col - i
            val nextRow = if (to.row > from.row) from.row + i else from.row - i
            if (pieceAt(nextCol,nextRow) != null){
                return false
            }
        }
        return true
    }

    private fun canBishopMove(from: Square, to: Square): Boolean{
        if (abs(from.col - to.col) == abs(from.row-to.row)){
            return isClearDiagonally(from,to)
        }
        return false
    }

    private fun canQueenMove(from: Square, to: Square): Boolean{
        return canRookMove(from,to) || canBishopMove(from,to)
    }

    private fun canKingMove(from: Square, to: Square): Boolean{
        if (canQueenMove(from,to)){
            return abs(from.row - to.row) == 1 &&
                    (abs(from.col - to.col) == 0 || abs(from.col - to.col) == 1) ||
                    abs(from.col - to.col) == 1 &&
                    (abs(from.row - to.row) == 0 || abs(from.row - to.row) == 1)
        }
        return false
    }

    private fun canPawnMove(from: Square, to: Square): Boolean {
        val movingPiece = pieceAt(from) ?: return false
        val direction = if (movingPiece.player == Player.WHITE) 1 else -1
        val startRow = if (movingPiece.player == Player.WHITE) 1 else 6

        if (from.col == to.col) {
            if (to.row == from.row + direction && pieceAt(to) == null) {
                return true
            }

            if (from.row == startRow && to.row == from.row + 2 * direction && pieceAt(to) == null) {
                val intermediateSquare = Square(from.col, from.row + direction)
                if (pieceAt(intermediateSquare) == null) {
                    return true
                }
            }
        }
        if (abs(from.col - to.col) == 1 && to.row == from.row + direction) {
            val targetPiece = pieceAt(to)
            if (targetPiece != null && targetPiece.player != movingPiece.player) {
                return true
            }
        }

        // "Passzáns" (en passant) szabály - opcionális, nem kötelező implementálni most

        return false
    }

    fun canMove(from: Square, to: Square): Boolean{
        if(from.col == to.col && from.row == to.row){
            return false
        }
        val movingPiece = pieceAt(from) ?: return false
        return when(movingPiece.man){
            ChessMan.KNIGHT -> canKnightMove(from, to)
            ChessMan.ROOK -> canRookMove(from,to)
            ChessMan.KING -> canKingMove(from, to)
            ChessMan.QUEEN -> canQueenMove(from, to)
            ChessMan.BISHOP -> canBishopMove(from, to)
            ChessMan.PAWN -> canPawnMove(from, to)
        }
    }

    fun movePiece(from: Square, to: Square){
        if (canMove(from, to)){
            movePiece(from.col,from.row,to.col,to.row)
        }
    }

    fun movePiece(fromCol: Int, fromRow: Int, toCol: Int, toRow: Int){
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

    fun pieceAt(col: Int, row: Int) : ChessPiece?{
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