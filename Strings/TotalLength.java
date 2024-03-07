import java.util.Scanner;
public class TotalLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[3];
        for(int i = 0 ; i < str.length ; i++) {
            str[i] = sc.nextLine();
        }
        int len = 0;
        for(int i = 0 ; i < str.length ; i++) {
            len += str[i].length();
        }
        System.out.println("The combined length of the strings in the array is : " + len);
    }
}