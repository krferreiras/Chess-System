package boardgame;

//	Classe de posições das peças

public abstract class Piece {

    protected Position position;
    private Board board;

    public Piece() {
    }

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMove();

    public boolean possibleMove(Position position){
        return possibleMove()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove(){
        boolean[][] matriz = possibleMove();
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(matriz[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
