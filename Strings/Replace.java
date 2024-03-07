import java.util.Scanner;
public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        System.out.print("Enter the string : ");
        text = sc.nextLine();
        String result = "";
        for(int i = 0 ; i < text.length() ; i++) {
            if(text.charAt(i) == 'e') {
                result += 'i';
            }
            else {
                result += text.charAt(i);
            }
        }
        System.out.println("The modified string is given below");
        System.out.println(result);
    }
}