// Program to identify alphabet, number, special symbol

import java.io.*;
public class type
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
            System.out.println("It is lower case alphabet");
        }
        else if(ch >= 'A' && ch <= 'Z')
        {
            System.out.println("It is a upper case alphabet");
        }
        else if((ch >= 32 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 126))
        {
            System.out.println("It is a special character");
        }
        else
        {
            System.out.println("It is a number");
        }
    }
}