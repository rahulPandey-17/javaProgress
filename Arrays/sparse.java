// Program to check for a sparse matrix

import java.util.Scanner;
public class sparse {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        int[][] a = new int[3][3];
        System.out.println("Enter the matrix (3 x 3) ");
        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        // logic for sparse matrix

        int count = 0;
        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                if(a[i][j] == 0)
                count++;
            }
        }

        if(count > (0.66 * 9)) {
            System.out.println("It is a sparse matrix");
        }
        else {
            System.out.print("It is not a sparse matrix");
        }
    }
}