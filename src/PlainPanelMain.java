import javax.swing.*;
import java.awt.*;

public class PlainPanelMain {
    public static void main(String[] args) {
        JFrame window = new JFrame("Plain Panel");
        window.setContentPane(new PlainPanel());
        window.setSize(600,400);
        window.setLocation(100,100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
