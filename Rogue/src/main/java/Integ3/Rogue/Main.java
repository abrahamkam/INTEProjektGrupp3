package Integ3.Rogue;

/**
 * Hello world!
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Main extends JFrame {
    private int score;
    private GameScreen screen;

    public static void main(String[] args) {
        Main main = new Main();
        main.setupGame();
        main.run();

    }

    public void inputHandling(KeyEvent e) {
    }

    public void setupGame() {
        screen = new GameScreen(50, 50, 10, 10);
    }

    public void run() {
        while (true) {

        }
    }

    public int getScore() {
        return score;
    }

    public GameScreen getScreen() {
        return screen;
    }

    public void setScreen(GameScreen gs) {
        this.screen = gs;
    }
}
