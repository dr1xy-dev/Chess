public class Pawn extends Piece {
    private static final String name = "Pawn";
    private static final char symbol = 'p';

    private boolean firstMove = true;
    private boolean isBlack;

    public Pawn(boolean isBlack, String position) {
        super(name, position, symbol);
        this.isBlack = isBlack;
    }

    public void move(String newPosition) {
        // split string for position information
        int midPoint = position.length() / 2;
        // row column info is in [1] and column info in row [0]
        String[] currPos = {position.substring(0, midPoint), position.substring(midPoint)};

        // split string of new info
        int mid = newPosition.length() / 2;
        String[] newPos = {newPosition.substring(0, mid), newPosition.substring(mid)};

        // a
        if (newPos[0].charAt(0) > currPos[0].charAt(0) || newPos[0].charAt(0) < currPos[0].charAt(0)) {
            System.out.println("not legal");

        } else if (firstMove && isBlack && Integer.parseInt(newPos[1]) >= Integer.parseInt(currPos[1]) - 2) {
            // can move 2 if isblack
            System.out.println("legal");
            firstMove = false;

        } else if (firstMove && isBlack == false && Integer.parseInt(newPos[1]) <= Integer.parseInt(currPos[1]) + 2) {
            System.out.println("legal");
            firstMove = false;

        } else if (firstMove == false && isBlack && Integer.parseInt(newPos[1]) >= Integer.parseInt(currPos[1]) - 1) {
            System.out.println("legal");

        } else if (firstMove == false && isBlack == false && Integer.parseInt(newPos[1]) <= Integer.parseInt(currPos[1]) + 1) {
            System.out.println("legal");

        } else {
            System.out.println("not legal");
        }
    }
}
