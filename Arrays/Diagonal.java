// Program to print the diagonals of the matrix
import java.util.Scanner;
public class Diagonal {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Enter the matrix (3 X 3)");
        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The diagonal elements of the matrix is as follows");
        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                if((i + j) % 2 == 0)
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}