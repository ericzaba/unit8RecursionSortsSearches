
import java.awt.*;
import javax.swing.*;
import java.awt.Graphics2D;
import java.awt.geom.*;
public class FractalTree extends JFrame
{
    
    
    private int count = 0;
    private int angle = 30;
    private int length = 10;
    public void drawFractal (Graphics2D g2, double x, double y, double length, double angleRelativeVertical)
    {
        if (count == 10)
        {
            g2.drawLine((int)x, (int) y, (int) x+100, (int) y + 100);
            this.count++;
        }
        else
        {
            this.count++;
        }

    }
    public double x (int angle, int length)
    {
        angle = this.angle;
        return Math.tan(angle)/length;
    }
    public double y (int length)
    {
        length = this.length;
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
    }
    
}

