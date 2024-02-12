// Program to check for vowels and consonants

import java.io.*;
public class voc
{
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch;
        System.out.print("Enter the alphabet : ");
        ch = (char)br.read();
        if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u')
        {
            System.out.println("It is a vowel");
        }
        else
        {
            System.out.println("It is a consonant");
        }
    }
}