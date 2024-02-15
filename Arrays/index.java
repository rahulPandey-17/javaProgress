public class index
{
    public static void main(String... args)
    {
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.print("The elements in the array are : ");
        int i;
        for(i = 0 ; i < a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int sume = 0, sumo = 0;
        for(i = 0 ; i < a.length ; i++)
        {
            if(i % 2 == 0)
            {
                sume += a[i];
            }
            else 
            {
                sumo += a[i];
            }
        }
        System.out.println("The sum of elements at even indices are : " + sume);
        System.out.println("The sum of elements at odd indices are : " + sumo);
    }
}