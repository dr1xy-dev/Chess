public class Queen extends Piece {
    private static final String name = "Queen";
    private static String position = "d8";
    private static final char symbol = 'Q';

    public Queen(boolean isBlack) {
        super(name, position, symbol);

        if (!isBlack) {
            super.position = "d1";
        }
    }
}
