package checkersboard;

public interface CheckersBoard {
    void initializeBoard();

    int getBoardWidth();
    int getBoardHeight();

    CheckersSquare[][] getBoard();

    boolean isPositionFree(int x, int y);
}
