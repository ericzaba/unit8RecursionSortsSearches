
/**
 * Write a description of class Recusion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recursion
{
    int n;
    public int factorial(int n)
    {

        if (n == 0)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }

    }
}
