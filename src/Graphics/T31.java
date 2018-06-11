package Graphics;

import javax.swing.*;
import java.awt.*;

public class T31 extends Canvas {

    public void paint( Graphics window){

        drawBox(window, Color.red, 150, 312, 232, 231);
        drawBox(window, Color.black, 213, 123, 50, 123);
        drawBox(window, Color.yellow, 421, 213, 75, 200);
    }

    public void drawBox(Graphics window, Color c, int x, int y, int w, int h){

        window.setColor(c);
        window.fillRect(x, y, w, h);
        window.setColor(Color.white);
        window.fillRect(x+10, y+10,w-20,h-20);
    }



    public static void main( String[] args )
    {
        Canvas canvas = new T31();
        JFrame win = new JFrame("Boxy3 - write and use function - boxes different sizes");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setBackground(Color.WHITE);
        win.add( canvas );
        win.setVisible(true);
    }
}
