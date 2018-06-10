package Graphics;

import javax.swing.*;
import java.awt.*;

public class T25 extends Canvas{

    public void paint ( Graphics g) {


        //   CLOCK!!!
        g.drawArc(80, 180, 200, 200, 0, 360);
        g.drawString("12", 175, 200);
        g.drawString("3", 265, 280);
        g.drawString("6", 175, 370);
        g.drawString("9", 90, 280);
        g.setColor(Color.gray);
        g.fillArc(175, 270, 10, 10, 0, 360);
        g.setColor(Color.black);
        g.drawLine(180, 275, 90, 275);
        g.drawLine(180, 275, 130, 320);
    }





    public static void main( String[] args )
    {
        JFrame win = new JFrame("GraphicsDemo");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        T25  canvas = new T25();
        win.add( canvas );
        win.setVisible(true);
    }
}
//and this