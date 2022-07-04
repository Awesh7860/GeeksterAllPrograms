import java.util.Scanner;
public class GKSTR36_Count_IndexValue_Element {
    public static int countelement(int [] arr,int length)
    {
        int count=0;
        for (int i=0;i<length;i++)
        {
            if (arr[i]==i)
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
        int count=countelement(arr,length);
        System.out.println(count);
    }
}
