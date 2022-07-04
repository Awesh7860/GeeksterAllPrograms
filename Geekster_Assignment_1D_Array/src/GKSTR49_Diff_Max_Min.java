import java.util.Scanner;
public class GKSTR49_Diff_Max_Min
{
    public static int find_max(int [] arr,int n)
    {
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static int find_min(int [] arr,int n)
    {
        int min=Integer.MAX_VALUE;
        for (int i=0;i<n;i++)
        {
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [] arr=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int max=find_max(arr,n);
        int min=find_min(arr,n);
        int dif=max-min;
        System.out.println(dif);
    }
}
