import java.awt.*;

public abstract class Polygon {

   public Point centerPoint;

    private Polygon(Point centerPoint){
        this.centerPoint = centerPoint;
    }

    public Polygon(int x, int y){
        this(new Point(x, y));
    }

    public abstract void paint(Graphics g);

}
