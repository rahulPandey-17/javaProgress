import java.io.*;
public class week
{
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        System.out.println("Numbers starts from 1 and goes till 7");
        System.out.println("1 is Monday");
        System.out.print("Enter the number : ");
        num = Integer.parseInt(br.readLine());
        if(num == 1)
        {
            System.out.println("Monday");
        }
        else if(num == 2)
        {
            System.out.println("Tuesday");
        }
        else if(num == 3)
        {
            System.out.println("Wednesday");
        }
        else if(num == 4)
        {
            System.out.println("Thursday");
        }
        else if(num == 5)
        {
            System.out.println("Friday");
        }
        else if(num == 6)
        {
            System.out.println("Saturday");
        }
        else if(num == 7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Invalid Number");
        }
    }
}