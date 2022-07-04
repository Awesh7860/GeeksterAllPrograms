import java.util.Scanner;
public class GKSTR32_Reverse_Array {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int size=scn.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=scn.nextInt();
        }
        for (int i=size-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
