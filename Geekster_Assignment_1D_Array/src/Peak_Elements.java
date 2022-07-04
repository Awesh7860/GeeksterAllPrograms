import java.util.Scanner;
public class Peak_Elements
{
    public static void FindPeakElement(int[] arr,int n)
    {
        int Peak;
        for (int i=0;i<n;i++)
        {
            if (i>=1&&i<n-1&&arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                Peak=arr[i];
                System.out.print(Peak+" ");
            }
        }

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
      FindPeakElement(arr,n);
    }
}
