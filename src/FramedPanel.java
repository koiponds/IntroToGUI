import javax.swing.*;
import java.awt.*;

public class FramedPanel extends JPanel {

    private Color color;

    public FramedPanel(Color color) {
        this.color = color;
    }

    @Override
    public void paintComponents(Graphics g) {
        g.setColor(color);
        g.drawRect(100, 0, 600, 400);

    }
}