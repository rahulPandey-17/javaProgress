import java.io.*;
public class Vote {

    // user-defined function

    public static void display(int a) {
        if(a < 18) {
            System.out.println("Not eligible for voting");
        }
        else {
            System.out.println("Eligible for voting");
        }
    }

    // main function

    public static void main(String... args)
    throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;
        System.out.print("Enter the age of the candidate : ");
        a = Integer.parseInt(br.readLine());
        display(a);
    }
}