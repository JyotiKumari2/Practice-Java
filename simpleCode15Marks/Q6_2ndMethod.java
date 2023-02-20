import java.util.*;
public class Q6_2ndMethod{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        String []ans = {"a", "e", "i", "o", "u"};
        for(int i=0;i<s.length();i++)
        {
            if(s.contains(ans[i]))
               {
                System.out.println(ans[i]);
                break;
               }
        }
    }
}