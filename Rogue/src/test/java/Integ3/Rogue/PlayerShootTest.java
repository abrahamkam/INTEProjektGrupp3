package Integ3.Rogue;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

//Testing the shoot function by moving an enemy object to different locations
//while changing the direction of a player object placed at the center of the map.
public class PlayerShootTest {
    private GameScreen gameScreen = new GameScreen(250,250,0,0);
    private int xCenter = gameScreen.getGameWidth() / 2;
    private int yCenter = gameScreen.getGameHeight() / 2;

    Enemy enemy = gameScreen.getEnemy();
    Player player = gameScreen.getPlayer();

    private int enemyBoundary = enemy.getLength();

    private int west = enemyBoundary;
    private int east = gameScreen.getGameWidth() - enemyBoundary;
    private int north = enemyBoundary;
    private int south = gameScreen.getGameHeight() - enemyBoundary;

    private int xPos, yPos;

    @Test
    //TF1, player_dir n, enemy ne, left boundary hit
    public void leftBoundaryHit() {
        player.setDirection(Player.Direction.NORTH);
        xPos = xCenter + enemyBoundary;
        yPos = north;
        enemy.setPosition(xPos, yPos);
        assertTrue(gameScreen.playerShoot());
    }

    //    TF2	player_dir e, enemy se, left hit
    @Test
    public void leftHit() {
        player.setDirection(Player.Direction.EAST);
        xPos = east;
        yPos = yCenter + enemyBoundary;
        if (enemyBoundary > 0) {
            yPos -= 1;
        }
        enemy.setPosition(xPos, yPos);
        assertTrue(gameScreen.playerShoot());
    }

    //    TF3	player_dir s, enemy s, center hit
    @Test
    public void centerHit() {
        player.setDirection(Player.Direction.SOUTH);
        xPos = xCenter;
        yPos = south;
        enemy.setPosition(xPos, yPos);
        assertTrue(gameScreen.playerShoot());
    }

    //    TF4	player_dir w, enemy sw, right hit
    @Test
    public void rightHit() {
        player.setDirection(Player.Direction.WEST);
        xPos = west;
        yPos = yCenter + enemyBoundary;
        if (enemyBoundary > 0) {
            yPos -= 1;
        }
        enemy.setPosition(xPos, yPos);
        assertTrue(gameScreen.playerShoot());
    }

    //    TF5	player_dir n, enemy nw, right boundary hit
    @Test
    public void rightBoundaryHit() {
        player.setDirection(Player.Direction.NORTH);
        xPos = xCenter - enemyBoundary;
        yPos = north;
        enemy.setPosition(xPos, yPos);
        assertTrue(gameScreen.playerShoot());
    }

    //    TF6	player_dir e, enemy w, miss
    @Test
    public void directionMissEast() {
        player.setDirection(Player.Direction.EAST);
        xPos = west;
        yPos = yCenter;
        enemy.setPosition(xPos, yPos);
        assertTrue(!gameScreen.playerShoot());
    }

    //    TF7	player_dir s, enemy se, miss
    @Test
    public void outOfRangeSouthMiss() {
        player.setDirection(Player.Direction.SOUTH);
        xPos = east;
        yPos = south;
        enemy.setPosition(xPos, yPos);
        assertTrue(!gameScreen.playerShoot());
    }

    //    TF8	player_dir w, enemy s, miss
    @Test
    public void directionMissWest() {
        player.setDirection(Player.Direction.WEST);
        xPos = xCenter;
        yPos = south;
        enemy.setPosition(xPos, yPos);
        assertTrue(!gameScreen.playerShoot());
    }

    //    TF9	player_dir n, enemy e, miss
    @Test
    public void directionMissNorth() {
        player.setDirection(Player.Direction.NORTH);
        xPos = east;
        yPos = yCenter;
        enemy.setPosition(xPos, yPos);
        assertTrue(!gameScreen.playerShoot());
    }

    //    TF10	player_dir e, enemy ne, right boundary miss
    @Test
    public void rightBoundaryMiss() {
        player.setDirection(Player.Direction.EAST);
        xPos = xCenter - enemyBoundary;
        yPos = yCenter;
        enemy.setPosition(xPos, yPos);
        assertTrue(!gameScreen.playerShoot());
    }

    //    TF11	player_dir s, enemy sw, left boundary miss
    @Test
    public void leftBoundaryMiss() {
        player.setDirection(Player.Direction.EAST);
        xPos = xCenter - enemyBoundary;
        yPos = yCenter;
        enemy.setPosition(xPos, yPos);
        assertTrue(!gameScreen.playerShoot());
    }
}