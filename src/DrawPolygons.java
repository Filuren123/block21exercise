import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.util.List;

public class DrawPolygons extends Component {
    private List<Polygon> polygonObj;

    public DrawPolygons(){
        polygonObj = new ArrayList<Polygon>();
        polygonObj.add(new Rectangle(100, 100));
        polygonObj.add(new Triangle(150,150));
        polygonObj.add(new Square(100,200));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                polygonObj.add(new Triangle(e.getX(), e.getY()));
                paint(getGraphics());
            }
        });
    }//constructor

    @Override
    public void paint(Graphics g) {
        for (Polygon p : polygonObj) {
            p.paint(g);
        }
    }//paint

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);
    }//main

}//DrawPolygons