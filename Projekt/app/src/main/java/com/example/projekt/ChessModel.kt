package com.example.projekt

class ChessModel {
    var piecesBox = mutableSetOf<ChessPiece>()

    init {
        reset()
    }

    fun reset(){
        piecesBox.removeAll(piecesBox)
        for (i in 0..1){
            piecesBox.add(ChessPiece(0 + i * 7, row = 0, Player.WHITE, ChessMan.ROOK, R.drawable.rook_white))
            piecesBox.add(ChessPiece(0 + i * 7, row = 7, Player.BLACK, ChessMan.ROOK, R.drawable.rook_black))

            piecesBox.add(ChessPiece(1 + i * 5, row = 0, Player.WHITE, ChessMan.KNIGHT, R.drawable.knight_white))
            piecesBox.add(ChessPiece(1 + i * 5, row = 7, Player.BLACK, ChessMan.KNIGHT, R.drawable.knight_black))

            piecesBox.add(ChessPiece(2 + i * 3, row = 0, Player.WHITE, ChessMan.BISHOP, R.drawable.bishop_white))
            piecesBox.add(ChessPiece(2 + i * 3, row = 7, Player.BLACK, ChessMan.BISHOP, R.drawable.bishop_black))
        }

        for (i in 0..7){
            piecesBox.add(ChessPiece(i, row = 1, Player.WHITE, ChessMan.PAWN, R.drawable.pawn_white))
            piecesBox.add(ChessPiece(i, row = 6, Player.BLACK, ChessMan.PAWN, R.drawable.pawn_black))
        }

        piecesBox.add(ChessPiece(3, row = 0, Player.WHITE, ChessMan.QUEEN, R.drawable.queen_white))
        piecesBox.add(ChessPiece(3, row = 7, Player.BLACK, ChessMan.QUEEN, R.drawable.queen_black))

        piecesBox.add(ChessPiece(4, row = 0, Player.WHITE, ChessMan.KING, R.drawable.king_white))
        piecesBox.add(ChessPiece(4, row = 7, Player.BLACK, ChessMan.KING, R.drawable.king_black))

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