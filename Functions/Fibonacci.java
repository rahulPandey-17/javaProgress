import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.print("Enter the range of the series : ");
        n = sc.nextInt();
        int[] f = new int[n];
        System.out.println("The fibonacci series till the range is given below");
        f[0] = 0;
        f[1] = 1;
        System.out.print(f[0] + " " + f[1] + " ");
        for(i = 2 ; i < n ; i++) {
            f[i] = f[i - 1] + f[i - 2];
            System.out.print(f[i] + " ");
        }
    }
}