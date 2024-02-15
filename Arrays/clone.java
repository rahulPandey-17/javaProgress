public class clone
{
    public static void main(String... args)
    {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] aclone = a.clone();
        for(int i = 0 ; i < aclone.length ; i++)
        {
            System.out.print(aclone[i] + " ");
        }
    }
}