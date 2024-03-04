import java.io.*;
public class PrintName {
    
    // function

    public static void myName(String name) {
        System.out.println("Entered name is : " + name);
    }

    // main function

    public static void main(String... args)
    throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        System.out.print("Enter the name : ");
        name = br.readLine();
        myName(name); // calling the function
    }
}