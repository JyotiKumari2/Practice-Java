// package simpleCode15Marks;

//Count vowels and consonants in a given string and print them
import java.util.*;
public class Q2 {

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        int vow=0;
        int cons=0;
        for(int i=0;i<s.length();i++)
        {
         
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
            s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
            vow++;
            else
            cons++;
        }

        System.out.println("Vowels: "+vow);
        System.out.println("Consonants: "+cons);

    }
    
}
