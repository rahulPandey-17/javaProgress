// Program to implement transpose of a matrix

import java.util.Scanner;
public class transpose {
    public static void main(String[] args) {
        int[][] a = new int [3][3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the matrix ( 3 x 3) : ");
        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // logic to transpose the matrix

        int[][] t = new int[3][3];

        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                t[i][j] = a[j][i];
            }
        }

        System.out.println("The transpose of the matrix is ");
        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}