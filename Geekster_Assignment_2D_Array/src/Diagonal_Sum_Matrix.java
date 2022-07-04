import java.util.Scanner;
public class Diagonal_Sum_Matrix {
    public static int DiagonalSum(int[][] arr,int n)
    {
        int ans=0;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (i==j||i+j==n-1)
                {
                    ans=ans+arr[i][j];
                }
            }
        }
        return ans;
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
        int ans=DiagonalSum(arr,n);
        System.out.println(ans);
    }
}
