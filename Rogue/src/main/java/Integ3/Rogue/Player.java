package Integ3.Rogue;

public class Player extends Actor {



    public Player(int x, int y) {
        super(x,y);
    }

    public void move(int dx, int dy) {
        y += dy;
        x += dx;
    }
}