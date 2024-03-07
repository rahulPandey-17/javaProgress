// Program to access characters in a string

import java.util.Scanner;
public class CharAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        System.out.print("Enter a text : ");
        text = sc.nextLine();
        System.out.println("The characters in the text are printed below");
        for(int i = 0 ; i < text.length() ; i++) {
            System.out.println(text.charAt(i));
        }
    }
}