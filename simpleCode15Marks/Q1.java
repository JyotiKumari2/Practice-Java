// Count of odd digits in a given number , if odd digit count is greater than 3 
// print odd count otherwise print "IT IS NOT A VALID NUMBER"
//Example :
// Input : 12357, odd digit count==4 therefore,
//Output: 4

import java.util.*;
public class Q1{
public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int odd=0;
    while(n!=0)
    {
        int rem = n%10;
        if(rem%2!=0)
          odd++;
        n=n/10;

    }

    if(odd>3)
    System.out.println(odd);
    else
    System.out.println("IT IS NOT A VALID NUMBER");

}
    
}