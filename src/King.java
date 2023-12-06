public class King extends Piece {
    private static final String name = "King";
    private static final char symbol = 'K';
    private static String position = "e8";

    public King(boolean isBlack) {
        super(name, position, symbol);

        if (!isBlack) {
            super.position = "e1";
        }
    }
}
