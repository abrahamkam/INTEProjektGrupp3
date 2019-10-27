package Integ3.Rogue;

public class GameScreen {

    private static int gameWidth = 500;
    private static int gameHeight = 500;
    private static Enemy enemy;
    private static Player player;

    public GameScreen(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
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
            enemy.move(1,0);
        } else if (player.getX() < enemy.getX()) {
            enemy.move(-1,0);
        }

        if (player.getY() > enemy.getY()) {
            enemy.move(0,1);
        } else if (player.getY() < enemy.getY()) {
            enemy.move(0,-1);
        }
    }

    public int getGameWidth() {
        return gameWidth;
    }

    public int getGameHeight() {
        return gameHeight;
    }

}

