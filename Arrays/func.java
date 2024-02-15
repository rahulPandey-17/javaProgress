import java.util.Scanner;
public class func
{
    public static void print(int[] a, int n)
    {
        int i,j,ss = 0, sd = 0;
        for(i = 0 ; i < a.length ;i++)
        {
            int count = 0;
            int temp = a[i];
            while(temp != 0)
            {
                temp /= 10;
                count++;
            }
            System.out.println(count);
            if(count == 1)
            {
                ss = ss + a[i];
            }
            else if(count == 2)
            {
                sd += a[i];
                System.out.println(sd);
            }
        }
        System.out.println("The sum of single digit numbers in the array is : " + ss);
        System.out.println("The sum of double digit elements in the array is : " + sd);
    }

    public static void main(String... args)
    {   
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the size of the array : ");
        num = sc.nextInt();
        int[] ar = new int[num];
        System.out.print("Enter the elements of the array :");
        int i;
        for(i = 0 ; i < ar.length ; i++)
        {
            ar[i] = sc.nextInt();
        }
        print(ar,num);
    }
}