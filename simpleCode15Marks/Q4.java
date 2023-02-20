import java.util.*;
public class Q4{
    public static void main(String[]args)
    {
        // Computer the number of spaces and characters in a given string
        // and ignore the numbers if present 
        // Example :
        // Input: Hello this is ABCD from XYZ city
        // Output: Spaces = 6, Characters = 26
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int spaces =0;
        int characters = 0;
        for(int i=0;i<s.length();i++)
        {
            // if(s.charAt(i)==' ')
            //   spaces++;
            // if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)=='A' && s.charAt(i)<='Z'))
            //      characters++;

            if(Character.isLetter(s.charAt(i)))
                 characters++;
                 else if(s.charAt(i)==' ')
                   spaces++;
        }

        System.out.println("Spaces: "+spaces);
        System.out.println("Characters: "+characters);

    }
}