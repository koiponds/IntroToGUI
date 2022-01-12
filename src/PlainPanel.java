import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class PlainPanel extends JPanel {
    public PlainPanel() {
        this.setLayout(new BorderLayout());
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(2,2));

        JPanel southPanel2 = new JPanel();
        southPanel2.setLayout(new GridLayout(1,2));
        JButton previous = new JButton("Previous");
        southPanel2.add(previous);

        JButton next = new JButton("Next");
        southPanel2.add(next);

        southPanel.add(southPanel2);

        JButton submit = new JButton("Submit");
        southPanel.add(submit);

        this.add(southPanel, BorderLayout.SOUTH);

        this.add(new FramedPanel(Color.RED), BorderLayout.CENTER);
    }
}
