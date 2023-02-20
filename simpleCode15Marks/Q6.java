import java.util.*;
public class Q6{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int min=26;
        char ans='a';
        for(int i=0;i<s.length();i++)
        {

            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||
            s.charAt(i)=='u')
            {
            if(s.charAt(i)-'a'<min)
               {
                min = s.charAt(i)-'a';
                ans=s.charAt(i);
            }
        }

        }
        System.out.println(ans);
    }
}