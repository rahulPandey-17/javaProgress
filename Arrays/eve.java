import java.util.*;
public class eve
{
    public static void main(String... args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.print("Enter the values of the array (max. 10) : ");
        int i;
        for(i = 0 ; i < a.length ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Even numbers in the array are :");
        for(i = 0 ; i < a.length ; i++)
        {
            if(a[i] % 2 != 0)
            continue;
            System.out.print(a[i] + " ");
        }
        
    }
}