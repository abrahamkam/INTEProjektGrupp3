package Integ3.Rogue;

import java.awt.event.KeyEvent;

public class Main {
    private static GameScreen screen;

    public static void main(String[] args) {
        Main main = new Main();
        main.setupGame();
    }
  
    public void setupGame() {
        screen = new GameScreen(50, 50, 10, 10);
    }

    public GameScreen getScreen() {

        return screen;
    }
}
