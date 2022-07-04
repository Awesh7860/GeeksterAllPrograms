import java.util.Scanner;
public class Convert_1D_Array_To_2D_Array {
    public static int[][] convert1dto2d(int[] arr,int N,int p,int q)
    {
        int[][] ans=new int[p][q];
        for (int i=0;i<p;i++)
        {
            for (int j=0;j<q;j++)
            {
                ans[i][j]=arr[i*q+p];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();
        int[] arr=new int[N];
        for (int i=0;i<N;i++)
        {
            arr[i]=scn.nextInt();
        }
        int p=scn.nextInt();
        int q=scn.nextInt();
        int [][] ans=convert1dto2d(arr,N,p,q);
        for (int i=0;i<p;i++)
        {
            for (int j=0;j<q;j++)
            {
                System.out.print(ans[i]);
            }
            System.out.println();
        }
    }
}
