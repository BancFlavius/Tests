package Graphics;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class T29 extends Canvas{

    Random r = new Random();
    public void paint(Graphics g) {

        int pointX1 = 512;
        int pointY1 = 109;
        int pointX2 = 146;
        int pointY2 = 654;
        int pointX3 = 876;
        int pointY3 = 654;

        int x = 512;
        int y = 382;
        int dx=0;
        int dy=0;

        for(int i=1; i<=50000; i++){
            g.drawLine(x,y,x,y);


            int random = 1 + r.nextInt(3);

            if(random == 1) {
                 dx = x - pointX1;
                 dy = y - pointY1;
            } else if(random == 2) {
                 dx = x - pointX2;
                 dy = y - pointY2;
            } else if(random == 3) {
                 dx = x - pointX3;
                 dy = y - pointY3;
            }

            x=x-dx/2;
            y=y-dy/2;


            if(i == 10000){
                g.drawString("Sierpinski Triangle", 462,484 );
            }
        }

    }


    public static void main(String[] args)
    {
        JFrame win = new JFrame("Sierpinski Triangle");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new T29() );
        win.setVisible(true);
    }
}
