import java.awt.image.BufferedImage;


public class Assets {
    public static final int ball_width = 128, ball_height = 128;
    public static final int tile_width = 62, tile_height = 62;
    public static BufferedImage red, blue, green, yellow, purple;
    public static BufferedImage rock, grass, dirt;
    public static void init(){
        SpriteSheet balls = new SpriteSheet(ImageLoader.loadImage("./balls.png"));
        red    = balls.crop(0, 0, ball_width, ball_height);
        blue   = balls.crop(ball_width, 0, ball_width, ball_height);
        green  = balls.crop(ball_width*2, 0, ball_width, ball_height);
        yellow = balls.crop(ball_width*3, 0, ball_width, ball_height);
        purple = balls.crop(ball_width*4, 0, ball_width, ball_height);
        SpriteSheet tiles = new SpriteSheet(ImageLoader.loadImage("./tiles.png"));
        rock   = tiles.crop(0, 0, tile_width, tile_height);
        grass  = tiles.crop(0, tile_height*2, tile_width, tile_height);
        dirt  = tiles.crop(0, tile_height, tile_width, tile_height);
    }
    
}
