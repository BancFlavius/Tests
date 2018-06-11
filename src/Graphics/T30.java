package Graphics;

import javax.swing.*;
import java.awt.*;

public class T30 extends Canvas {
    public void paint( Graphics window )
    {
        // this code draws a 100x100 box in blue at (200,300)
        window.setColor(Color.BLUE);
        window.fillRect(200,300,100,100);
        // this code "erases" the center of the box by painting over it in white
        window.setColor(Color.WHITE);
        window.fillRect(210,310,80,80);

        // draw three more boxes -- different colors, different places
        window.setColor(Color.red);
        window.fillRect(300, 400, 100, 100);
        window.setColor(Color.white);
        window.fillRect(310, 410, 80, 80);

        window.setColor(Color.yellow);
        window.fillRect(150, 400, 100, 100);
        window.setColor(Color.white);
        window.fillRect(160, 410, 80, 80);

        window.setColor(Color.gray);
        window.fillRect(400, 150, 100, 100);
        window.setColor(Color.white);
        window.fillRect(410, 160, 80, 80);


    }

    public static void main( String[] args )
    {
        Canvas canvas = new T30();
        JFrame win = new JFrame("Boxy1 - make them manually");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setBackground(Color.WHITE);
        win.add( canvas );
        win.setVisible(true);
    }
}