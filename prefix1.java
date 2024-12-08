import java.util.*;
class prefix1
{
    public static void main(String args[])
    {
        int a[]={3,4,5,6};
        int temp[]=new int[4];
        int s=0;
        for(int i=0;i<a.length;i++)
        {
            s+=a[i];
            int res=s/(i+1);

        }
        System.out.println(Arrays.toString(temp));
        
    }
}