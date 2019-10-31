package Integ3.Rogue;

public class Player extends Actor {
    private Direction direction;

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
        this.direction = dir;
    }

    public Direction getDirection() {
        return direction;
    }
}