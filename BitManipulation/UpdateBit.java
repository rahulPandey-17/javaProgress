import java.util.Scanner;
public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, bitMask, newNumber;
        int pos = 3;
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        int bit;
        System.out.print("You want to update the bit to 0 or 1 : ");
        bit = sc.nextInt();
        if(bit == 1) {
            bitMask = 1 << pos;
            newNumber = bitMask | num;
            System.out.println("The new number after bit update is : " + newNumber);
        }
        else {
            bitMask = 1 << pos;
            bitMask = ~(bitMask);
            newNumber = bitMask & num;
            System.out.println("The new number after bit update is : " + newNumber); 
        }
    }
}