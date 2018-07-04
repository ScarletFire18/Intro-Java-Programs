import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ellipse extends JPanel {

    public void paint(Graphics g) {
        g.drawOval(190, 100, 120, 300);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new Ellipse());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}


