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

    public boolean move(String newPosition) {
        String topColumnBoundary = "h";
        String lowColumnBoundary = "a";

        // split string for position information
        int midPoint = position.length()/2;
        // row column info is in [1] and column info in row [0]
        String[] currPos = {position.substring(0, midPoint), position.substring(midPoint)};

        // split string of new info
        int mid = newPosition.length()/2;
        String[] newPos = {newPosition.substring(0, midPoint), newPosition.substring(midPoint)};

        // legal moves
        // . ^ .
        // < . >
        // . ` .

        if (newPos[0].charAt(0) > topColumnBoundary.charAt(0) || newPos[0].charAt(0) < lowColumnBoundary.charAt(0) || Integer.parseInt(newPos[1]) < 1 || Integer.parseInt(newPos[1]) > 8) {
            // out of bounds
            return false;
        } else if (Integer.parseInt(newPos[1]) > Integer.parseInt(currPos[1]) + 1 || Integer.parseInt(newPos[1]) < Integer.parseInt(currPos[1]) - 1) {
            // does not move more than 1 square
            return false;
        } else if (newPos[0].charAt(0) > currPos[0].charAt(0) + 1 || newPos[0].charAt(0) < currPos[0].charAt(0) - 1) {
            // does not move more than one diagonal or one column
            return false;
        } else {
            return true;
        }
    }
}
