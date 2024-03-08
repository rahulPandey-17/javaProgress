import java.util.Scanner;
public class GetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num;
        num = sc.nextInt();
        int pos = 3;
        int bitMask = 1 << pos;
        if((bitMask & num) == 0) 
        System.out.println("Bit is 0 at this position");
        else
        System.out.println("Bit is 1 at this position");
    }
}