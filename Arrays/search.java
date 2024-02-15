import java.util.Scanner;
public class search
{
    public static void main(String... args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.print("Enter the elements of the array (max. 10) : ");
        int i,j;
        for(i = 0 ; i < a.length ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the element you want to search for : ");
        int sch;
        sch = sc.nextInt();
        System.out.print("The element is at ");
        for(j = 0 ; j < a.length ; j++)
        {
            if(a[j] == sch)
            {
                System.out.print("index number " + j);
            }
        }
    }
}