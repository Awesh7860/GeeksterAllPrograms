import java.util.Scanner;
public class Compare_Two_Matrices {
    //Compare the two matrices and print "Same" if both the matrices are same else print "Not Same".
    public static boolean test(int[][] arr1,int[][] arr2,int row1,int col1,int row2,int col2)
    {
        if (row1!=row2||col1!=col2)
        {
            return false;
        }

            for (int i=0;i<row1;i++)
            {
                for (int j=0;j<col1;j++)
                {
                    if (arr1[i][j]!=arr2[i][j])
                    {
                      return false;
                    }
                }
            }
        return true;
    }
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
        boolean ans=test(arr1,arr2,row1,col1,row2,col2);
        if (ans==true)
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Not Same");
        }
    }
}
