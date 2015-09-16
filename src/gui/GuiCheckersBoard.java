package gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GuiCheckersBoard extends JPanel {
    /**
     * STANDARD JAVA CONVENTION
     */
    private static final long serialVersionUID = 1L;

    private static final int BOARD_WIDTH = 8;
    private static final int BOARD_HEIGHT = 8;

    private JButton[][] checkersSquares;

    public GuiCheckersBoard() {
        setupCheckersBoard();
    }

    private void setupCheckersBoard() {
        setupGridLayout();
        initializeCheckersSquares();
        setupCheckersSquares();
        this.setVisible(true);
    }

    private void setupGridLayout() {
        GridLayout gridLayout = new GridLayout(BOARD_WIDTH, BOARD_HEIGHT);
        this.setLayout(gridLayout);
    }

    private void initializeCheckersSquares() {
        checkersSquares = new JButton[BOARD_WIDTH][BOARD_HEIGHT];
        Color color = Color.white;
        for (int i = 0; i < BOARD_WIDTH; i++) {
            for (int j = 0; j < BOARD_HEIGHT; j++) {
                checkersSquares[i][j] = new JButton();
                color = toggleColor(color);
                checkersSquares[i][j].setBackground(color);
            }
            color = toggleColor(color);
        }
    }

    private Color toggleColor(Color color) {
        Color newColor = color == Color.black ? Color.white : Color.black;
        return newColor;
    }

    private void setupCheckersSquares() {
        for (int i = 0; i < BOARD_WIDTH; i++) {
            for (int j = 0; j < BOARD_HEIGHT; j++) {
                this.add(checkersSquares[i][j]);
            }
        }
    }
}
