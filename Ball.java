import java.awt.*;
import java.util.ArrayList;
import java.util.List;
class Ball extends Entity {

    public final double radius;
    public static List<Ball> balls = new ArrayList<>();

    public Ball(double x, double y, double radius, double speed, double angleInDegree) {
        super(x, y, speed);
        this.speedX = speed * Math.cos(Math.toRadians(angleInDegree));
        this.speedY = -speed * Math.sin(Math.toRadians(angleInDegree));
        this.radius = radius;
    }
    public Ball(double x, double y, double radius, double speed, double angleInDegree, Color color) {
        super(x, y, speed, color);
        this.speedX = speed * Math.cos(Math.toRadians(angleInDegree));
        this.speedY = -speed * Math.sin(Math.toRadians(angleInDegree));
        this.radius = radius;
    }

    public void move() {
        this.x += this.speedX;
        this.y += this.speedY;
    }

    public void checkColision(){
        for(Ball ball: balls){
            PhysicsUtils.collisionWithWall(Rectangle.quadra, ball);
        }
        for (int i = 0; i < balls.size(); i++) {
            for (int j = 0; j < balls.size(); j++) {
                if (i < j) {
                    PhysicsUtils.intersect(balls.get(i), balls.get(j));
                }
            }
        }
        for (Ball ball : balls) {
            ball.move();
        }
    }

    @Override
    public void render(Graphics g) {
        g.setColor(color);
        g.fillOval((int) (x - radius), (int) (y - radius), (int) (2 * radius), (int) (2 * radius));
    }

    @Override
    public void tick() {
        checkColision();
    }

    @Override
    public void resize(int width, int heigth) {
        
    }
    public double getMass() {
        return 2 * radius * radius * radius / 1000f;
    }

}
