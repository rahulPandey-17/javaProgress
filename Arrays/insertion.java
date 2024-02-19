public class insertion
{
    public static void main(String... args)
    {
        int[] a = {3,6,2,1,5};
        for(int i = 1 ; i < a.length ; i++)
        {
            int key = a[i];
            int j = i - 1;
            while(j >= 0 && a[j] > key)
            {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
        System.out.print("The sorted array is : ");
        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}