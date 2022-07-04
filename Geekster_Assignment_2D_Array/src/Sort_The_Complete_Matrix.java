import java.util.Arrays;
import java.util.Scanner;
public class Sort_The_Complete_Matrix {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int [][] arr=new int[n][m];
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
       int[] arr1=new int[n*m];
        for (int idx=0;idx<n*m;idx++)
        {
            int x=idx/m;
            int y=idx%m;
            arr1[idx]=arr[x][y];
        }
        Arrays.sort(arr1);
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                arr[i][j]=arr1[i*m+j];
            }
        }
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
