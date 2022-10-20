import java.math.BigInteger

val notation = listOf("pa3", "qc5")

fun main(){

    val gameState = notation.map{ Piece.generatePiece(it)}

}

sealed class Piece(val position: String){
    companion object{
        fun generatePiece(piece: String): Piece{

            val pieceType = piece[0]
            val position = piece.drop(1)

            return when(pieceType){
                'p' -> Pawn(position)
                'q' -> Queen(position)
                else -> error("Unknown piece")
            }
        }
    }
}



class Pawn(position: String): Piece(position)
class Queen(position: String): Piece(position)