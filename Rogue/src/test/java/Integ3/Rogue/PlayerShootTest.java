package Integ3.Rogue;

import org.junit.Test;

public class PlayerShootTest {
    private int enemySize = 50;
    private GameScreen gameScreen = new GameScreen();
    private int XCenter = gameScreen.getGameWidth()/2;
    private int YCenter = gameScreen.getGameHeight()/2;
    private int XWest = enemySize;
    private int XEast = gameScreen.getGameWidth()- enemySize;
    private int YNorth = enemySize;
    private int YSouth = gameScreen.getGameHeight()- enemySize;

    private Player player = new Player(XCenter, YCenter);

    private Enemy enemy = new Enemy(XCenter, YCenter, player);

    @Test
    //TF1, player_dir n, enemy ne, left boundry hit
    public void centerHit(){

        

    }



}
