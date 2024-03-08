import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int[] binary = new int[32];
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        int i = 0;
        while(num > 0) {
            binary[i] = num % 2;
            num /= 2;
            i++;
        }

        // printing the binary array in reverse to get the binary number
        
        for(int j = i - 1 ; j >= 0 ; j--) {
            System.out.print(binary[j] + " ");
        }
    }
}