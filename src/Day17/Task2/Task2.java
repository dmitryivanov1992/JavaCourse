package Day17.Task2;

public class Task2 {
    public static void main(String[] args) {

        ChessPiece[][] figures = new ChessPiece[ChessBoard.CHESS_BOARD_SIZE][ChessBoard.CHESS_BOARD_SIZE];
        String chessPlay = "♜____♜♚_\n" +
                "_♖__♟♟_♟\n" +
                "♟_♞___♟_\n" +
                "♛__♗____\n" +
                "___♝♙___\n" +
                "____♗♙__\n" +
                "♙__♕_♙_♙\n" +
                "_____♖♔_\n";
        String[] chessPlayArray = chessPlay.split("\n");

        for (int i = 0; i < ChessBoard.CHESS_BOARD_SIZE; i++) {
            char[] line = chessPlayArray[i].toCharArray();
            for (int j = 0; j < ChessBoard.CHESS_BOARD_SIZE; j++) {
                figures[i][j] = ChessPiece.getNameBySymbol(String.valueOf(line[j]));
            }
        }

        ChessBoard myBoard = new ChessBoard(figures);
        myBoard.print();
    }
}
