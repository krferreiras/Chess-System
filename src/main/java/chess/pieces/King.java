package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

//  Peça King (Rei)
public class King extends ChessPiece {

    public King(Board board, Color color){
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }

    @Override
    public boolean[][] possibleMove() {
        return new boolean[getBoard().getRows()][getBoard().getColumns()];
    }
}
