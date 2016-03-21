
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
    
    public static void main(String[] args)
        throws Exception
    {
        String address = "http://google.com";

        URL pageLocation = new URL(address);

        


        Scanner in = new Scanner(pageLocation.openStream());

        

        System.out.println(in.readLine());

    }
}
