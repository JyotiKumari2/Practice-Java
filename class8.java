// Question:

// Create a class Sim with below attributes:



// simId - int

// customerName - String

// balance - double

// ratePerSecond - double

// circle - String



// Write getters, setters and parameterized constructor as required. 



// Public class Solution is already created with main method.

// Code inside main method should not be altered else your solution might be 

// scored as zero.You may copy the code from main method in eclipse to 

// verify your implementation. 





// Implement static method - transferCustomerCircle in Solution class.

// This method will take first parameter as array of Sim class objects, 

// second parameter as circle to be transferred (which is String parameter 

// circle1) and third parameter as new circle (which is String parameter 

// circle2).



// Method will transfer the customer to new circle (circle2), where the

// circle attribute would match second parameter (circle1). 

// Method will return array of Sim objects for which circle is transferred.

// Return array should be sorted in descending order of ratePerSecond

// (assuming ratePerSecond is not same for any of the Sim objects).





// This method should be called from main method and display the simId,

// customerName,circle and ratePerSecond of returned objects 

// (as per sample output).



// Main method mentioned above already has Scanner code to read values, 

// create objects and test above methods. Hence do not modify it.





// ************************************************************************



// Consider below sample input and output:



// Input:

// 1

// raj

// 100

// 1.5

// KOL

// 2

// chetan

// 200

// 1.6

// KOL

// 3

// asha

// 150

// 1.7

// MUM

// 4

// kiran

// 50

// 2.2

// KOL

// 5

// vijay

// 130

// 1.8

// KOL

// AHD

// KOL



// Output:

// 4 kiran KOL 2.2

// 5 vijay KOL 1.8

// 2 chetan KOL 1.6



// *******************************************************************************


//https://tcsxplorejavacodingquestions.blogspot.com/2022/02/solving-tcs-cpa-java.html

import java.util.*;
public class class8{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         Sim []arr=new Sim[5];
         for(int i=0;i<arr.length;i++)
         {

 
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble(); sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();
            String e = sc.nextLine();
            arr[i]= new Sim(a,b,c,d,e);

         }

         String circle1= sc.nextLine();
         String circle2= sc.nextLine();
         sc.close();
         Sim ans[] = transferCustomerCircle(arr,circle1,circle2);
         

    }

    public static Sim[] transferCustomerCircle(Sim[] arr, String circle1, String circle2)
    {

        double[] rate=new double[0];
        for(int i=0;i<5;i++)
        {
            if(arr[i].getCircle().equalsIgnoreCase(circle1))
            {
                arr[i].circle=circle2;
                rate = Arrays.copyOf(rate,rate.length+1);
                rate[rate.length-1]=arr[i].getRatePerSecond();



            }
        }

        Arrays.sort(rate);
        Sim[]temp=new Sim[0];
        for(int i=rate.length-1;i>=0;i--)
        {
            for(int j=0;i<arr.length;j++)
            {
                if(arr[j].getRatePerSecond()==rate[i]);
                {
                    temp=Arrays.copyOf(temp,temp.length+1);
                    temp[temp.length-1]=arr[j];

                }
            }
        }
        if(rate.length>0)
          return temp;
        else
        return null;
    }
}

class Sim{
 

     int simId;
     String customerName;
     double balance;
     double ratePerSecond;
     String circle;

     // GETTERS
     public int getSimId()
     {
        return simId;
     }

     public String getCustomerName()
     {
        return customerName;
     }

     public double getBalance()
     {
        return balance;
     }

     public double getRatePerSecond()
     {
        return ratePerSecond;
     }
     public String getCircle()
     {
        return circle;
     }


     // SETTERS
     public void setSimId(int simId)
     {
        this.simId=simId;

     }

     public void setCustomerName(String customerName)
     {
        this.customerName=customerName;
     }

     public void setBalance(double balance)
     {
        this.balance=balance;
     }
     public void setRatePerSecond(double ratePerSecond)
     {
        this.ratePerSecond=ratePerSecond;
     }

     public void setCircle(String circle)
     {
        this.circle=circle;
     }


     // CONSTRUCTOR;
     Sim(int simId, String customerName, double balance, double ratePerSecond, String circle)
     {
        this.simId=simId;
        this.customerName=customerName;
        this.balance=balance;
        this.ratePerSecond=ratePerSecond;
        this.circle=circle;
     }
}