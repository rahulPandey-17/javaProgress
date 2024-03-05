import java.util.*;
public class Display {

    // main function

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        char ch;
        int p = 0, ne = 0, z = 0;
        do {

            System.out.print("Enter the number : ");
            num = sc.nextInt();
            if(num > 0) {
                p++;
            }
            else if(num < 0) {
                ne++;
            }
            else {
                z++;
            }

            System.out.println("Do you want to continue?");
            ch = sc.next().charAt(0);
        
        }while(ch == 'y' || ch == 'Y');
        System.out.println("Positive Numbers : " + p);
        System.out.println("Negative Numbers : " + ne);
        System.out.println("Zeros : " + z);
    }
}