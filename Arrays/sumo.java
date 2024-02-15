import java.util.*;
public class sumo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.print("Enter the array elements (max. 10) : ");
        int i,j;
        for(i = 0 ; i < a.length ; i++)
        {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        System.out.print("The odd numbers in the array are : ");
        for(j = 0 ; j < a.length ; j++)
        {
            if(a[j] % 2 == 0)
            continue;
            System.out.print(a[j] + " ");
        }
        System.out.println();
        System.out.print("The sum of these odd numbers is : ");
        for(j = 0 ; j < a.length ; j++)
        {
            if(a[j] % 2 != 0)
            {
                sum += a[j];
            }
        }
        System.out.println(sum);
    }
}