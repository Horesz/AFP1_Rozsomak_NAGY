package com.example.projekt

object ChessGame {
    var piecesBox = mutableSetOf<ChessPiece>()



    init {
        reset()
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
        piecesBox.add(movingPiece.copy(col = toCol, row = toRow))

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