package Integ3.Rogue;

public abstract class Actor {
    private int x,y, length;

    public Actor(int x, int y, int length){
        this.x = x;
        this.y = y;
        this.length = length;
    }

    public void move(int dx,int dy){
        this.x += dx;
        this.y += dy;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getLength(){
        return length;
    }

    public void setPosition(int x, int y) {
        if (x < 0) {
            this.x = 0;
        } else {
            this.x = x;
        }

            if (y<0){
                this.y=0;
            } else {
                this.y=y;
            }
        }
}
