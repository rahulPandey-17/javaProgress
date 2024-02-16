// Program to implement bubble sort array
import java.util.Scanner;
public class bubble
{
    public static void sort(int[] ar)
    {
        for(int i = 0 ; i < ar.length - 1 ; i++)
        {
            for(int j = 0 ; j < (ar.length - i - 1) ; j++)
            {
                if(ar[j] > ar[j + 1])
                {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }

        System.out.print("The sorted array is : ");
        for(int i = 0 ; i < ar.length ; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }

    public static void main(String... args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n;
        n = sc.nextInt();
        System.out.print("Enter the array elements : ");
        int[] a = new int[n];
        for(int i = 0 ; i < a.length ; i++)
        {
            a[i] = sc.nextInt();
        }
        sort(a);
    }
}