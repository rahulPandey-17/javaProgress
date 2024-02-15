import java.util.Scanner;
public class prange
{
    public static boolean isPrime(int n)
    {
        int i,count = 0;
        if(n < 2)
        return false;
        for(i = 2 ; i < n/2 ; i++)
        {
            if(n % i == 0)
            count++;
        }
        if(count == 0)
        return true;
        else
        return false;
    }

    public static void main(String... args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int num;
        num = sc.nextInt();
        int i;
        System.out.print("Prime numbers in the given range is : ");
        for(i = 1 ; i <= num ; i++)
        {
            if(isPrime(i) == false)
            continue;
            System.out.print(i + " ");
        }
    }
}