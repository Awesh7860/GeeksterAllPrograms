import java.util.Scanner;
public class GKSTR45_Selection_Sort {
    public static void swap(int[] arr,int i,int minidx)
    {
        int temp=arr[i];
        arr[i]=arr[minidx];
        arr[minidx]=temp;
    }
    public static void sort(int [] arr,int size)
    {
        for (int i=0;i<size-1;i++)
        {
            int minidx=i;
            for (int j=i+1;j<size;j++)
            {
                if (arr[j]<arr[minidx])
                {
                    minidx=j;
                }
            }
            swap(arr,i,minidx);
        }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=scn.nextInt();
        }
        sort(arr,size);
        for (int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
