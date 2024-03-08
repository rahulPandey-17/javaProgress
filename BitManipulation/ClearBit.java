import java.util.Scanner;
public class ClearBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        int pos = 2;
        int bitMask = 1 << pos;
        bitMask = ~ bitMask;
        int newNumber = bitMask & num;
        System.out.println("The new number after bit manupilation is : " + newNumber);     
    }
}