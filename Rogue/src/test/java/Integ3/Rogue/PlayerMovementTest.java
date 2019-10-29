package Integ3.Rogue;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerMovementTest {

    Player player = new Player(0,0);

    @Test
    public void trueTest() {
        assertTrue(true);
    }


    @Test
    public void playerMoveUpTest() {
        int oldX = player.getX();
        int oldY = player.getY();
        
        player.move(0, 1);
        assertEquals((oldY + 1), player.getY());
        assertEquals(oldX, player.getX());
    }

    @Test
    public void playerMoveDownTest() {
        int oldX = player.getX();
        int oldY = player.getY();

        player.move(0, -1);
        assertEquals((oldY-1), player.getY());
        assertEquals(oldX, player.getX());
    }

    @Test
    public void playerMoveLeftTest() {
        int oldX = player.getX();
        int oldY = player.getY();

        player.move(-1, 0);
        assertEquals((oldX - 1), player.getX());
        assertEquals(oldY, player.getY());
    }

    @Test
    public void playerMoveRightTest() {
        int oldX = player.getX();
        int oldY = player.getY();

        player.move(1, 0);
        assertEquals((oldX + 1), player.getX());
        assertEquals(oldY, player.getY());
    }


}
