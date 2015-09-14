package CheckersBoard;

public class NormalCheckersBoard implements CheckersBoard {
    private static final int BOARD_WIDTH = 8;
    private static final int BOARD_HEIGHT = 8;

    private CheckersSquare[][] board;

    public NormalCheckersBoard() {
        board = new CheckersSquare[BOARD_WIDTH][BOARD_HEIGHT];
    }

    @Override
    public void initializeBoard() {
        
    }

    @Override
    public int getBoardWidth() {
        return BOARD_WIDTH;
    }

    @Override
    public int getBoardHeight() {
        return BOARD_HEIGHT;
    }

    @Override
    public CheckersSquare[][] getBoard() {
        return board;
    }

    @Override
    public boolean isPositionFree(int x, int y) {
        return board[x][y].isEmpty();
    }
}
