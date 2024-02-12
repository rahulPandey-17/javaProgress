// Program to check if a number is odd or even

import java.io.*;
public class oeve
{
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        System.out.print("Enter the number : ");
        num = Integer.parseInt(br.readLine());
        if(num == 0)
        {
            System.out.printf("%d is neither odd nor even", num);
        }
        else if(num % 2 == 0)
        {
            System.out.printf("%d is a even number", num);
        }
        else
        {
            System.out.printf("%d is a odd number", num);
        }
    }
}