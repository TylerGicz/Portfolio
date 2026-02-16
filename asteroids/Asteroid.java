package asteroids;

public class Asteroid {
    private float x, y, dx, dy;

    public Asteroid(float x, float y, float dx, float dy){
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
    }

    public void update(){
        x += dx;
        y += dy;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }
}
