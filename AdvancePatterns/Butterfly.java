// Program to print a Butterfly Pattern

public class Butterfly {
    public static void main(String[] args) {
        // Upper half
        // LHS Part

        int n = 5;
        for(int i = 0 ; i < n ; i++) {

            // To print LHS Stars

            for(int j = 0 ; j <= i ; j++) {
                System.out.print("*");
            }

            // To print middle spaces

            for(int j = 0 ; j <= (2 * (n - i)) ; j++) {
                System.out.print(" ");
            }

            // To print RHS Stars

            for(int j = 0 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        // LHS Part

        for(int i = n ; i >= 0 ; i--) {

            // To print LHS Stars

            for(int j = 0 ; j <= i ; j++) {
                System.out.print("*");
            }

            // To print middle spaces

            for(int j = 0 ; j <= (2 * (n - i)) ; j++) {
                System.out.print(" ");
            }

            // To print RHS Stars

            for(int j = 0 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}