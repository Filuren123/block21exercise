package Step4;

import java.awt.*;

public class Square extends Polygon {

    public Square(Point centerPoint) {
        super(centerPoint);
    }

    public void paint(Graphics g) {
        g.drawRect(centerPoint.x -10, centerPoint.y -10, 20, 20);
    }

}
