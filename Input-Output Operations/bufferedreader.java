import java.io.*;
class bufferedreader
{
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name : ");
        String name;
        name = bfn.readLine();
        System.out.print("Enter your rollno : ");
        int rollno;
        rollno = Integer.parseInt(bfn.readLine());
    }
}