import java.awt.Color;
import java.awt.Graphics;

public class Cell{
    private int x = 10;
    private int y = 10;
    static final int SIZE = 35;

    private Color background = Color.WHITE;
    private Color boarder = Color.black;
    public Cell(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g) {
        g.setColor(boarder);
        g.drawRect(x, y, SIZE, SIZE);
        g.setColor(background);
        g.fillRect(x, y, SIZE, SIZE);
    }
}
