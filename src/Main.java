import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    static final int FRAME_HEIGHT = 720;
    static final int FRAME_WIDTH = 720;

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    class Canvas extends JPanel {
        Grid grid;
        public Canvas() {
            setPreferredSize(new Dimension(FRAME_HEIGHT, FRAME_WIDTH));
            grid = new Grid(10, Cell.SIZE);
        }

        @Override
        public void paintComponent(Graphics g) {
            grid.paint(g);
        }
    }
}
