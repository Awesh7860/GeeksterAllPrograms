import java.util.Scanner;
public class GKSTR37_Search_Element {
    public static int checkIdxValue(int [] arr,int length,int x)
    {
        for (int i=0;i<length;i++)
        {
            if (arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int length=scn.nextInt();
        int[] arr=new int[length];
        for (int i=0;i<length;i++)
        {
            arr[i]= scn.nextInt();
        }
        int x=scn.nextInt();
        int val=checkIdxValue(arr,length,x);
        System.out.println(val);
    }
}
