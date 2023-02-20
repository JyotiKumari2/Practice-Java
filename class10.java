// Q1.Write main method in the MyClass class.

// In the main method,read an int value.Reverse the number and print it 

// only if the given number is odd.Else print the String "Cannot reverse".

// for example if the given number is 123 which is an odd number,

// we need to reverse the number and output should be 321.



// sample input1:

// 123

// output:

// 321



// sample input2:

// 788

// output:

// Cannot reverse.

// ***********************************************************************************

import java.util.*;
public class class10{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=0;
        if(n%2==0)
         System.out.println("Cannot Reverse");
         else{
            while(n!=0)
            {
                int rem = n%10;
                m = (m*10)+rem;
                n=n/10;

                

            }
            System.out.println(m);
            
         }
    }
}
