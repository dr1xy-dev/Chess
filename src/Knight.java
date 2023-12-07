public class Knight extends Piece{
    private static final String name = "Knight";
    private static final char symbol = 'k';

    public Knight(boolean isBlack, String position) {
        super(name, position, symbol);
    }

    public void move(String newPosition) {
        // split string for position information
        int midPoint = position.length()/2;
        // row column info is in [1] and column info in row [0]
        String[] currPos = {position.substring(0, midPoint), position.substring(midPoint)};

        // split string of new info
        int mid = newPosition.length()/2;
        String[] newPos = {position.substring(0, midPoint), position.substring(midPoint)};
    }

}
