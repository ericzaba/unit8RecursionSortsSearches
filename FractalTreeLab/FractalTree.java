
import java.awt.*;
import javax.swing.*;
import java.awt.Graphics2D;
import java.awt.geom.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FractalTree extends JPanel
{
    private int count = 0;
    private int startX = 0;
    private int startY = 100;
    private double dLength = 10;
    private double angle1 = 30;
    private int endX1;
    private int endY1;
    
    public FractalTree()
    {   
        
        
    }
    public void drawFractal (Graphics2D g2, int startX, int startY, double dLength, double angle1)
    {
        if (count == 10)
        {
            this.endX1 = (int)(startX - dLength*Math.sin(angle1));
            this.endY1 = (int)(startY - dLength*Math.cos(angle1));
            g2.drawLine(startX, startY, endX1, endY1);
            this.count++;
        }
        else
        {
            this.count++;
        }

    }
    
    public void paintComponent(Graphics2D g)
    {
          
        Graphics2D g2 = (Graphics2D) g;
        
        g.setColor(Color.green);
        
        drawFractal(g, this.startX, this.startY, this.endX1, this.endY1);
    }

}
