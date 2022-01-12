import javax.swing.*;

public class DrawingPanelMain {
    public static void main (String[] args) {
        JFrame window = new JFrame("Rectangles");
        window.setSize(400,600);
        window.setLocation(500,300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel content = new DrawingPanel();
        window.setContentPane(content);

        window.setVisible(true);
    }
}
