import java.awt.Graphics;

public class Grid {
    private Cell[][] cells;

    public Grid(int offset, int cellSize) {
        cells = new Cell[(Main.FRAME_HEIGHT-offset*2)/Cell.SIZE][(Main.FRAME_WIDTH-offset*2)/Cell.SIZE];

        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                int x = offset + col * cellSize;
                int y = offset + row * cellSize;
                cells[row][col] = new Cell(x, y);
            }
        }
    }

    public void paint(Graphics g) {
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                cells[row][col].paint(g);
            }
        }
    }
}
