import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TestPanelMain {
	
	public static void main(String[] args) {
		JFrame window = new JFrame("Title");
		window.setLayout(new BorderLayout());
		window.setSize(600,400);
		window.setLocation(100,100);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		TestPanel myContent = new TestPanel();
		window.setContentPane(myContent);
		window.setVisible(true);
	}

}
