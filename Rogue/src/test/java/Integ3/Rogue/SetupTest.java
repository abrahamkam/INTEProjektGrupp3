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
    public void playerNotNullTest() {
        Main main = new Main();
        main.setupGame();
        assertNotNull(main.getScreen().getPlayer());
    }
    @Test
    public void enemyNotNullTest() {
        Main main = new Main();
        main.setupGame();
        assertNotNull(main.getScreen().getEnemy());
    }
}
