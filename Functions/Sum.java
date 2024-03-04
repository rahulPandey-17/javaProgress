import java.io.*;
public class Sum {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args)
    throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        System.out.print("Enter the first number : ");
        a = Integer.parseInt(br.readLine());
        System.out.print("Enter the second number : ");
        b = Integer.parseInt(br.readLine());
        System.out.println("The sum of the two numbers is : " + sum(a,b));
    }
}