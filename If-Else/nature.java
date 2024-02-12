// Program to check weather a number is positive, negative or zero

import java.io.*;
public class nature
{
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float num;
        System.out.print("Enter the number : ");
        num = Float.parseFloat(br.readLine());
        if(num > 0)
        {
            System.out.printf("%.2f is positive", num);
        }
        else if(num < 0)
        {
            System.out.printf("%.2f is negative", num);
        }
        else
        {
            System.out.println("The number is 0");
        }
    }
}