package Graphics;

import javax.swing.*;
import java.awt.*;

public class T32 extends Canvas{

    public void paint( Graphics g )
    {
        drawSmilingFace(g,100,100);
        drawSmilingFace(g,400,350);
        // etc
    }

    public void drawSmilingFace( Graphics g, int x, int y )
    {
        // Draws a smiling face on the screen, where the point (x,y) is
        //  the upper-left corner of a box containing the face.

        g.setColor(Color.yellow);
        g.fillArc(x,y,150,150, 0, 360);
        g.setColor(Color.red);
        g.fillArc(x+50,y+40,15,15, 0, 360);
        g.setColor(Color.red);
        g.fillArc(x+90,y+40,15,15, 0, 360);
        g.setColor(Color.red);
        g.drawArc(x+35,y+40,80,80,200, 140);
    }

    public static void main(String[] args)
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("Smiling Face Function");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new T32() );
        win.setVisible(true);
    }

}

