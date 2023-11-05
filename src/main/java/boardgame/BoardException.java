package boardgame;

//	Classe para tratamento de exceções

public class BoardException  extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public BoardException(String msg){
        super(msg);
    }
}
