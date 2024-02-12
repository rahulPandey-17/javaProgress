// Program to find maximum between two numbers
import java.io.*;
public class maxtwo
{
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        int x,y;
        System.out.print("Enter the first value : ");
        x = Integer.parseInt(bfn.readLine());
        System.out.print("Enter the second value : ");
        y = Integer.parseInt(bfn.readLine());
        if(x > y)
        {
            System.out.printf("%d is greater than %d", x,y);
        }
        else if(y > x)
        {
            System.out.printf("%d is greater than %d", y,x);
        }
        else
        {
            System.out.printf("%d and %d both are equal", x,y);
        }
    }
}