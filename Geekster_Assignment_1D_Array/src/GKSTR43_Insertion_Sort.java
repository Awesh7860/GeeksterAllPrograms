import java.util.Scanner;
public class GKSTR43_Insertion_Sort
{
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sort(int [] arr,int size)
    {
        for (int i=1;i<size;i++)
        {
            for (int j=i;j>0;j--)
            {
                if (arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else
                {
                    break;
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