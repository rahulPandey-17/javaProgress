import java.util.Scanner;
public class PrimeFactor {

    // function to determine weather a number is prime or not

    public static boolean isPrime(int n) {
        boolean result = false;
        int count = 0;
        if(n < 2) {
            result = false;
        }
        else {
            for(int i = 2 ; i <= n / 2 ; i++) {
                if(n % i == 0) {
                    count++;
                }
            }
            if(count > 0) 
            result = false;
            else
            result = true;
        }
        return result;
    }

    // main function

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        int[] fact = new int[50];
        for(int i = 1 ; i <= num ; i++) {
            if(num % i == 0) {
                fact[i] = i;
            }
            else {
                continue;
            }
        }
        for(int i = 0 ; i < fact.length ; i++) {
            if(isPrime(fact[i]) == true) {
                System.out.print(fact[i] + " ");
            }
            else {
                continue;
            }
        }
    }
}