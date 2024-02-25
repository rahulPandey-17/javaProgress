// Program to do matrix multiplication

import java.util.Scanner;
public class multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int i,j;
        System.out.print("Enter first matrix (3 x 3) : ");
        for(i = 0 ; i < 3 ; i++) {
            for(j = 0 ; j < 3 ; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int[][] b = new int [3][3];
        System.out.print("Enter second matrix (3 x 3) : ");
        for(i = 0 ; i < 3 ; i++) {
            for(j = 0 ; j < 3 ; j++) {
                b[i][j] = sc.nextInt();
            }
        } 

        int[][] c = new int[3][3];
        
        // logic for matrix multiplication

        System.out.println("The multiplied matrix is");
        for(i = 0 ; i < 3 ; i++) {
            for(j = 0 ; j < 3 ; j++) {
                c[i][j] = 0;
                for(int k = 0 ; k < 3 ; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}