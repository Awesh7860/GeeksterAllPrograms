import java.util.Scanner;
public class GKSTR44_Bubble_Sort {
    public static void swap(int[] arr,int j )
    {
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }
    public static void sort(int [] arr,int size)
    {
        for (int i=0;i<size-1;i++)
        {
            for (int j=0;j<size-i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    swap(arr,j);
                }
            }
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
