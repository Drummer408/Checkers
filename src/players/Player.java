package players;

import java.awt.Color;

public class Player {
    private String username;
    private Color color;

    public Player(String username, Color color) {
        this.username = username;
        this.color = color;
    }

    public String getUsername() {
        return username;
    }

    public Color getColor() {
        return color;
    }
}
