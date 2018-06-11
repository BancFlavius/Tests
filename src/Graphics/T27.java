package Graphics;

import javax.swing.*;
import java.awt.*;

public class T27 extends Canvas {


    public void paint(Graphics g) {

        Polygon tri = new Polygon();
        tri.addPoint(50, 50);
        tri.addPoint(100, 100);
        tri.addPoint(60, 150);
        Color myPurple = new Color(94,13,188);
        g.setColor(myPurple);
        g.fillPolygon(tri);
    }

    public static void main(String[] args)
    {
        JFrame win = new JFrame("Boring triangle");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new T27() );
        win.setVisible(true);
    }

}
