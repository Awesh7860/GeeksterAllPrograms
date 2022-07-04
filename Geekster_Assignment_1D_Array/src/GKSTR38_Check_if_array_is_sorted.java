import java.util.Scanner;
public class GKSTR38_Check_if_array_is_sorted {
    public static boolean check(int [] arr,int length)
    {
        for (int i=0;i<length;i++)
        {
            if (arr[i]<arr[i+1])
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int length=scn.nextInt();
        int[] arr=new int[length];
        for (int i=0;i<length;i++)
        {
            arr[i]= scn.nextInt();
        }
        boolean ans=check(arr,length);
        if (ans==true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}

