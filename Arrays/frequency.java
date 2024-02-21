// Program to find the frequency of a number in the array
import java.io.*;
public class frequency
{
    public static void main(String... args)
    throws IOException
    {
        int[] a = {1,2,3,1,4,5,3,4,4,4,6,6,7,7,1};
        System.out.print("Enter the number who's frequency you want to check : ");
        int num;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0 ; i < a.length ; i++)
        {
            if(num == a[i])
            {
                count++;
            }
        }
        System.out.printf("The frequency of %d is : %d", num, count);
    }
}