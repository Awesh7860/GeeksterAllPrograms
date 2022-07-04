import java.util.Scanner;
public class Print_Reverse_of_2D_Matrix {
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
        for (int i=row-1;i>=0;i--)
        {
            for (int j=col;j>=0;j--)
            {
                System.out.print(arr[i][j]+" ");    //print elements in reverse order
            }
            System.out.println();
        }
    }
}
