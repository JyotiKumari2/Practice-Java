// Print the sum of odd digits in a given number if the sum is greater than 8
// otherwise print "NA"
import java.util.*;
public class Q7{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int odSum=0;
        int N=n;
        while(N!=0)
        {
            int rem = N%10;
            if(rem%2!=0)
              odSum+=rem;
              N/=10; 
        }
        if(odSum>8)
         System.out.println(odSum);
         else
         System.out.println("NA");
    }
}