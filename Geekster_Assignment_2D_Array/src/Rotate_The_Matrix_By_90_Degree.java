import java.util.Scanner;
public class Rotate_The_Matrix_By_90_Degree {
    public static void MakeTranspose(int [][] arr,int n)
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
    public static void rotateby90degree(int [][] arr,int n)
    {
        MakeTranspose(arr,n);
        for (int row=0;row<n;row++)
        {
            int i=0;
            int j=n-1;
            while (i<j)
            {
                int temp=arr[row][i];
                arr[row][i]=arr[row][j];
                arr[row][j]=temp;
                i++;
                j--;
            }
        }
    }
    public static void main(String[] args) {
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
        rotateby90degree(arr,n);
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
