package Integ3.Rogue;

import static org.junit.Assert.*;
import org.junit.Test;

import javax.swing.*;
import java.awt.event.KeyEvent;

import static java.awt.event.KeyEvent.*;
import static org.mockito.Mockito.*;

public class InputTest {


    @Test
    public void wTest(){
        Main main = new Main();
        Main mainspy = spy(main);
        mainspy.setupGame();
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_W, 'w');
        mainspy.inputHandling(key);
        verify(mainspy).getScreen().getPlayer().move(0,1);
    }

    @Test
    public void sTest(){
        Main main = new Main();
        Main mainspy = spy(main);
        mainspy.setupGame();
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_S, 's');
        mainspy.inputHandling(key);
        verify(mainspy).getScreen().getPlayer().move(0,-1);
    }
    @Test
    public void dTest(){
        Main main = new Main();
        Main mainspy = spy(main);
        mainspy.setupGame();
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_D, 'd');
        mainspy.inputHandling(key);
        verify(mainspy).getScreen().getPlayer().move(1,1);
    }
    @Test
    public void aTest(){
        Main main = new Main();
        Main mainspy = spy(main);
        mainspy.setupGame();
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_A, 'a');
        mainspy.inputHandling(key);
        verify(mainspy).getScreen().getPlayer().move(-1,0);
    }

}
