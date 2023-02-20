import java.util.*;
public class Q5{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        s=s.toLowerCase();
        
        String res="";
        for(int i=s.length()-1;i>=0;i--)
        {
            res+=s.charAt(i);
        }

        System.out.println(res);
        

    }
}