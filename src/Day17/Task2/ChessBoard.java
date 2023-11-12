package Day17.Task2;


public class ChessBoard {
    static final int CHESS_BOARD_SIZE = 8;
    ChessPiece[][] array;

    ChessBoard(ChessPiece[][] array){
        this.array = array;
    }

    public void print(){
        for (ChessPiece[] chessPieces : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(chessPieces[j]);
            }
            System.out.println();
        }
    }
}
