import java.util.Scanner;
public class data
{
    public static void main(String... args)
    {
        Scanner sc = new Scanner(System.in);
        int[] rollno = new int[3];
        int[] maths = new int[3];
        int[] phy = new int[3];
        int[] chem = new int[3];
        int i;
        for( i = 0 ; i < 3 ; i++)
        {
            System.out.println("Enter the data of " + (i + 1) + " student :");
            System.out.print("Roll No. : ");
            rollno[i] = sc.nextInt();
            System.out.print("Marks in Mathematics : ");
            maths[i] = sc.nextInt();
            System.out.print("Marks in Physics : ");
            phy[i] = sc.nextInt();
            System.out.print("Marks in Chemistry : ");
            chem[i] = sc.nextInt();
        }

        int [] total = new int[3];
        for(i = 0 ; i < 3 ; i++)
        {
            System.out.print("The total marks of student " + (i + 1) + " is : ");
            total[i] = maths[i] + phy[i] + chem[i];
            System.out.println(total[i]);
        }

        double[] avg = new double[3];
        for(i = 0 ; i < 3 ; i++)
        {
            System.out.print("The total average of student " + (i + 1) + " is : ");
            avg[i] = (maths[i] + phy[i] + chem[i])/3.0;
            System.out.println(avg[i]);
        }
    }
}