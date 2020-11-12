import java.awt.image.BufferedImage;
import java.awt.Graphics;

public class Tile {

    public BufferedImage texture;
    protected final int id;
    public final int TILEWIDTH = 62, TILEHEIGTH = 62;

    public static Tile[] tiles = new Tile[256];
    public static Tile grassTile = new GrassTile(0);
    public static Tile dirtTile = new DirtTile(1);
    public static Tile rockTile = new RockTile(2);

    public Tile(BufferedImage texture, int id){
        this.texture = texture;
        this.id = id;
        tiles[id] = this;
    }

    public void tick(){

    }

    public void render(Graphics g, int x, int y){
        g.drawImage(texture, x, y, TILEHEIGTH, TILEHEIGTH, null);
    }
    
    public boolean isSolid(){
        return false;
    }

    public int getId() {
        return id;
    }
    
}
