
import java.awt.*;
import java.util.*;
import java.net.URL;
/**
 * Write a description of class Website here.
 * 
 * @author (Eric Zaba) 
 * @version 3-21-2016
 */
public class Website
{
    String address;
    URL pageLocation;
    public static void main(String[] args)
    {
        address = new String("http://google.com");
        try
        {

            this.pageLocation = new URL(this.address);
        }
        catch (Exception e)
        {
            System.out.println("You messed up");
        }
        try
        {
            Scanner in = new Scanner(pageLocation.openStream());
        }
        catch (Exception e)
        {
            System.out.println("you messed up");
        }
    }
}
