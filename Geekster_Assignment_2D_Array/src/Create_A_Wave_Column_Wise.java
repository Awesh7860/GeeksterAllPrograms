import java.util.Scanner;
public class Create_A_Wave_Column_Wise {
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
        for (int j=0;j<col;j++)
        {
            if (j%2==0)
            {
                for (int i=0;i<row;i++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else
            {
                for (int i=row-1;i>=0;i--)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
