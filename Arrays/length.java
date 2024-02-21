// Program to find the length of the array without using in-built function

public class length
{
    public static void main(String... args)
    {
        String name = "Rahul Pandey";
        int count = 0;
        for(char c : name.toCharArray())
        {
            count++;
        }
        System.out.printf("The length of the array is : %d", count);
    }
}