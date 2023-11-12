package Day17.Task1;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] figures =new ChessPiece[] {ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};

        for (ChessPiece ch: figures) {
            System.out.print(ch);
        }

    }
}
