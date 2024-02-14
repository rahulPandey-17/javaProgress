import java.io.*;
public class print
{
    public static void main(String... args)
    throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.print("Enter the range : ");
        n = Integer.parseInt(br.readLine());
        System.out.print("The numbers are as follows : ");
        for(int i = 1 ; i <=n ; i++)
        {
            System.out.print(i + " ");
        }
    }
}