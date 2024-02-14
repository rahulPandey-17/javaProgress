import java.io.*;
public class table
{
    public static void main(String... args)
    throws IOException
    {
        int n,t;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number : ");
        n = Integer.parseInt(br.readLine());
        System.out.println("Table for the number is as follows");
        for(int i = 1 ; i <= 10 ; i++)
        {
            t = n * i;
            System.out.println(n + " x " + i + " = " + t);
        }
    }
}