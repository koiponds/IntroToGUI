import java.awt.*;
import javax.swing.*;

public class DrawingPanel extends JPanel{
	// instance variables represent state.
    int numOfRectangles = 0;

	int counter = 0;

    private class Rectangle {
        private int x, y, width, height;
        private Color color;

        private Rectangle(int x, int y, int width, int height, Color color) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.color = color;
        }

        private void draw(Graphics g) {
            g.setColor(color);
            g.fillRect(x, y, width, height);
            g.setColor(Color.BLACK);
            g.drawRect(x, y, width, height);
        }
    }

    Rectangle[] rectangles = new Rectangle[200000];

	// Override default JPanel method.
	// NEVER call manually.  System calls. 
	// You should call repaint(); 
	public void paintComponent(Graphics g) {
        super.paintComponent(g); // fill with background color

        counter++;

        g.setFont(new Font("Serif", Font.BOLD, 14));
        g.drawString("System called paintComponent " + counter + " times.", 100, 100);

        int x = (int) (Math.random() * 300);
        int y = (int) (Math.random() * 300);
        int width = (int) (Math.random() * 200) + 20;
        int height = (int) (Math.random() * 200) + 20;
        Color color = getRandomColor();
        rectangles[numOfRectangles] = new Rectangle(x, y, width, height, color);
        numOfRectangles++;

        for (int i = 0; i < numOfRectangles; i++) {
            rectangles[i].draw(g);
        }
    }

    private static Color getRandomColor() {
        int red = (int)(Math.random() * 256);
        int green = (int)(Math.random() * 256);
        int blue = (int)(Math.random() * 256);
        return new Color(red, green, blue);
    }
}