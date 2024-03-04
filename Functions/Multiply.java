import java.io.*;
public class Multiply {

    // user-defined function

    public static int multiply(int a, int b) {
        return a * b;
    }

    // main function

    public static void main(String[] args)
    throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        System.out.print("Enter the first number : ");
        a = Integer.parseInt(br.readLine());
        System.out.print("Enter the second number : ");
        b = Integer.parseInt(br.readLine());
        System.out.println("The product of the two numbers is : " + multiply(a,b));
    }
}