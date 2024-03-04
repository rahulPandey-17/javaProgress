public class HollowB {
    public static void main(String[] args) {
        int n = 5;

        // upper-half

        for(int i = 1 ; i <= n ; i++) { 
            // for printing LHS stars
            for(int j = 1 ; j <= i ; j++) {
                if(j == 1 || j == i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            // for printing central spaces

            for(int j = 1 ; j <= (2 * (n - i)) ; j++) {
                System.out.print(" ");
            }

            // for printing RHS stars
            for(int j = 1 ; j <= i ; j++) {
                if(j == 1 || j == i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }    
            System.out.println();
        }

        // lower-half
        
        for(int i = n ; i >= 1 ; i--) { 
            // for printing LHS stars
            for(int j = 1 ; j <= i ; j++) {
                if(j == 1 || j == i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            // for printing central spaces

            for(int j = 1 ; j <= (2 * (n - i)) ; j++) {
                System.out.print(" ");
            }

            // for printing RHS stars
            for(int j = 1 ; j <= i ; j++) {
                if(j == 1 || j == i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }    
            System.out.println();
        }
    }
}