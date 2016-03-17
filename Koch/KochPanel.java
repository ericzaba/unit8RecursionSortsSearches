//********************************************************************
//  KochPanel.java       Author: Lewis/Loftus/Cocking
//
//  Represents a drawing surface on which to paint a Koch Snowflake.
//********************************************************************

import java.awt.*;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.geom.Line2D;
import java.awt.Color;

public class KochPanel extends JPanel
{
   private final int PANEL_WIDTH = 400;
   private final int PANEL_HEIGHT = 400;

   private final double SQ = Math.sqrt(3.0) / 6;

   private final int TOPX = 200, TOPY = 20;
   private final int LEFTX = 60, LEFTY = 300;
   private final int RIGHTX = 340, RIGHTY = 300;
   
   
   private int endX1;
   private int endY1;
   private int startX = 100;
   private int startY = 100;
   private double dLength;
   private double angle1 = 45;
   
   
   
   private int current; //current order
   private int count;
   //-----------------------------------------------------------------
   //  Sets the initial fractal order to the value specified.
   //-----------------------------------------------------------------
   public KochPanel (int currentOrder)
   {
      current = currentOrder;
      setBackground (Color.black);
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
   }

   //-----------------------------------------------------------------
   //  Draws the fractal recursively. Base case is an order of 1 for
   //  which a simple straight line is drawn. Otherwise three
   //  intermediate points are computed, and each line segment is
   //  drawn as a fractal.
   //-----------------------------------------------------------------
   public void drawFractal (Graphics2D g2, int startX, int startY, double dLength, double angle1)
    {
        
        
        
        
        if (count == 10)
        {
            this.endX1 = (int)(startX - dLength*Math.sin(angle1));
            this.endY1 = (int)(startY - dLength*Math.cos(angle1));
            g2.setColor(new Color(255,255,255));
            g2.draw(new Line2D.Double(startX, startY, endX1, endY1));
            drawFractal(g2,startX,startY,dLength,angle1);
            this.count++;
        }
        else
        {
            this.count++;
        }
   }

   //-----------------------------------------------------------------
   //  Performs the initial calls to the drawFractal method.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent (page);

      Graphics2D g2 = (Graphics2D) page;

      g2.setColor (Color.green);

      drawFractal (g2, startX, startY, dLength, angle1 );
   }

   //-----------------------------------------------------------------
   //  Sets the fractal order to the value specified.
   //-----------------------------------------------------------------
   public void setOrder (int order)
   {
      current = order;
   }

   //-----------------------------------------------------------------
   //  Returns the current order.
   //-----------------------------------------------------------------
   public int getOrder ()
   {
      return current;
   }
}
