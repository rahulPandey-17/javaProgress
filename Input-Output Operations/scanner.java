import java.util.Scanner;
class scanner 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String name;
        long num;
        System.out.print("Enter your name : ");
        name = scan.nextLine();
        System.out.println();
        System.out.print("Enter your number : ");
        num = scan.nextLong();
    }
} 