import java.util.*;
public class Q3{
    public static void main(String[] args)
    {
        // Write a java program to reverse a given number
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int N=n;
        int num=0;

        while(N!=0)
        {
            int rem = N%10;
            num = num*10+rem;
            N=N/10;

        }

        System.out.println(num);
    }
}