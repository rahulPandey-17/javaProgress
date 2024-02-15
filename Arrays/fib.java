public class fib
{
    public static void main(String... args)
    {
        int[] f = new int[30];
        f[0] = 0;
        f[1] = 1;
        int i,j;
        System.out.println("The first 30 numbers in the fibonacci series are as follows");
        for(i = 2 ; i < f.length ; i++)
        {
            f[i] = f[i - 1] + f[i - 2];
        }
        for(j = 0 ; j < f.length ; j++)
        {
            System.out.print(f[j] + " ");
        }        
    }
}