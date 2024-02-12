// Progam to check if a number is divisible by 5 and 11

import java.io.*;
public class divide
{
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float num;
        System.out.print("Enter the number : ");
        num = Float.parseFloat(br.readLine());
        if((num % 5 == 0) && (num % 11 == 0))
        {
            System.out.printf("%.2f is divisible by 5 and 11", num);
        }
        else
        {
            System.out.printf("%.2f is not divisible by 5 and 11", num);
        }
    }
}