import java.util.*;
public class Q8{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int []arr = new int[26];
        String res ="";
        for(int i=0;i<26;i++)
        {
            arr[i]=0;
        }

        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;

        }
        for(int i=0;i<s.length();i++)
        {
            if(arr[s.charAt(i)-'a']==1)
               res+=s.charAt(i);
            else if(arr[s.charAt(i)-'a']>1)
                {
                    res+=s.charAt(i);
                    arr[s.charAt(i)-'a']=0;
                }
              
        }

        System.out.println(res);

    }
}