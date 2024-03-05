import java.io.*;
public class Average {

    // user-defined function

    public static double printAvg(double a, double b, double c) {
        double avg = (a + b + c) / 3;
        return avg;
    }

    // main function

    public static void main(String[] args)
    throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a,b,c;
        System.out.print("Enter the first number : ");
        a = Double.parseDouble(br.readLine());
        System.out.print("Enter the second number : ");
        b = Double.parseDouble(br.readLine());
        System.out.print("Enter the third number : ");
        c = Double.parseDouble(br.readLine());
        System.out.printf("The average of the entered numbers is (showing 3 decimal places) : %.3f ", printAvg(a,b,c));
    }
}