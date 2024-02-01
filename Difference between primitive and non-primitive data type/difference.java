// Program to demonstrate the difference between primitive and non primitive data types

import java.util.*;
class difference
{
    public static void main(String[] args)
    {
        // decleration of primitive data types

        int x = 10;
        int y = x;

        // Printing the values before changing anything

        System.out.println("The value of x is : " + x + " and the value of y is : " + y);

        // Now if we change the value of y as follows and then print the values

        y = 30;

        System.out.println("The value of x is : " + x + " and the value of y is : " + y);

        // The value of x remains same, so in primitive data types the original value dosen't change, if you make changes in the copied value

        // decleration of non-primitive data types

        int[] a = {10,20,30};
        int[] b = a;

        // Printing the values before changing anything

        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        for(int j = 0; j < b.length; j++)
        {
            System.out.print(b[j] + " ");
        }

        System.out.println();

        // Now if we change the value at first index in b

        b[0] = 50;

        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        for(int j = 0; j < b.length; j++)
        {
            System.out.print(b[j] + " ");
        }

        // The value in the original variable is also changed

    }
}