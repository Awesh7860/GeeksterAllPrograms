import java.util.Scanner;
public class Rotate_The_Matrix_By_90_Degree_2Nd_Method
{
    public static void RotateBy90Degree(int [][] arr,int n)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (i<j)
                {
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [][] arr=new int[n][n];
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        RotateBy90Degree(arr,n);
        for (int i=0;i<n;i++)
        {
            for (int j=n-1;j>=0;j--)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
