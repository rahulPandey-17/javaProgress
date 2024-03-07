// To check weather two strings are identical or not

import java.util.Scanner;
public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        boolean result = false;
        System.out.print("Enter the first string : ");
        s1 = sc.nextLine();
        System.out.print("Enter the second string : ");
        s2 = sc.nextLine();
        int size1,size2;
        size1 = s1.length();
        size2 = s2.length();
        if(size1 != size2) {
            System.out.println("The strings aren't identical");
            System.exit(0);
        }
        for(int i = 0 ; i < size1 ; i++) {
            if(s1.charAt(i) != s2.charAt(i))
            result = false;
            else 
            result = true;
        }
        if(result == false)
        System.out.println("The strings are not identical");
        else 
        System.out.println("The strings are identical");
    }
}