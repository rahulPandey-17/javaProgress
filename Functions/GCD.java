import java.util.Scanner;
public class GCD {

    // user-defined function

    public static int gd(int a, int b) {
        int gcd;
        if(a > b) {
            gcd = a % b;
        }
        else {
            gcd = b % a;
        }
        return gcd;
    }

    // main function

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.print("Enter first number : ");
        x = sc.nextInt();
        System.out.print("Enter second number : ");
        y = sc.nextInt();
        System.out.printf("The G.C.D of the two numbers is : %d", gd(x,y));
    }
}