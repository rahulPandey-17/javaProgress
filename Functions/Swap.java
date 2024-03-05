import java.util.Scanner;
public class Swap {

    // function to swap values

    public static void swap(int a, int b) {
        int temp = b;
        b = a;
        a = temp;
        System.out.println("First number : " + a);
        System.out.println("Second number : " + b);
    }

    // main function

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the first number : ");
        a = sc.nextInt();
        System.out.print("Enter the second number : ");
        b = sc.nextInt();
        swap(a,b);
    }
}