package CheckersBoard;

import java.awt.Color;

import pieces.CheckersPiece;

public class CheckersSquare {
    private Color color;
    private int x, y;
    private CheckersPiece piece;

    public CheckersSquare(Color color, int x, int y, CheckersPiece piece) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.piece = piece;
    }

    public boolean isEmpty() {
        return piece == null;
    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public CheckersPiece getPiece() {
        return piece;
    }
}
