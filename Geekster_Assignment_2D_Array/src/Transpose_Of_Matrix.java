import java.util.Scanner;
public class Transpose_Of_Matrix {
    public static int [][] MakeTranspose(int[][] arr,int row,int col)
    {
        int[][] ans=new int[col][row];
        {
            for (int i=0;i<row;i++)
            {
                for (int j=0;j<col;j++)
                {
                   ans[j][i]=arr[i][j];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int row=scn.nextInt();
        int col=scn.nextInt();
        int [][] arr=new int[row][col];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        int[][] ans=MakeTranspose(arr,row,col);
        for (int i=0;i<col;i++)
        {
            for (int j=0;j<row;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
