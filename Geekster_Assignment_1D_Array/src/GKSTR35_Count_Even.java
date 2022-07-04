import java.util.Scanner;
public class GKSTR35_Count_Even {
    public static int counteven(int [] arr,int length)
    {
        int count=0;
        for (int i=0;i<length;i++)
        {
            if (arr[i]%2==0)
            {
               count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int length=scn.nextInt();
        int[] arr=new int[length];
        for (int i=0;i<length;i++)
        {
            arr[i]= scn.nextInt();
        }
        int count=counteven(arr,length);
        System.out.println(count);
    }
}
