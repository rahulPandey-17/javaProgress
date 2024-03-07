import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter te text : ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        StringBuilder rev = new StringBuilder("");
        for(int i = str.length() - 1 ; i >= 0 ; i--) {
            rev = rev.append(str.charAt(i));
        }
        System.out.println("The reversed string is : " + rev);
    }
}