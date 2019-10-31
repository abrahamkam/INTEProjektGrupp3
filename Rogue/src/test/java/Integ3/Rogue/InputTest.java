package Integ3.Rogue;


import org.junit.Test;
import org.mockito.Mock;

import javax.swing.*;
import java.awt.event.KeyEvent;

import static java.awt.event.KeyEvent.*;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class InputTest {


    @Test
    public void wTest() {
        GameScreen screen = new GameScreen(10,10,20,20);
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_W, 'w');
        screen.inputHandling(key);
        assertEquals(11,screen.getPlayer().getY());
    }


    @Test
    public void sTest() {
        GameScreen screen = new GameScreen(10,10,20,20);
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_S, 's');
        screen.inputHandling(key);
        assertEquals(9,screen.getPlayer().getY());
    }

    @Test
    public void dTest() {
        GameScreen screen = new GameScreen(10,10,20,20);
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_D, 'd');
        screen.inputHandling(key);
        assertEquals(11,screen.getPlayer().getX());
    }

    @Test
    public void aTest() {
        GameScreen screen = new GameScreen(10,10,20,20);
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_A, 'a');
        screen.inputHandling(key);
        assertEquals(9,screen.getPlayer().getX());
    }

    @Test
    public void spaceTest(){
        GameScreen screen = new GameScreen(10,10,20,20);
        GameScreen screenspy = spy(screen);
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_SPACE, 'a');
        screenspy.inputHandling(key);
        verify(screenspy, times(1)).playerShoot();
    }

    /*
    @Mock
    GameScreen mockedGameScreen;
    @Mock
    Player mockedPlayer;
    @Test
    public void spaceMockTest(){
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_W, 'w');
        when(mockedGameScreen.getPlayer()).thenReturn(mockedPlayer);
        mockedGameScreen.inputHandling(key);
        mockedPlayer.move(0,1);
        verify(mockedPlayer, times(1)).move(0,1);
    }

    @Test
    public void wTest() {
        Main main = new Main();
        Main mainspy = spy(main);
        mainspy.setupGame();
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_W, 'w');
        mainspy.inputHandling(key);
        verify(mainspy).getScreen().getPlayer().move(0, 1);
    }

    @Test
    public void sTest() {
        Main main = new Main();
        Main mainspy = spy(main);
        mainspy.setupGame();
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_S, 's');
        mainspy.inputHandling(key);
        verify(mainspy).getScreen().getPlayer().move(5, -1);
    }

    @Test
    public void dTest() {
        Main main = new Main();
        Main mainspy = spy(main);
        mainspy.setupGame();
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_D, 'd');
        mainspy.inputHandling(key);
        verify(mainspy).getScreen().getPlayer().move(1, 1);
    }

    @Test
    public void aTest() {
        Main main = new Main();
        Main mainspy = spy(main);
        mainspy.setupGame();
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_A, 'a');
        mainspy.inputHandling(key);
        verify(mainspy).getScreen().getPlayer().move(-1, 0);
    }

    @Test
    public void spaceTest(){
        Main main = new Main();
        Main mainspy = spy(main);
        mainspy.setupGame();
        KeyEvent key = new KeyEvent(new JFrame(), KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, VK_SPACE, 'a');
        mainspy.inputHandling(key);
        verify(mainspy).getScreen().playerShoot();
    }*/

}
