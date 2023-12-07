public class Piece {
    private String name;
    protected String position;

    private char symbol;

    public Piece(String name, String position, char symbol) {
        this.name = name;
        this.position = position;
        this.symbol = symbol;
    }

    public void getPosition() {
        System.out.println(name + " is on " + position);
    }

    public void getSymbol() {
        System.out.print(symbol);
    }

    public void setSymbol(char newSymbol) {
        this.symbol = newSymbol;
    }

}
