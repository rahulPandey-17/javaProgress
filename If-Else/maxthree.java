// Program to find maximun between two numbers

import java.io.*;
public class maxthree
{
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float a,b,c;
        System.out.print("Enter the first number : ");
        a = Float.parseFloat(br.readLine());
        System.out.print("Enter the second number : ");
        b = Float.parseFloat(br.readLine());
        System.out.print("Enter the third number : ");
        c = Float.parseFloat(br.readLine());
        if(a > b && a > c)
        {
            System.out.printf("%.2f is greater than %.2f and %.2f", a,b,c);
        }
        else if(b > a && b > c)
        {
            System.out.printf("%.2f is greater than %.2f and %.2f", b,a,c);
        }
        else if(c > a && c > b)
        {
            System.out.printf("%.2f is greater than %.2f and %.2f", c,a,b);
        }
        else
        {
            System.out.printf("%.2f %.2f and %.2f all are equal", a,b,c);
        }
    }
}