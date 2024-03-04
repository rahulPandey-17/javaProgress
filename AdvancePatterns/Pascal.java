public class Pascal {
    public static void main(String[] args) {
        int n = 5;
        int value;
         for(int i = 0 ; i < n ; i++) {

            for(int j = 0 ; j <= (n - i) ; j++) {
                System.out.print(" ");
            }
            for(int j = 0 ; j <= i ; j++) {
                value = fact(i) / ((fact(i - j) * fact(j)));
                System.out.print( " " + value);
            }
            System.out.println();
         }
    }

    public static int fact(int n) {
        int fact = 1;
        for(int i = n ; i >= 1 ; i--) {
            fact *= i;
        }
        return fact;
    }
}