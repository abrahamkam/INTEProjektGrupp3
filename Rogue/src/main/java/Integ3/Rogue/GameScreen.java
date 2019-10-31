package Integ3.Rogue;

import java.awt.event.KeyEvent;

import static java.lang.Math.abs;

public class GameScreen {

    private final int gameWidth = 500;
    private final int gameHeight = 500;
    private Enemy enemy;
    private Player player;
    private Score score;

    public GameScreen(int playerX, int playerY, int enemyX, int enemyY) {
        score = new Score();
        spawn(playerX, playerY, enemyX, enemyY);
    }


    public void inputHandling(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                getPlayer().move(0, 1);
                break;
            case KeyEvent.VK_S:
                getPlayer().move(0, -1);
                break;
            case KeyEvent.VK_D:
                getPlayer().move(1, 0);
                break;
            case KeyEvent.VK_A:
                getPlayer().move(-1, 0);
                break;
            case KeyEvent.VK_SPACE:
                playerShoot();
        }
    }

    private void spawn(int playerX, int playerY, int enemyX, int enemyY) {
        this.player = new Player(playerX, playerY);
        this.enemy = new Enemy(enemyX, enemyY);
    }

    public boolean isCollisionWithEdge() {
        boolean isCollision = false;

        if (player.getX() >= gameWidth || player.getX() <= 0)
            isCollision = true;

        if (player.getY() >= gameHeight || player.getY() <= 0)
            isCollision = true;


        return isCollision;
    }

    public boolean isCollisionWithEnemy() {
        boolean isCollision = false;

        int playerLength = player.getLength();
        int enemyXCoordinate = enemy.getX();
        int enemyYCoordinate = enemy.getY();
        int playerXCoordinate = player.getX();
        int playerYCoordinate = player.getY();

        if ((enemyXCoordinate > (playerXCoordinate - playerLength)) && (enemyXCoordinate < (playerXCoordinate + playerLength)))
            if ((enemyYCoordinate > (playerYCoordinate - playerLength)) && (enemyYCoordinate < (playerYCoordinate + playerLength)))
                isCollision = true;

        return isCollision;
    }

    public void moveEnemy() {
        if (player.getX() > enemy.getX()) {
            enemy.move(1, 0);
        } else if (player.getX() < enemy.getX()) {
            enemy.move(-1, 0);
        }
        if (player.getY() > enemy.getY()) {
            enemy.move(0, 1);
        } else if (player.getY() < enemy.getY()) {
            enemy.move(0, -1);
        }
    }

    public boolean playerShoot() {
        int deltaX = player.getX() - enemy.getX();
        int deltaY = player.getY() - enemy.getY();
        int boundaryWidth = enemy.getLength();
        Player.Direction playerDirection = player.getDirection();

        if (playerDirection == Player.Direction.NORTH) {
            if (deltaY > 0 && abs(deltaX) <= boundaryWidth) {
                score.changeScore(10);
                return true;
            }
        } else if (playerDirection == Player.Direction.EAST) {
            if (deltaX < 0 && abs(deltaY) <= boundaryWidth) {
                score.changeScore(10);
                return true;
            }
        } else if (playerDirection == Player.Direction.SOUTH) {
            if (deltaY < 0 && abs(deltaX) <= boundaryWidth) {
                score.changeScore(10);
                return true;
            }
        } else if (playerDirection == Player.Direction.WEST) {
            if (deltaX > 0 && abs(deltaY) <= boundaryWidth) {
                score.changeScore(10);
                return true;
            }
        }
        return false;
    }

    public int getGameWidth() {
        return gameWidth;
    }

    public int getGameHeight() {
        return gameHeight;
    }

    public Player getPlayer() {
        return player;
    }

    public Enemy getEnemy() {
        return enemy;
    }
}