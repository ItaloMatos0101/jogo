import java.awt.Graphics;
import java.awt.*;

public class MenuState extends State {

    public MenuState(Game game) {
        super(game);
        if (Rectangle.quadra != null) {
            Rectangle.quadra = new Rectangle(0, 0, game.getWidth(), game.getHeight());
        }
    }

    @Override
    public void tick() {
        if (game.getKeyManager().enter)
            State.setState(game.getGameState());
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("BALL GAME", game.getWidth() / 2, game.getHeight() / 3);
        g.drawString("APERTE ENTER PARA INICIAR", game.getWidth() / 2, game.getHeight() / 3 + 20);
        g.drawString("APERTE P PARA VOLTAR AO MENU", game.getWidth() / 2, game.getHeight() / 3 + 40);
    }

}
