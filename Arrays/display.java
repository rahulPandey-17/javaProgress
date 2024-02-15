import java.util.*;
public class display
{
    public static void main(String... args)
    {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array (max 10) : ");
        for(int i = 0 ; i < a.length ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("The values entered are as follows : ");
        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}