package Integ3.Rogue;

import org.junit.Test;

import java.awt.event.KeyEvent;

import static org.junit.Assert.*;

public class SetupTest {


    @Test
    public void screenTest() {
        Main main = new Main();
        main.setupGame();
        assertNotNull(main.getScreen());
    }

    @Test
    public void spawnTest() {
        int playerX = 10, playerY = 10, enemyX = 10, enemyY = 10;
        GameScreen screen = new GameScreen(playerX, playerY, enemyX, enemyY);
        assertEquals(screen.getPlayer().getX(),playerX);
        assertEquals(screen.getPlayer().getY(),playerY);
        assertEquals(screen.getEnemy().getX(),enemyX);
        assertEquals(screen.getEnemy().getY(),enemyY);

    }

    @Test
    public void enemyNotNullTest() {
        Main main = new Main();
        main.setupGame();
        assertNotNull(main.getScreen().getEnemy());
    }
}
