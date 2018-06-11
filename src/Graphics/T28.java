package Graphics;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class T28 extends Canvas {

    Random r = new Random();
    Polygon tri = new Polygon();

    public void paint(Graphics g) {

        for(int i = 1; i<=50;i++) {


            int point1X = 1 + r.nextInt(800);
            int point1Y = 1 + r.nextInt(600);
            int point2X = 1 + r.nextInt(800);
            int point2Y = 1 + r.nextInt(600);
            int point3X = 1 + r.nextInt(800);
            int point3Y = 1 + r.nextInt(600);

            tri.addPoint(point1X, point1Y);
            tri.addPoint(point2X, point2Y);
            tri.addPoint(point3X, point3Y);

            int randomR = 1+r.nextInt(255);
            int randomG = 1+r.nextInt(255);
            int randomB = 1+r.nextInt(255);

            Color myPurple = new Color(randomR, randomB, randomR);
            g.setColor(myPurple);
            g.fillPolygon(tri);
        }
    }

    public static void main(String[] args)
    {
        JFrame win = new JFrame("Random triangles");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new T28() );
        win.setVisible(true);
    }

}
