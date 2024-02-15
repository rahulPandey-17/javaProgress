import java.util.*;
public  class oarray
{
    public static void main(String... args)
    {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array (max. 10) : ");
        int i;
        for(i = 0 ; i < a.length ; i++)
        {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        System.out.print("The sum of the elements of the array is : ");
        for(i = 0 ; i < a.length ; i++)
        {
            sum += a[i];
        }
        System.out.println(sum);

        double avg = 0;
        System.out.print("The average of the elements of the array is : ");
        for(i = 0 ; i < a.length ; i++)
        {
            avg = sum/10.0;
        }
        System.out.println(avg);
        int max = a[0];
        System.out.print("The maximum value in the array is : ");
        for(i = 0 ; i < a.length ; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        System.out.println(max);
        int min = a[0];
        System.out.print("The minimum value in the array is : ");
        for(i = 0 ; i < a.length ; i++)
        {
            if(a[i] < min)
            {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}