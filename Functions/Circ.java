import java.io.*;
public class Circ {

    // use-defined function

    public static double circOfcircle(double r) {
        double c;
        c = 2 * 3.14 * r;
        return c;
    }

    // main function

    public static void main(String[] args)
    throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double r;
        System.out.print("Enter the radius of the circle : ");
        r = Double.parseDouble(br.readLine());
        System.out.printf("The area of the circle is (showing till 3 decimal places) : %.3f", circOfcircle(r));
    }
}