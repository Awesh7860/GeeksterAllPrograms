import java.util.Scanner;
public class Create_A_Wave_Row_Wise_2Nd_Method {
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
        for (int i=0;i<row;i++)
        {
           if (i%2==0)
           {
               for (int j=0;j<col;j++)
               {
                   System.out.print(arr[i][j]+" ");
               }
           }
           else
           {
               for (int j=col-1;j>=0;j--)
               {
                   System.out.print(arr[i][j]+" ");
               }
           }
            System.out.println();
        }
    }
}
