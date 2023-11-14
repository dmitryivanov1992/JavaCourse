package Day17.Task2;

public class Task2 {
    public static void main(String[] args) {

        ChessPiece[][] figures = new ChessPiece[ChessBoard.CHESS_BOARD_SIZE][ChessBoard.CHESS_BOARD_SIZE];

        for (int i = 0; i < ChessBoard.CHESS_BOARD_SIZE; i++) {
            for (int j = 0; j < ChessBoard.CHESS_BOARD_SIZE; j++) {
                figures[i][j] = ChessPiece.EMPTY;
            }
        }
        figures[0][0] = ChessPiece.ROOK_BLACK;
        figures[0][5] = ChessPiece.ROOK_BLACK;
        figures[0][6] = ChessPiece.KING_BLACK;
        figures[1][1] = ChessPiece.ROOK_WHITE;
        figures[1][4] = ChessPiece.PAWN_BLACK;
        figures[1][5] = ChessPiece.PAWN_BLACK;
        figures[1][7] = ChessPiece.PAWN_BLACK;
        figures[2][0] = ChessPiece.PAWN_BLACK;
        figures[2][2] = ChessPiece.KNIGHT_BLACK;
        figures[2][6] = ChessPiece.PAWN_BLACK;
        figures[3][0] = ChessPiece.QUEEN_BLACK;
        figures[3][3] = ChessPiece.BISHOP_WHITE;
        figures[4][3] = ChessPiece.BISHOP_BLACK;
        figures[4][4] = ChessPiece.PAWN_WHITE;
        figures[5][4] = ChessPiece.BISHOP_WHITE;
        figures[5][5] = ChessPiece.PAWN_WHITE;
        figures[6][0] = ChessPiece.PAWN_WHITE;
        figures[6][3] = ChessPiece.QUEEN_WHITE;
        figures[6][5] = ChessPiece.PAWN_WHITE;
        figures[6][7] = ChessPiece.PAWN_WHITE;
        figures[7][5] = ChessPiece.ROOK_WHITE;
        figures[7][6] = ChessPiece.KING_WHITE;

        ChessBoard myBoard = new ChessBoard(figures);
        myBoard.print();
    }
}
