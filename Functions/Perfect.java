import java.util.Scanner;
public class Perfect {

    // function to determine perfect number

    public static boolean perfect(int a) {
        int sum = 0;
        boolean result = false;
        for(int i = 1 ; i < a ; i++) {
            if(a % i == 0) {
                sum += i;
            }
            if(sum == a)
            result = true;
            else
            result = false;
        }
        return result;
    }

    // main-function

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the range : ");
        n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++) {
            if(perfect(i) == true) {
                System.out.print(i + " ");
            }
            else {
                continue;
            }
        }
    }
}