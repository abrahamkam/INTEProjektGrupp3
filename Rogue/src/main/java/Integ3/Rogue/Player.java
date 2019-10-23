package Integ3.Rogue;

import com.sun.tools.javac.code.Attribute;

public class Player extends Actor {

    private direction dir = direction.NORTH;

    enum direction {
        NORTH,
        EAST,
        WEST,
        SOUTH
    }

    public Player(int x, int y) {
        super(x,y, 50);
    }

    public void move(int dx, int dy) {
        y += dy;
        x += dx;
    }

    public void setDirection(direction dir){
        this.dir = dir;
    }
}