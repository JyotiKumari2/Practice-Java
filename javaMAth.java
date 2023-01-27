import java.util.RandomAccess;

import javax.swing.event.SwingPropertyChangeSupport;

public class javaMAth {
    

    public static void main(String[] args)
    {
        int s = 8;
        int j = 18;
        System.out.println(Math.max(s,j));
        System.out.println(Math.min(s,j));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-20));
        int randomNUmber = (int)(Math.random()*19); // gives random number between 0 to 18
        System.out.println(randomNUmber);


    }
}
