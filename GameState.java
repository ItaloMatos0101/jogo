import java.awt.Graphics;
import java.awt.*;

public class GameState extends State {
    
    public GameState(Game game){
        super(game);
        if(Rectangle.quadra == null){
            Rectangle.quadra = new Rectangle(0, 0, game.getWidth(), game.getHeight());
        }
        Ball.balls.add(new Ball(250, 380, 100, 2, -42, Color.BLUE));
        Ball.balls.add(new Ball(200, 80, 50, 2, -84, Color.RED));
        Ball.balls.add(new Ball(500, 170, 70, 2, -42, Color.YELLOW));
        Ball.balls.add(new Ball(500, 170, 90, 2, -42, Color.GREEN));
    }

    @Override
    public void tick(){
        if (game.getKeyManager().p)
            State.setState(game.getMenuState());
        Rectangle.quadra.tick();
        for (Ball ball : Ball.balls) {
            ball.tick();
        }
    }

    @Override
    public void render(Graphics g){
        Rectangle.quadra.render(g);
        for (Ball ball : Ball.balls) {
            ball.render(g);
        }
    }
    
}
