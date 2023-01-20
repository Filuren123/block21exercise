package Step4;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawPolygons extends JComponent{
    private final ArrayList<Polygon> polygons;

    public DrawPolygons(){
        polygons = new ArrayList<>();
        polygons.add(new Square(new Point(100,100)));
        polygons.add(new Triangle(new Point(150,150)));
        polygons.add(new Rectangle(new Point(100,200)));
    }//constructor

    @Override
    public void paint(Graphics g) {
        for (Polygon currentPolygon : polygons) {
            currentPolygon.paint(g);
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