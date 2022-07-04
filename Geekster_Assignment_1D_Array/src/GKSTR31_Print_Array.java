import java.util.Scanner;
public class GKSTR31_Print_Array {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int length=scn.nextInt();
        int[] arr=new int[length];
        for (int i=0;i<length;i++)
        {
            arr[i]= scn.nextInt();
            System.out.println(arr[i]);
        }
    }
}
