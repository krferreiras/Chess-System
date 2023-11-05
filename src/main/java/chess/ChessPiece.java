package chess;

//	Classe para criação de peças do tipo peças de xadrez

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
