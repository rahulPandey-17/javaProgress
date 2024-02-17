public class selection
{
    public static void main(String[] args)
    {
        int[] a = {6,5,2,8,9,4};
        int temp,min;
        for(int i = 0 ; i < a.length - 1 ; i++)
        {   
            min = i;
            for(int j = i + 1 ; j < a.length ; j++)
            {
                if(a[min] > a[j])
                {
                    min = j;
                }
            }

            temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }

        System.out.print("The array after sorting is : ");
        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}