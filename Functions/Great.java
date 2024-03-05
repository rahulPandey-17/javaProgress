import java.io.*;
public class Great {

    // user-defined function

    public static int isGreater(int a, int b) {
        int res;
        if(a > b) {
            res = a;
        }
        else {
            res = b;
        }
        return res;
    }

    // main function

    public static void main(String[] args)
    throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1,num2;
        System.out.print("Enter the first number : ");
        num1 = Integer.parseInt(br.readLine());
        System.out.print("Enter the second number : ");
        num2 = Integer.parseInt(br.readLine());
        System.out.printf("The greater of the two given numbers is : %d", isGreater(num1,num2));
    }
}