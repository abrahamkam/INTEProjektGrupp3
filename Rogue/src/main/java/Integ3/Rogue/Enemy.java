package Integ3.Rogue;

public class Enemy extends Actor{

    Player player;

    public Enemy(int x, int y, Player player) {
        super(x,y);
        this.player = player;
    }

    public void move() {
        if(player.getX() > this.x){
            x++;
        }else if (player.getX() < this.x){
            x--;
        }

        if(player.getY() > this.y){
            y++;
        }else if (player.getY() < this.y){
            y--;
        }
    }

}
