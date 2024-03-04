import java.io.*;
public class Factorial {

    // user-defined function

    public static long fact(int a) {
        if(a < 0) {
            System.out.println("Invalid number");
            System.exit(0);
        }
        long fact = 1;
        for(int i = a ; i >= 1 ; i--) {
            fact *= i;
        }
        return fact;
    }

    // main function

    public static void main(String[] args)
    throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        System.out.print("Enter a number : ");
        num = Integer.parseInt(br.readLine());
        System.out.println("The factorial of the number is : " + fact(num));
    }
}