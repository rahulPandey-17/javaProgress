// Program to check for alphabet

import java.io.*;
public class check
{
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch;
        System.out.print("Enter the character : ");
        ch = (char)br.read();
        if(ch >= 'a' && ch <= 'z')
        {
            System.out.println("It is a lower case alphabet");
        }
        else if(ch >= 'A' && ch <= 'Z')
        {
            System.out.println("It is a upper case");
        }
        else
        {
            System.out.println("It is not an alphabet");
        }
    }
}