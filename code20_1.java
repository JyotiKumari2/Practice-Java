import java.util.*;
public class code20_1{

    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int c=0;
        while(a!=0)
        {
            
            int rem = a%10;
            a=a/10;
            if(rem%2==0)
              c++;
        }
        if(c>=3)
          System.out.println("True");
          else
          System.out.println("False");
    } 
    
}
