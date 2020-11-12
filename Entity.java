import java.awt.*;

public abstract class Entity{
    
    protected double x, y;
    protected double speedX, speedY;
    protected final Color color;
    private static final Color DEFAULT_COLOR_FILLED = Color.BLACK;

    public Entity(double x,  double y, double speed){
        this.x = x;
        this.y = y;
        this.speedX = speed;
        this.speedY = speed;
        this.color = DEFAULT_COLOR_FILLED;
    }
    public Entity(double x,  double y, double speed, Color color){
        this.x = x;
        this.y = y;
        this.speedX = speed;
        this.speedY = speed;
        this.color = color;
    }

    public abstract void tick();

    public abstract void render(Graphics g);

    public abstract void resize(int width, int heigth);

    public void update(double incr) {
        this.x += this.speedX * incr;
        this.y += this.speedY * incr;
    }

    //getters setters
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getSpeedX() {
        return speedX;
    }
    public void setSpeedX(double speedX) {
        this.speedX = speedX;
    }
    public double getSpeedY() {
        return speedY;
    }
    public void setSpeedY(double speedY) {
        this.speedY = speedY;
    }

}