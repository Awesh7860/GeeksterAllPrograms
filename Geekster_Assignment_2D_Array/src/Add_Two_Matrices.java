import java.util.Scanner;
public class Add_Two_Matrices {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int row1=scn.nextInt();
        int col1=scn.nextInt();
        int [][] arr1=new int[row1][col1];
        for (int i=0;i<row1;i++)
        {
            for (int j=0;j<col1;j++)
            {
                arr1[i][j]=scn.nextInt();
            }
        }
        int row2=scn.nextInt();
        int col2=scn.nextInt();
        int [][] arr2=new int[row2][col2];
        for (int i=0;i<row2;i++)
        {
            for (int j=0;j<col2;j++)
            {
                arr2[i][j]=scn.nextInt();
            }
        }
            if (row1==row2&&col1==col2)
            {
                int[][] ans=new int[row1][col1];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    ans[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    System.out.print(ans[i][j]);
                }
                System.out.println();
            }
            }
        else
        {
            System.out.println("-1");
        }
    }
}
