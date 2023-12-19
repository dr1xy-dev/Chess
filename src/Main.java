public class Main {
    public static void main(String[] args) {
        Chess board = new Chess();
        board.listBoard();

        King king = new King(true);
        boolean moveCheck = king.move("d7");
        if (moveCheck == false) {
            System.out.println("not legal");
        } else {
            System.out.println("legal");
        }

        Queen queen = new Queen(false);
        queen.move("a2");
    }
}