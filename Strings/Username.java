import java.util.Scanner;
public class Username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uname = "";
        String email;
        System.out.print("Enter the email address : ");
        email = sc.nextLine();
        for(int i = 0 ; i < email.length() ; i++) {
            if(email.charAt(i) == '@') {
                break;
            }
            else {
                uname += email.charAt(i);
            }
        }
        System.out.println("Your user name is : " + uname);
    }
}