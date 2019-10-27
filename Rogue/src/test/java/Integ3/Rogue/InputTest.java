package Integ3.Rogue;

import org.junit.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

import static java.awt.event.KeyEvent.*;

public class InputTest {


    @Test
    public void wTest() throws AWTException{
        Main main = new Main();
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_W, 'w');
        main.inputHandling(key);
    }
    @Test
    public void sTest() throws AWTException{
        Main main = new Main();
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_S, 's');
        main.inputHandling(key);
    }
    @Test
    public void dTest() throws AWTException{
        Main main = new Main();
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_D, 'd');
        main.inputHandling(key);
    }
    @Test
    public void aTest() throws AWTException{
        Main main = new Main();
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_A, 'a');
        main.inputHandling(key);
    }

}
