import java.util.Arrays;

public class Bishop extends Piece {
    private static final String name = "Bishop";
    private static final char symbol = 'b';

    private boolean isBlack = false;

    public Bishop(boolean isBlack, String position) {
        super(name, position, symbol);
    }

    public void move(String newPosition) {
        String topColumnBoundary = "h";
        String lowColumnBoundary = "a";

        // split string for position information
        int midPoint = position.length() / 2;
        // row column info is in [1] and column info in row [0]
        String[] currPos = {position.substring(0, midPoint), position.substring(midPoint)};

        // split string of new info
        int mid = newPosition.length() / 2;
        String[] newPos = {newPosition.substring(0, midPoint), newPosition.substring(midPoint)};

        // differences in difference
        int rowDistance = Integer.parseInt(newPos[1]) - Integer.parseInt(currPos[1]);
        int columnDistance = newPos[0].charAt(0) - currPos[0].charAt(0);

        if (newPos[0].charAt(0) > topColumnBoundary.charAt(0) || newPos[0].charAt(0) < lowColumnBoundary.charAt(0) || Integer.parseInt(newPos[1]) > 8 || Integer.parseInt(newPos[1]) < 1) {
            System.out.println("not legal as it is out of bounds");

        } else if (!(rowDistance == columnDistance)) {
            System.out.println("not legal");

        } else if (newPos[0].charAt(0) > currPos[0].charAt(0) && Integer.parseInt(newPos[1]) > Integer.parseInt(currPos[1])) {
            System.out.println("legal");

        } else if (newPos[0].charAt(0) < currPos[0].charAt(0) && Integer.parseInt(newPos[1]) > Integer.parseInt(currPos[1])) {
            System.out.println("legal");

        } else if (newPos[0].charAt(0) < currPos[0].charAt(0) && Integer.parseInt(newPos[1]) < Integer.parseInt(currPos[1])) {
            System.out.println("legal");

        } else if (newPos[0].charAt(0) < currPos[0].charAt(0) && Integer.parseInt(newPos[1]) < Integer.parseInt(currPos[1])) {
            System.out.println("legal");

        } else {
            System.out.println("not legal");
        }
    }

}
