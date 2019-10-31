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
        verify(spyScreen).gameOver();
        assertTrue(spyScreen.playerShoot());

    }
    @Test
    public void playerShootFalseTest(){
        GameScreen screen = new GameScreen(10,100,10,0);
        GameScreen spyScreen = spy(screen);
        spyScreen.getPlayer().setDirection(Player.Direction.SOUTH);
        verifyNoInteractions().gameOver();
        assertFalse(spyScreen.playerShoot());

    }

    @Test
    public void isCollissionWithEnemyTest(){
        GameScreen screen = new GameScreen(10,1,10,0);
        GameScreen spyScreen = spy(screen);
        spyScreen.moveEnemy();
        spyScreen.isCollisionWithEnemy();
        verify(spyScreen).gameOver();
        assertFalse(spyScreen.playerShoot());
    }

    @Test
    public void noCollissionWithEnemyTest(){
        GameScreen screen = new GameScreen(10,200,10,0);
        GameScreen spyScreen = spy(screen);
        spyScreen.moveEnemy();
        spyScreen.isCollisionWithEnemy();
        verifyNoInteractions(spyScreen).gameOver();
        assertFalse(spyScreen.playerShoot());
    }

}
