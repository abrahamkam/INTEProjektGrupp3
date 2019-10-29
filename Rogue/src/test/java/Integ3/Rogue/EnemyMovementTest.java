package Integ3.Rogue;

import org.junit.Test;

import static org.junit.Assert.*;

public class EnemyMovementTest {
    private Enemy enemy;
    private Player player;

    //Testing cardinal directions
    @Test
    public void enemyMoveNorthTest() {

        GameScreen screen = new GameScreen(0, 1, 0, 0);
        player = screen.getPlayer();
        enemy = screen.getEnemy();
        screen.moveEnemy();
        assertEquals(enemy.getY(),player.getY());
    }

    @Test
    public void enemyMoveSouthTest() {
        GameScreen screen = new GameScreen(0, -1,0, 0);
        player = screen.getPlayer();
        enemy = screen.getEnemy();

        screen.moveEnemy();
        assertTrue(enemy.getY() == player.getY());
    }

    @Test
    public void enemyMoveEastTest() {
        GameScreen screen = new GameScreen(1, 0,0, 0);
        player = screen.getPlayer();
        enemy = screen.getEnemy();
        screen.moveEnemy();
        assertTrue(enemy.getX() == player.getX());
    }

    @Test
    public void enemyMoveWestTest() {
        GameScreen screen = new GameScreen(-1, 0,0, 0);
        player = screen.getPlayer();
        enemy = screen.getEnemy();

        screen.moveEnemy();
        ;
        assertTrue(enemy.getX() == player.getX());
    }

    //Test combo directions

    @Test
    public void moveNorthEastTest() {
        GameScreen screen = new GameScreen(1, 1,0, 0);
        player = screen.getPlayer();
        enemy = screen.getEnemy();
        screen.moveEnemy();
        assertTrue((enemy.getY() == player.getY()) && (enemy.getX() == player.getX()));
    }

    @Test
    public void moveNorthWestTest() {
        GameScreen screen = new GameScreen(-1, 1,0, 0);
        player = screen.getPlayer();
        enemy = screen.getEnemy();
        screen.moveEnemy();
        assertTrue((enemy.getY() == player.getY()) && (enemy.getX() == player.getX()));
    }

    @Test
    public void moveSouthEastTest() {
        GameScreen screen = new GameScreen(1, -1,0, 0);
        player = screen.getPlayer();
        enemy = screen.getEnemy();

        screen.moveEnemy();
        assertTrue((enemy.getY() == player.getY()) && (enemy.getX() == player.getX()));
    }

    @Test
    public void moveSouthWestTest() {
        GameScreen screen = new GameScreen(-1, -1,0, 0);
        player = screen.getPlayer();
        enemy = screen.getEnemy();

        screen.moveEnemy();
        assertTrue((enemy.getY() == player.getY()) && (enemy.getX() == player.getX()));
    }
}
