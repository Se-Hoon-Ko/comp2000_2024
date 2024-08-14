import java.awt.*;

public class MouseTrail {
    private Point[] mPointsArr;
    private int size;
    private int front;
    private int rear;
    static final int ARRMAX = 100;

    public MouseTrail() {
        mPointsArr = new Point[ARRMAX];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void printArr(){
        for(int i=0;i<mPointsArr.length-1;i++){
            System.out.print(mPointsArr[i]);
        }
        System.out.println();
    }
    public void push(Point p) {
        mPointsArr[rear] = p;
        rear = (rear + 1) % ARRMAX;
    
        if (size < ARRMAX) {
            size++;
        } else {
            front = (front + 1) % ARRMAX;  
        }
    }
    

    public Point[] getTrail() {
        Point[] trail = new Point[size];
        for (int i = 0; i < size; i++) {
            trail[i] = mPointsArr[(front + i) % ARRMAX];
        }
        return trail;
    }
    
    public void draw(Graphics g) {
        for (Point p : getTrail()) {
            if (p != null) {
                g.setColor(new Color(0, 0, 0, 64)); 
                g.fillOval(p.x - 10, p.y - 10, 20, 20); 
            }
        }
    }
}
