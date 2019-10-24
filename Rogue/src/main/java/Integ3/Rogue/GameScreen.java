package Integ3.Rogue;

public class GameScreen {

    private Player player;
    private Enemy enemy;

    public GameScreen(Player player, Enemy enemy){
        this.player = player;
        this.enemy = enemy;
    }

    public Player getPlayer() {
        return player;
    }

    public Enemy getEnemy() {
        return enemy;
    }
    
    public void setPlayer(Player p) {
    	this.player = p;
    }
    
    public void setEnemy(Enemy e) {
    	this.enemy = e;
    }
}
