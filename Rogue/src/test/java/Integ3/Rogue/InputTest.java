package Integ3.Rogue;

import org.junit.Test;

import java.awt.event.KeyEvent;

import static org.junit.Assert.assertTrue;

public class InputTest {

    private Main main = new Main();

    @Test
    public void wTest() {
        Player player = main.getScreen().getPlayer();
        assertTrue(true);
    }

}
