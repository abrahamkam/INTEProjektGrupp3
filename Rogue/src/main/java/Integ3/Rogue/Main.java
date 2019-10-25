package Integ3.Rogue;

/**
 * Hello world!
 *
 */
import java.awt.*;
import java.awt.event.KeyEvent;

public class Main
{
    private int score;
    private GameScreen screen;
    public static void main( String[] args )
    {
        Main main = new Main();
        main.setupGame();
        main.run();

    }

    public void setupGame(){
        Player player = new Player(50,50);
        //screen = new GameScreen(player, new Enemy(20,20, player));
    }

    public void run(){
        while (true){

        }
    }

    public int getScore() {
        return score;
    }

    public GameScreen getScreen() {
        return screen;
    }
    
    public void setScreen(GameScreen gs) {
    	this.screen = gs; 
    }
}
