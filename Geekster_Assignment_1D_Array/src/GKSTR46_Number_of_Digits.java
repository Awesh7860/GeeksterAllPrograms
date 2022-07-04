//*************Take an integer N as input.Print the number of digits present in N.***************//
import java.util.Scanner;
public class GKSTR46_Number_of_Digits
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int count=0;
        while (num>0)
        {
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
