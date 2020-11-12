import java.awt.Graphics;

public class MenuState extends State {

    public MenuState(Game game){
        super(game);
    }

    @Override
    public void tick(){

    }

    @Override
    public void render(Graphics g){
        g.drawImage(Assets.green, 0, 0, null);
    }
    
}
