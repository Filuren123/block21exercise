package Step4;

import java.awt.*;

public class Rectangle extends Polygon {

    public Rectangle(Point centerPoint) {
        super(centerPoint);
    }

    public void paint(Graphics g) {
        g.drawRect(centerPoint.x -20, centerPoint.y -10, 40, 20);
    }
}
