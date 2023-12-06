public class Pawn extends Piece {
    private static final String name = "Pawn";
    private static final char symbol = 'p';

    public Pawn(boolean isBlack, String position) {
        super(name, position, symbol);
    }
}
