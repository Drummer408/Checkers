package pieces;

import java.awt.Color;

import javax.swing.ImageIcon;

import checkersboard.CheckersBoard;

public abstract class CheckersPiece {
    public static final int NORMAL_MOVE_DIAGAONAL_LENGTH = 1;
    public static final int JUMP_MOVE_DIAGONAL_LENGTH = 2;

    private Color color;
    private ImageIcon representation;
    private int x, y;

    public CheckersPiece(Color colorInit, ImageIcon representationInit, int xInit, int yInit) {
        setColor(colorInit);
        setRepresentation(representationInit);
        setX(xInit);
        setY(yInit);
    }

    public void updatePosition(int newX, int newY) {
        setX(newX);
        setY(newY);
    }

    public boolean move(CheckersBoard board, int moveToX, int moveToY) {
        if (isPositionFreeToMoveTo(board, moveToX, moveToY)) {
            if (isMoveNormal(moveToX, moveToY)) {
                updatePosition(moveToX, moveToY);
                return true;
            }
            if (isMoveJump(moveToX, moveToY)) {
                
                return true;
            }
        }
        return false;
    }

    public boolean isPositionFreeToMoveTo(CheckersBoard board, int moveToX, int moveToY) {
        return board.isPositionFree(moveToX, moveToY);
    }

    public boolean isMoveNormal(int moveToX, int moveToY) {
        return isMoveValid(moveToX, moveToY, NORMAL_MOVE_DIAGAONAL_LENGTH);
    }

    public boolean isMoveJump(int moveToX, int moveToY) {
        return isMoveValid(moveToX, moveToY, JUMP_MOVE_DIAGONAL_LENGTH);
    }

    private boolean isMoveValid(int moveToX, int moveToY, int moveLength) {
        return Math.abs(x - moveToX) == moveLength && Math.abs(y - moveToY) == moveLength;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ImageIcon getRepresentation() {
        return representation;
    }

    public void setRepresentation(ImageIcon representation) {
        this.representation = representation;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
