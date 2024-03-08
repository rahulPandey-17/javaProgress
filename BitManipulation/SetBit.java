import java.util.Scanner;
public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        int pos = 1;
        int bitMask = 1 << pos;
        int newNumber = bitMask | num;
        System.out.println("The new number after bit manuplation is : " + newNumber);
    }
}