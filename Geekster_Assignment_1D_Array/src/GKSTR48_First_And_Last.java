import java.util.Scanner;
public class GKSTR48_First_And_Last {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = scn.nextInt();
        }
        int trgt=scn.nextInt();
        int fo=-1;
        int lo=-1;
       for (int i=0;i<size;i++)
       {
           if (arr[i]==trgt)
           {
               if (fo==-1)
               {
                   fo=i;
               }
               lo=i;
           }
       }
        System.out.println(fo);
        System.out.println(lo);
    }
}