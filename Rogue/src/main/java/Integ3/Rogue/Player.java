package Integ3.Rogue;

public class Player extends Actor {
    private Direction Direction;

    enum Direction {
        NORTH,
        EAST,
        WEST,
        SOUTH
    }

    public Player(int x, int y) {
        super(x, y, 50);
    }


    public void setDirection(Direction dir) {
        this.Direction = dir;
    }

    public Direction getDirection() {
        return Direction;
    }
}