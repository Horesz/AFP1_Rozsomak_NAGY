package com.example.projekt

class ChessModel {
    var piecesBox = mutableSetOf<ChessPiece>()

    init {
        piecesBox.add(ChessPiece(col = 0, row = 0, Player.WHITE, ChessMan.ROOK))
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
            for (col in 0..7) {
                val piece = pieceAt(col,row)
                if (piece == null){
                    desc += " ."
                } else{
                    val white = piece.player == Player.WHITE
                    desc += " "
                    when (piece.man){
                        ChessMan.KING -> {desc += if(piece.player == Player.WHITE) " k" else " K"}
                        ChessMan.QUEEN -> {desc += if(piece.player == Player.WHITE) " q" else " Q"}
                        ChessMan.BISHOP -> {desc += if(piece.player == Player.WHITE) " b" else " B"}
                        ChessMan.ROOK -> {desc += if(piece.player == Player.WHITE) " r" else " R"}
                        ChessMan.KNIGHT -> {desc += if(piece.player == Player.WHITE) " n" else " N"}
                        ChessMan.PAWN -> {desc += if(piece.player == Player.WHITE) " p" else " P"}
                    }
                }
            }
            desc += "\n"
        }
        desc += "  0 1 2 3 4 5 6 7"

        return desc
    }
}