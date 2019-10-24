package Integ3.Rogue;

import static java.lang.Math.abs;

public class Player extends Actor {


    private direction dir;
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

    public boolean shoot(Enemy e){
        int dx = this.x - e.getX();
        int dy = this.y - e.getY();
        int w = e.getLength()/2;
        int absDx = abs(dx);
        int absDy = abs(dy);

        if (dir == direction.NORTH){
            if(dy>0 && absDx <= w){
                return true;
            }
        } else if(dir == direction.EAST){
            if(dx<0 && absDy<w){
                return true;
            }
        } else if(dir == direction.SOUTH){
            if(dy<0 && absDx<w){
                return true;
            }
        } else if(dir == direction.WEST){
            if(dx>0 && absDy<w){
                return true;
            }
        }
        return false;
    }

}