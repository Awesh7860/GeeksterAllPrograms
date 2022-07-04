import java.util.Scanner;
public class GKSTR40_Continuous_Sum_of_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=scn.nextInt();
        }
        int sum=0;
        for (int i=0;i<size;i++)
        {
            sum=sum+arr[i];
            System.out.print(sum+" ");
        }
    }
}
