public class Diamond {
    public static void main(String[] args) {
        int n = 5;

        // upper-half
        
        for(int i = 1 ; i <= 5 ; i++) {

            // for printing LHS spaces

            for(int j = 1 ; j <= (n - i) ; j++) {
                System.out.print(" ");
            }

            // for printing stars

            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*" + " ");
            }

            // for printing RHS stars

            for(int j = 1 ; j <= (n - i) ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // upper-half
        
        for(int i = 5 ; i >= 1 ; i--) {

            // for printing LHS spaces

            for(int j = 1 ; j <= (n - i) ; j++) {
                System.out.print(" ");
            }

            // for printing stars

            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*" + " ");
            }

            // for printing RHS stars

            for(int j = 1 ; j <= (n - i) ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}