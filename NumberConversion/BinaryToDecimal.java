import java.lang.Math;
import java.util.Scanner;
public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter the binary number : ");
		num = sc.nextInt();
		int decimal = 0;
		int i = 0;
		while(num > 0) {
			int rem = num % 10;
			num /= 10;
			decimal += (rem * Math.pow(2 , i));
			i++;
		}
		System.out.println("It's decimal counterpart is : " + decimal);
	}
}