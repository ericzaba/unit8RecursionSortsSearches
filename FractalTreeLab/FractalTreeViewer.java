
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FractalTreeViewer
{
    private final int WIDTH = 1000;
    private final int HEIGHT = 1000;

    

    private JLabel titleLabel, orderLabel;
    private Fractal drawing;
    private JPanel panel, tools;
    private JFrame frame;

    //-----------------------------------------------------------------
    //  Sets up the components for the applet.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        FractalTreeViewer viewer = new FractalTreeViewer();
    }

    public FractalTreeViewer()
    {
        


        drawing = new Fractal ();
        panel = new JPanel();
        
        panel.add (drawing);

        frame = new JFrame();
        frame.setTitle("Fractal Tree Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(panel);
        frame.setVisible(true);
    }
    

}
