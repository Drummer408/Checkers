package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainApplicationWindow extends JFrame {
    /**
    * STANDARD JAVA CONVENTION
     */
    private static final long serialVersionUID = 1L;

    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 600;

    public MainApplicationWindow() {
        setupFrame();
    }

    private void setupFrame() {
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addPanel(new GuiCheckersBoard());
        this.setVisible(true);
    }

    public void addPanel(JPanel panel) {
        this.add(panel);
    }

    public static void main(String[] args) {
        new MainApplicationWindow();
    }
}
