package Integ3.Rogue;

import org.junit.Test;
import static org.junit.Assert.*;

import static org.mockito.Mockito.*;


public class GameLoopTest {

    Main main;
    @Test
    public void playerShootTrueTest(){
        GameScreen screen = new GameScreen(10,100,10,0);
        GameScreen spyScreen = spy(screen);
        spyScreen.getPlayer().setDirection(Player.Direction.NORTH);
        spyScreen.playerShoot();
        verify(spyScreen, times(1)).playerShoot();
        verify(spyScreen, times(1)).gameOver();
    }

    @Test
    public void playerShootFalseTest() {
        GameScreen screen = new GameScreen(10, 100, 10, 0);
        GameScreen spyScreen = spy(screen);
        spyScreen.getPlayer().setDirection(Player.Direction.SOUTH);
        spyScreen.playerShoot();
        verify(spyScreen, times(1)).playerShoot();
        verify(spyScreen, times(0)).gameOver();
    }

    @Test
    public void isCollissionWithEnemyTest(){
        GameScreen screen = new GameScreen(10,1,10,0);
        GameScreen spyScreen = spy(screen);
        spyScreen.gameLoop(false);
        verify(spyScreen).gameOver();
        assertTrue(spyScreen.isCollisionWithEnemy());
    }

    @Test
    public void noCollissionWithEnemyTest(){
        GameScreen screen = new GameScreen(10,200,10,0);
        GameScreen spyScreen = spy(screen);
        spyScreen.gameLoop(false);
        verify(spyScreen,times(0)).gameOver();
        assertFalse(spyScreen.isCollisionWithEnemy());
    }

}
