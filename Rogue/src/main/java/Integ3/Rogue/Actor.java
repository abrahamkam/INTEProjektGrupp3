package Integ3.Rogue;

public abstract class Actor {
    private int x, y, length;

    public Actor(int x, int y, int length) {
        this.x = x;
        this.y = y;
        this.length = length;
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getLength() {
        return length;
    }
}
