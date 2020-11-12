import java.awt.*;

class Rectangle extends Entity{
    private int width, height;
    public static Rectangle quadra = null;

    public Rectangle(double x, double y, int width, int height) {
        super(x, y, 0);
        this.width = width;
        this.height = height;
    }
    public Rectangle(double x, double y, int width, int height, Color color) {
        super(x, y, 0, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.black);
        g.fillRect((int)x, (int)y, width, height);
    }

    @Override
    public void tick() {

    }
    
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void resize(int width, int height) {
        this.width = width;
        this.height = height;   
    }

}
