
import java.awt.*;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.geom.Line2D;
import java.awt.Color;
import java.util.Random;
public class Fractal extends JPanel
{
    private final int PANEL_WIDTH = 1000;
    private final int PANEL_HEIGHT = 1000;

    private final double SQ = Math.sqrt(3.0) / 6;

    private final int TOPX = 200, TOPY = 20;
    private final int LEFTX = 60, LEFTY = 300;
    private final int RIGHTX = 340, RIGHTY = 300;

    private int i = 0;

   
    //-----------------------------------------------------------------
    //  Sets the initial fractal order to the value specified.
    //-----------------------------------------------------------------
    public Fractal ()
    {

        setBackground (Color.gray);
        setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }

    //-----------------------------------------------------------------
    //  Draws the fractal recursively. Base case is an order of 1 for
    //  which a simple straight line is drawn. Otherwise three
    //  intermediate points are computed, and each line segment is
    //  drawn as a fractal.
    //-----------------------------------------------------------------
    public void drawFractal (double x, double y, double angle1, double length, Graphics2D g2)
    {

        Random random = new Random();
        double radAngle = Math.toRadians(angle1);
        double x2 = x - length * Math.sin(radAngle);
        double y2 = y - length * Math.cos(radAngle);
        

        int red = random.nextInt(254) + 1;
        int green = random.nextInt(254) + 1;
        int blue = random.nextInt(254) + 1;
        Line2D.Double nextLine  = new Line2D.Double(x,y,x2,y2);
        g2.setColor(new Color(red, green, blue));
        g2.draw(nextLine);
        if (length<1)
        {
            return;
        }
        else
        {
            drawFractal(500,100,angle1+angle1+50, length - 10, g2);
            
        }
    }

    //-----------------------------------------------------------------
    //  Performs the initial calls to the drawFractal method.
    //-----------------------------------------------------------------
    public void paintComponent(Graphics g)
    {
        this.i++;
        
        super.paintComponent( g );
        Graphics2D g2 = (Graphics2D) g;
        drawFractal(100, 100, 900, 50, g2);
        System.out.println("drawFractal Called: "+ i + "times");
    }
}
