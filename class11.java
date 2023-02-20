// Q2.

// Create the class RRT(Rapid response team) with the below attributes:



// ticketNo-int

// raisedBy-String 

// assignedTo-String

// priority-int

// project-String



// All attributes should be private,write getters and setters and 

// parameterized constructor as required.



// Create class MyClass with main method.



// Implement a static method-getHighestPriorityTicket in MyClass class.



// getHighestPriorityTicket method:

//      This method will take an array of RRT objects ,and a String value as 

// parameters.This method will return the RRT object with highest priority

// ticket from the array of the RRT objects for the given project(String 

// parameter passed).Highest priority is the one which has lesser value.

// for example:1 is considered as high priority and 5 is considered as 

// low priority.

//    If no RRT with the above condition is present in the array of the 

// RRT objects,then the method should return null.

//    The main method should print the ticketNo,raisedBy and assignedTo

// from returned object if the returned object is not null.if the returned 

// object is null then main method should print "No such Ticket". 











// input1:

// 123

// Velantish

// Mani

// 3

// Xperience

// 234

// Sathish

// Akshaya

// 1

// AIG

// 345

// John

// Jack

// 2

// AIG

// 456

// Bhuvi

// Jack

// 5

// AIG

// AIG



// output1:

// 234

// Sathish

// Akshaya

// **************

// Input2:

// 123

// Velantish

// Mani

// 3

// Xperience

// 234

// Sathish

// Akshaya

// 1

// AIG

// 345

// John

// Jack

// 2

// AIG

// 456

// Bhuvi

// Jack

// 5

// AIG

// Xplore



// output2:

// No such ticket.


//https://tcsxplorejavacodingquestions.blogspot.com/2022/06/22-may-2022-cpa-java-coding-solution.html


import java.util.*;
public class class11{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      RRT []arr=new RRT[4];
      for(int i=0;i<arr.length;i++)
      {        
          int a = sc.nextInt();  sc.nextLine();
          String b = sc.nextLine();
          String c = sc.nextLine();
          int d = sc.nextInt(); sc.nextLine();
          String e = sc.nextLine();
          arr[i]=new RRT(a,b,c,d,e);    
      }

      String givenProject = sc.nextLine();
      sc.close();
      RRT ans = getHighestPriorityTicket(arr,givenProject);
      if(ans==null)
      System.out.println("No such Ticket");
      else
      {
         int a= ans.getTicketNo();
         String b = ans.getAssignedTo();
         String c = ans.getRaisedBy();
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);

      }



   }

   public static RRT getHighestPriorityTicket(RRT[]arr, String givenProject)
   {
      
      int pr=100;
      RRT a=null;
      for(int i=0;i<arr.length;i++)
      {
         if(arr[i].getProject().equalsIgnoreCase(givenProject))
         {
            if(arr[i].getPriority()<pr)
            {
               pr=arr[i].getPriority();
               a=arr[i];
            }
               
         }
      }
      return a;
   }
}

class RRT{
 


     int ticketNo;
     String raisedBy;
     String assignedTo;
     int priority;
     String project;

     public int getTicketNo()
     {
      return ticketNo;

     }

     public String getRaisedBy()
     {
      return raisedBy;
     }

     public String getAssignedTo()
     {
      return assignedTo;
     }

     public int getPriority()
     {
      return priority;
     }

     public String getProject()
     {
      return project;
     }

     // Setters;
     public void setTicketNo(int ticketNo)
     {
      this.ticketNo=ticketNo;

     }

     public void setRaisedBy(String raisedBy)
     {
      this.raisedBy=raisedBy;
     }

     public void setAssignedTo(String assignedTo)
     {
      this.assignedTo=assignedTo;
     }

     public void setPriority()
     {
      this.priority=priority;
     }
     public void setProject()
     {
      this.project=project;
     }

     // CONSTRUCTOR
     

     RRT(int ticketNo, String raisedBy, String assignedTo, int priority, String project)
     {
      this.ticketNo=ticketNo;
      this.raisedBy=raisedBy;
      this.assignedTo=assignedTo;
      this.priority=priority;
      this.project=project;

     }
     
}