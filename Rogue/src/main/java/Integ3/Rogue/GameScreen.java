package Integ3.Rogue;

import static java.lang.Math.abs;

public class GameScreen {

    private static int gameWidth = 500;
    private static int gameHeight = 500;
    private static Enemy enemy;
    private static Player player;

    public GameScreen(int playerX, int playerY, int enemyX, int enemyY) {
        spawn(playerX, playerY, enemyX, enemyY);
    }

    private void spawn(int playerX, int playerY, int enemyX, int enemyY) {
        this.player = new Player(playerX, playerY);
        this.enemy = new Enemy(enemyX, enemyY);
    }

    public static boolean isCollisionWithEdge(int xCoordinate, int yCoordinate) {
        boolean isCollision = false;

        if (xCoordinate >= gameWidth || xCoordinate <= 0)
            isCollision = true;

        if (yCoordinate >= gameHeight || yCoordinate <= 0)
            isCollision = true;


        return isCollision;
    }

    public static boolean isCollisionWithEnemy(int playerXCoordinate, int playerYCoordinate, int enemyXCoordinate, int enemyYCoordinate) {
        boolean isCollision = false;

        //Hårdkodad tills vidare (avstånd mellan mitten koordinat och varje kant för spelare
        int playerLength = 50;

        if ((enemyXCoordinate > (playerXCoordinate - playerLength)) && (enemyXCoordinate < (playerXCoordinate + playerLength)))
            if ((enemyYCoordinate > (playerYCoordinate - playerLength)) && (enemyYCoordinate < (playerYCoordinate + playerLength)))
                isCollision = true;

        return isCollision;
    }

    public static void moveEnemy() {
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

    public boolean playerShoot(){
        int deltaX = player.getX() - enemy.getX();
        int deltaY = player.getY() - enemy.getY();
        int boundaryWidth = enemy.getLength();
        Player.Direction playerDirection = player.getDirection();

        if (playerDirection == Player.Direction.NORTH){
            if(deltaY > 0 && abs(deltaX) <= boundaryWidth){
                return true;
            }
        } else if(playerDirection == Player.Direction.EAST){
            if(deltaX < 0 && abs(deltaY) <= boundaryWidth){
                return true;
            }
        } else if(playerDirection == Player.Direction.SOUTH){
            if(deltaY < 0 && abs(deltaX) <= boundaryWidth){
                return true;
            }
        } else if(playerDirection == Player.Direction.WEST){
            if(deltaX > 0 && abs(deltaY) <= boundaryWidth){
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

