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

    public boolean move(String newPosition) {
        String topColumnBoundary = "h";
        String lowColumnBoundary = "a";

        // split string for position information
        int midPoint = position.length()/2;
        // row column info is in [1] and column info in row [0]
        String[] currPos = {position.substring(0, midPoint), position.substring(midPoint)};

        // split string of new info
        int mid = newPosition.length()/2;
        String[] newPos = {position.substring(0, midPoint), position.substring(midPoint)};

        if (Integer.parseInt(newPos[0]) > 8 || Integer.parseInt(newPos[0]) < 1) {
            // out of bounds
            return false;
        } else if (newPos[0].charAt(0) > topColumnBoundary.charAt(0) || newPos[0].charAt(0) < lowColumnBoundary.charAt(0)) {
            return false;
        } else {
            return true;
        }
    }
}
