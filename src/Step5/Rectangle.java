package Step5;

import java.awt.*;

public class Rectangle extends Polygon {
    public Rectangle(int x, int y) {
        super(x, y);
    }
    public void paint(Graphics g) {
        g.drawRect(centerPoint.x -20, centerPoint.y -10, 40, 20);
    }
}
