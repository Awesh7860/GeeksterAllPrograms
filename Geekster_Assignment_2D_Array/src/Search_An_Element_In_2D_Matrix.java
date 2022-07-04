import java.util.Scanner;
public class Search_An_Element_In_2D_Matrix {
    public static boolean search(int[][] arr,int row,int col,int trgt)
    {
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                if (arr[i][j]==trgt)
                {
                    return true;
                }
            }
        }
        return false;
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
                arr[i][j]=scn.nextInt();    //input elements in matrix
            }
        }
        int trgt=scn.nextInt();
        boolean ans=search(arr,row,col,trgt);
        if(ans==true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
