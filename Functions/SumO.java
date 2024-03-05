import java.io.*;
public class SumO {

    // use-defined function

    public static int sumOdd(int n) {
        int sum = 0;
        for(int i = 0 ; i <= n ; i++) {
            if(i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    // main function

    public static void main(String[] args)
    throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        System.out.print("Enter the number : ");
        num = Integer.parseInt(br.readLine());
        System.out.printf("The sum of all odd numbers in the given range is : %d", sumOdd(num));
    }
}