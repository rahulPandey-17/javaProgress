// Program to check for a leap year

import java.io.*;
public class leap
{
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year;
        System.out.print("Enter the year : ");
        year = Integer.parseInt(br.readLine());
        if(year % 4 == 0 || year % 400 == 0)
        System.out.printf("%d is a leap year", year);
        else
        System.out.printf("%d is not a leap year", year);
    }
}