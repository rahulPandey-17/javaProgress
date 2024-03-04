// Program to print a palindrome number pyramid

public class PalindromeP {
    public static void main(String... args) {
        int n = 5;
        for(int i = 1 ; i <= 5 ; i++) {
            
            //for printing spaces

            for(int j = 1 ; j <= (n - i) ; j++) {
                System.out.print(" ");
            }

            //for printing first half numbers

            for(int j = i ; j >= 1 ; j--) {
                System.out.print(j);
            }

            //for printing second half numbers

            for(int j = 2 ; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}