// Program to perform subtraction of two matrices

import java.util.Scanner;
public class subtract {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        System.out.print("Enter the first matrix (3 x 3)");
        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        System.out.print("Enter the second matrix (3 x 3)");
        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                b[i][j] = scan.nextInt();
            }
        }
        int[][] sub = new int[3][3];

        // logic for subtraction

        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                sub[i][j] = a[i][j] - b[i][j];
            }
        }

        // printing of subtracted matrix

        System.out.println("The resultant matrix is");
        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
    }
}