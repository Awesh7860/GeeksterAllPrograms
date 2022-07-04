import java.util.Scanner;
public class Create_A_Wave_Row_Wise {
    public static void waverowwise(int[][]arr,int row)
    {
        for (int i=0;i<row;i++)
        {
            int j=0;
            int k=row-1;
            if (i%2==0)
            {
                while (j<k)
                {
                    int temp=arr[i][j];
                    arr[i][j]=arr[i][k];
                    arr[i][k]=temp;
                    j++;
                    k--;
                }
            }
        }
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
        waverowwise(arr,row);
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
