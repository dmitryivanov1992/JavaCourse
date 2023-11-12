package Day17.Task2;

public enum ChessPiece {
    KING_WHITE(100, "♔"), QUEEN_WHITE(9, "♕"), ROOK_WHITE(5, "♖"),
    BISHOP_WHITE(3.5f, "♗"), KNIGHT_WHITE(3, "♘"), PAWN_WHITE(1, "♙"),
    KING_BLACK(100, "♚"), QUEEN_BLACK(9, "♛"), ROOK_BLACK(5, "♜"),
    BISHOP_BLACK(3.5f, "♝"), KNIGHT_BLACK(3, "♞"), PAWN_BLACK(1, "♟"),
    EMPTY(-1,"_");

    private final float valuation;
    private final String symbol;

    ChessPiece(float valuation, String symbol) {
        this.valuation = valuation;
        this.symbol = symbol;
    }
    public String toString(){
        return symbol;
    }

    public static ChessPiece getNameBySymbol(String symbol){
        return switch (symbol){
            case ("♔")->ChessPiece.KING_WHITE;
            case ("♕")->ChessPiece.QUEEN_WHITE;
            case ("♖")->ChessPiece.ROOK_WHITE;
            case ("♗")->ChessPiece.BISHOP_WHITE;
            case ("♘")->ChessPiece.KNIGHT_WHITE;
            case ("♙")->ChessPiece.PAWN_WHITE;
            case ("♚")->ChessPiece.KING_BLACK;
            case ("♛")->ChessPiece.QUEEN_BLACK;
            case ("♜")->ChessPiece.ROOK_BLACK;
            case ("♝")->ChessPiece.BISHOP_BLACK;
            case ("♞")->ChessPiece.KNIGHT_BLACK;
            case ("♟")->ChessPiece.PAWN_BLACK;
            default -> ChessPiece.EMPTY;
        };
    }
}
