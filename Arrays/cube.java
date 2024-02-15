import java.util.Scanner;
public class cube
{
    public static void main(String... args)
    {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of the array (max. 10) : ");
        int i,j;
        for(i = 0 ; i < a.length ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("The array you entered is : ");
        for(j = 0 ; j < a.length ; j++)
        {
            System.out.print(a[j] + " ");
        }
        System.out.println();

        int[] b = new int[10];
        b = a.clone();
        System.out.print("The cubes of the values of the array elements is : ");
        for(j = 0 ; j < b.length ; j++)
        {
            a[j] = a[j] * a[j] * a[j];
            System.out.print(a[j] + " ");
        }
    }
}