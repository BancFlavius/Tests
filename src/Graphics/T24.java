package Graphics;

import javax.swing.JFrame;
import java.awt.*;

public class T24 extends Canvas {

    public void paint( Graphics g ){

        // SMILING FACE!!!!!
        g.setColor(Color.yellow);
        g.fillArc(80,180,300,300, 0, 360);
        g.setColor(Color.red);
        g.fillArc(150,250,30,30, 0, 360);
        g.setColor(Color.red);
        g.fillArc(270,250,30,30, 0, 360);
        g.setColor(Color.red);
        g.drawArc(175,330,100,100,200, 140);






        //grid
        g.setColor(Color.black);
        g.setFont(new Font(null));
        for ( int X=0; X<800; X += 50 )
            g.drawString( String.valueOf(X), X, 50 );
        for ( int Y=100; Y<600; Y += 50 )
            g.drawString( String.valueOf(Y), 28, Y );
// lines
        g.setColor(Color.lightGray);
        for ( int X=0; X<800; X += 50 )
            g.drawLine(X,0,X,599);    // horizontal
        for ( int Y=0; Y<600; Y += 50 )
            g.drawLine(0,Y,799,Y);    // vertical

    }


    public static void main( String[] args )
    {
        JFrame win = new JFrame("GraphicsDemo");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        T24  canvas = new T24();
        win.add( canvas );
        win.setVisible(true);
    }
}
//and tis