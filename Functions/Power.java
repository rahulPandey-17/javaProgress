import java.util.Scanner;
import java.lang.Math;
public class Power {

    // user-defined function

    public static double power(double x, double n) {
        double p = Math.pow(x,n);
        return p;
    }

    // main function

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,n;
        System.out.print("Enter the value of x : ");
        x = sc.nextDouble();
        System.out.print("Enter the value of n : ");
        n = sc.nextDouble();
        System.out.printf("n raise to x is : %.2f", power(x,n));
    }
}