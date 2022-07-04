import java.util.Scanner;
public class GKSTR33_Print_Alternate {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int size= scn.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=scn.nextInt();
        }
        for (int i=0;i<size;i=i+2)
        {
            System.out.println(arr[i]);
        }
    }
}
