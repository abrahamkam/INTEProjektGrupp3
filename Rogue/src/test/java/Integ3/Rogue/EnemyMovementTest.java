package Integ3.Rogue;

import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyMovementTest {
    private Enemy enemy;
    private Player player;

    //Testing cardinal directions
    @Test
    public void enemyMoveNorthTest(){
        enemy = new Enemy(0,0);
        player = new Player(0,1);
        enemy.move();

    }

    @Test
    public void enemyMoveSouthTest(){
        enemy = new Enemy(0,0);
        player = new Player(0,-1);
        enemy.move();
    }

    @Test
    public void enemyMoveEastTest(){
        enemy = new Enemy(0,0);
        player = new Player(1,0);
        enemy.move();
    }
    @Test
    public void enemyMoveWestTest(){
        enemy = new Enemy(0,0);
        player = new Player(-1,0);
        enemy.move();
    }

    //Test combo directions

    @Test
    public void moveNorthEastTest(){
        enemy = new Enemy(0,0);
        player = new Player(1,1);
        enemy.move();
    }

    @Test
    public void moveNorthWestTest(){
        enemy = new Enemy(0,0);
        player = new Player(-1,1);
        enemy.move();
    }
    @Test
    public void moveSouthEastTest(){
        enemy = new Enemy(0,0);
        player = new Player(1,-1);
        enemy.move();
    }
    @Test
    public void moveSouthWestTest(){
        enemy = new Enemy(0,0);
        player = new Player(-1,-1);
        enemy.move();
    }
}
