package Integ3.Rogue;

import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyMovementTest {
    private Enemy enemy;
    private Player player;

    //Testing cardinal directions
    @Test
    public void enemyMoveNorthTest(){
        player = new Player(0,1);
        enemy = new Enemy(0,0,player);
        enemy.move();
        assertTrue(enemy.y == player.y);
    }

    @Test
    public void enemyMoveSouthTest(){
        player = new Player(0,-1);
        enemy = new Enemy(0,0,player);
        enemy.move();
        assertTrue(enemy.y == player.y);
    }

    @Test
    public void enemyMoveEastTest(){
        player = new Player(1,0);
        enemy = new Enemy(0,0,player);
        enemy.move();
        assertTrue(enemy.x == player.x);
    }
    @Test
    public void enemyMoveWestTest(){
        player = new Player(-1,0);
        enemy = new Enemy(0,0,player);
        enemy.move();
        assertTrue(enemy.x == player.x);
    }

    //Test combo directions

    @Test
    public void moveNorthEastTest(){
        player = new Player(1,1);
        enemy = new Enemy(0,0,player);
        enemy.move();
        assertTrue((enemy.y == player.y) && (enemy.x == player.x));
    }

    @Test
    public void moveNorthWestTest(){
        player = new Player(-1,1);
        enemy = new Enemy(0,0,player);
        enemy.move();
        assertTrue((enemy.y == player.y) && (enemy.x == player.x));
    }
    @Test
    public void moveSouthEastTest(){
        player = new Player(1,-1);
        enemy = new Enemy(0,0,player);
        enemy.move();
        assertTrue((enemy.y == player.y) && (enemy.x == player.x));
    }
    @Test
    public void moveSouthWestTest(){
        player = new Player(-1,-1);
        enemy = new Enemy(0,0,player);
        enemy.move();
        assertTrue((enemy.y == player.y) && (enemy.x == player.x));
    }
}
