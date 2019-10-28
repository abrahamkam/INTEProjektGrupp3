package Integ3.Rogue;

import java.awt.event.KeyEvent;

public class Main {
    private GameScreen screen;

    public static void main(String[] args) {
        Main main = new Main();
        main.setupGame();
    }

    public void inputHandling(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                getScreen().getPlayer().move(0, 1);
                break;
            case KeyEvent.VK_S:
                getScreen().getPlayer().move(0, -1);
                break;
            case KeyEvent.VK_D:
                getScreen().getPlayer().move(1, 0);
                break;
            case KeyEvent.VK_A:
                getScreen().getPlayer().move(-1, 0);
                break;
            case KeyEvent.VK_SPACE:
                getScreen().getPlayer().shoot(screen.getEnemy());
        }
    }

    public void setupGame() {
        screen = new GameScreen(50, 50, 10, 10);
    }

    public void run() {
        while (true) {

        }
    }


    public GameScreen getScreen() {
        return screen;
    }

    public void setScreen(GameScreen gs) {
        this.screen = gs;
    }
}
