import java.util.*;
public class Q9{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        char c = sc.next().charAt(0);
        int co=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
              co++;
        }
        System.out.println(co);

    }
}