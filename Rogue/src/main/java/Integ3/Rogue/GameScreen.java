package Integ3.Rogue;

public class GameScreen {

    private final int gameWidth = 500;
    private final int gameHeight = 500;
    private Enemy enemy;
    private Player player;

    public GameScreen(int playerX, int playerY, int enemyX, int enemyY) {
        spawn(playerX, playerY, enemyX, enemyY);
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

    public Player getPlayer() {
        return player;
    }

    public Enemy getEnemy() {
        return enemy;
    }
    
    public int getGameWidth() {
        return gameWidth;
    }
    
    public int getGameHeight() {
        return gameHeight;
    }
}

