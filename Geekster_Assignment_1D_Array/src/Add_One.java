import java.util.Scanner;
public class Add_One {
    public static int[] addOne(int[] arr,int n)
    {
        int[] ans=new int[n+1];
       int i=n-1;
       int j=n;
       int carry=1;
       while (i>=0&&j>=0)
       {
           int sum=0;
           sum=arr[i]+carry;
           if (sum==10)
           {
               sum=0;
               carry=1;
           }
           else
           {
               carry=0;
           }
           ans[j]=sum;
           i--;
           j--;
       }
       ans[j]=carry;
       return ans;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int[] ans=addOne(arr,n);
        for (int i=0;i<n+1;i++)
        {
            if (i==0&&ans[0]==0)
            {
                continue;
            }
            else
            {
                System.out.print(ans[i]+" ");
            }
        }
    }
}
