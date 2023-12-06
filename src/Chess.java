public class Chess {
    Piece[][] chessBoard = new Piece[8][8];
    //0 0 0 0 0 0 0 0
    //0 0 0 0 0 0 0 0
    //0 0 0 0 0 0 0 0
    //0 0 0 0 0 0 0 0
    //0 0 0 0 0 0 0 0
    //0 0 0 0 0 0 0 0
    //0 0 0 0 0 0 0 0
    //0 0 0 0 0 0 0 0
    String[] boardColumns = {"a","b","c","d","e","f","g","h"};
    public Chess() {
        // black pieces
        King king = new King(true);
        chessBoard[0][4] = king;
        Queen queen = new Queen(true);
        chessBoard[0][3] = queen;

        Bishop bishop = new Bishop(true, "c8");
        Bishop bishop2 = new Bishop(true, "f8");
        chessBoard[0][2] = bishop;
        chessBoard[0][5] = bishop2;

        Knight knight = new Knight(true, "b8");
        chessBoard[0][1] = knight;
        Knight knight2 = new Knight(true, "g8");
        chessBoard[0][6] = knight2;

        Rook rook = new Rook(true, "a8");
        chessBoard[0][7] = rook;
        Rook rook1 = new Rook(true, "h8");
        chessBoard[0][0] = rook1;

        // black pawns
        for (int rows = 0; rows < chessBoard.length; rows++) {
            if (rows == 1) {
                for (int columns = 0; columns < chessBoard[rows].length; columns++) {
                    String position = boardColumns[columns] + "7";
                    Pawn pawn = new Pawn(true, position);
                    chessBoard[rows][columns] = pawn;
                }
            } else if (rows > 1) {
                break;
            }
        }

        // white pieces
        King king1 = new King(false);
        chessBoard[7][4] = king1;
        Queen queen1 = new Queen(false);
        chessBoard[7][3] = queen1;

        Bishop bishop1 = new Bishop(false,"c1");
        chessBoard[7][2] = bishop1;
        Bishop bishop3 = new Bishop(false, "f1");
        chessBoard[7][5] = bishop3;

        Knight knight1 = new Knight(false, "b1");
        chessBoard[7][1] = knight1;
        Knight knight3 = new Knight(false, "g1");
        chessBoard[7][6] = knight3;

        Rook rook2 = new Rook(false, "a1");
        chessBoard[7][7] = rook2;
        Rook rook3 = new Rook(false, "h1");
        chessBoard[7][0] = rook3;

        // white pawns
        for (int x = 0; x < chessBoard.length; x++) {
            if (x == 6) {
                for (int c = 0; c < chessBoard[x].length; c++) {
                    String position = boardColumns[c] + "2";
                    Pawn pawn = new Pawn(false, position);
                    chessBoard[x][c] = pawn;
                }
            }
        }
    }

    public void listBoard() {
        for (Piece[] pieces : chessBoard) {
            for (int columns = 0; columns < chessBoard.length; columns++) {
                if (!(pieces[columns] == null)) {
                    pieces[columns].getSymbol();
                }
            }
            System.out.println();
        }
    }

    public void listPositions() {
        for (Piece[] pieces : chessBoard) {
            for (int columns = 0; columns < chessBoard.length; columns++) {
                if (!(pieces[columns] == null)) {
                    pieces[columns].getPosition();
                }
            }
            System.out.println();
        }
    }
}
