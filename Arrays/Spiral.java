import java.util.Scanner;
public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Enter the matrix element (3 X 3)");
        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        int top = 0;
        int bottom = 2;
        int left = 0;
        int right = 2;

        while(top <= bottom && left <= right) {
            for(int i = left ; i <= right ; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            for(int i = top ; i <= bottom ; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            if(top <= bottom) {
                for(int i = right ; i >= left ; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            if(left <= right) {
                for(int i = bottom ; i >= top ; i--) {
                    System.out.print(matrix[i][left] + " ");
                    left++;
                }
            }
        }
    }
}