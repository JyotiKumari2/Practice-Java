public class javaMethod {

     static void myMethod()
     {
        System.out.println("Hey! I love connecting with different people :)");
     }

     // parameterised method
     static void myMethod(String s)
     {
        System.out.println(s);
     }


     // Method overloading : multiple functions with same and different parameters
     
     public static void main(String[] args) {
          myMethod();
          myMethod();
          myMethod("Hello");
     }
}
