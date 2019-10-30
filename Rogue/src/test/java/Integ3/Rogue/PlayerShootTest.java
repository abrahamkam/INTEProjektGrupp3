package Integ3.Rogue;

import org.junit.Test;

//Testing the shoot function by moving an enemy object to different locations
//while changing the direction of a player object placed at the center of the map.
public class PlayerShootTest {
    private GameScreen gameScreen = new GameScreen(0,0,0,0);
    private int xCenter = gameScreen.getGameWidth() / 2;
    private int yCenter = gameScreen.getGameHeight() / 2;

    private Player player = new Player(xCenter, yCenter);
    private Enemy enemy = new Enemy(xCenter, yCenter);

    private int enemyBoundary = enemy.getLength() / 2;

    private int west = enemyBoundary;
    private int east = gameScreen.getGameWidth() - enemyBoundary;
    private int north = enemyBoundary;
    private int south = gameScreen.getGameHeight() - enemyBoundary;

    private int xPos, yPos;

    @Test
    //TF1, player_dir n, enemy ne, left boundary hit
    public void leftBoundaryHit() {
        player.setDirection(Player.direction.NORTH);
        xPos = xCenter + enemyBoundary;
        yPos = north;
        enemy = new Enemy(xPos, yPos);
        assert (player.shoot(enemy));
    }

    //    TF2	player_dir e, enemy se, left hit
    @Test
    public void leftHit() {
        player.setDirection(Player.direction.EAST);
        xPos = east;
        yPos = yCenter + enemyBoundary;
        if (enemyBoundary > 0) {
            yPos -= 1;
        }
        enemy = new Enemy(xPos, yPos);
        assert (player.shoot(enemy));
    }

    //    TF3	player_dir s, enemy s, center hit
    @Test
    public void centerHit() {
        player.setDirection(Player.direction.SOUTH);
        xPos = xCenter;
        yPos = south;
        enemy = new Enemy(xPos, yPos);
        assert (player.shoot(enemy));
    }

    //    TF4	player_dir w, enemy sw, right hit
    @Test
    public void rightHit() {
        player.setDirection(Player.direction.WEST);
        xPos = west;
        yPos = yCenter + enemyBoundary;
        if (enemyBoundary > 0) {
            yPos -= 1;
        }
        enemy = new Enemy(xPos, yPos);
        assert (player.shoot(enemy));
    }

    //    TF5	player_dir n, enemy nw, right boundary hit
    @Test
    public void rightBoundaryHit() {
        player.setDirection(Player.direction.NORTH);
        xPos = xCenter - enemyBoundary;
        yPos = north;
        enemy = new Enemy(xPos, yPos);
        assert (player.shoot(enemy));
    }

    //    TF6	player_dir e, enemy w, miss
    @Test
    public void directionMissEast() {
        player.setDirection(Player.direction.EAST);
        xPos = west;
        yPos = yCenter;
        enemy = new Enemy(xPos, yPos);
        assert (!player.shoot(enemy));
    }

    //    TF7	player_dir s, enemy se, miss
    @Test
    public void outOfRangeSouthMiss() {
        player.setDirection(Player.direction.SOUTH);
        xPos = east;
        yPos = south;
        enemy = new Enemy(xPos, yPos);
        assert (!player.shoot(enemy));
    }

    //    TF8	player_dir w, enemy s, miss
    @Test
    public void directionMissWest() {
        player.setDirection(Player.direction.WEST);
        xPos = xCenter;
        yPos = south;
        enemy = new Enemy(xPos, yPos);
        assert (!player.shoot(enemy));
    }

    //    TF9	player_dir n, enemy e, miss
    @Test
    public void directionMissNorth() {
        player.setDirection(Player.direction.NORTH);
        xPos = east;
        yPos = yCenter;
        enemy = new Enemy(xPos, yPos);
        assert (!player.shoot(enemy));
    }

    //    TF10	player_dir e, enemy ne, right boundary miss
    @Test
    public void rightBoundaryMiss() {
        player.setDirection(Player.direction.EAST);
        xPos = xCenter - enemyBoundary;
        yPos = yCenter;
        enemy = new Enemy(xPos, yPos);
        assert (!player.shoot(enemy));
    }

    //    TF11	player_dir s, enemy sw, left boundary miss
    @Test
    public void leftBoundaryMiss() {
        player.setDirection(Player.direction.EAST);
        xPos = xCenter - enemyBoundary;
        yPos = yCenter;
        enemy = new Enemy(xPos, yPos);
        assert (!player.shoot(enemy));
    }
}