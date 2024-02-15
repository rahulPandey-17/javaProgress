import java.util.*;
public class revd
{
    public static void main(String[] args)
    {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array (max 10) : ");
        for(int i = 0 ; i < a.length ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("The elements of the array in reverse are : ");
        for(int i = a.length - 1 ; i >= 0 ; i--)
        {
            System.out.print(a[i] + " ");
        }
    }
}