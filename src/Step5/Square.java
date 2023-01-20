package Step5;

import java.awt.*;

public class Square extends Polygon {
    public Square(int x, int y) {
        super(x, y);
    }
    public void paint(Graphics g) {
        g.drawRect(centerPoint.x -10, centerPoint.y -10, 20, 20);
    }

}
