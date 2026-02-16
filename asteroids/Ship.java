package asteroids;

public class Ship {
    private float x, y, dx, dy, ang, dang;

    public Ship(float x, float y){
        this.x = x;     /* spawn at safe location */
        this.y = y;     /* spawn at safe location */
        this.dx = 0;    /* set to 0 "no inital velocity" */
        this.dy = 0;    /* set to 0 "no inital velocity" */
        this.ang = 0;   /* set to 0 "point up at spawn" */
        this.dang = 0;  /* set to 0 "no initial rotating" */
    }

    public void updatePos(/* could take input from user to change dx, dy */){
        //based on rotation set dx and dy
        this.x += dx;
        this.y += dy;
    }

    public void updateAng(/* could take input from user to change dang */){
        //if 'a' rotate left 
        //if 'd' rotate right
        this.ang += dang; //wip
    }

    public float getX(){
        return this.x;
    }

    public float getY(){
        return this.y;
    }

    public float getAng(){
        return this.ang;
    }
}
