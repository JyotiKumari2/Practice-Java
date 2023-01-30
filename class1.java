import java.util.*;
public class class1{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        //  int size = sc.nextInt();
         Motel []arr = new Motel[4];
         for(int i=0;i<arr.length;i++)
         {
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();   sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble(); sc.nextLine();
            arr[i] = new Motel(a,b,c,d,e,f);
         }

         String s1 = sc.nextLine();

         System.out.println();
        int no = totalNoOfRoomsBooked(arr, s1);
        if(no>0)
        {
          System.out.println(no);
        }
          else
          {
          System.out.println("No such rooms booked");
          }
          

    }


    public static int totalNoOfRoomsBooked(Motel[] arr, String s1)
    {

         int c=0;
          for(int i=0;i<4;i++)
          {
           
            if(arr[i].getNoOfRoomsBooked()>5 && arr[i].getCabFacility()==s1)
               c=c+arr[i].getNoOfRoomsBooked();

          }
          return c;
    }
}

class Motel{
    int motelId;
    String motelName;
    String dateOfBooking;
    int noOfRoomsBooked;
    String cabFacility;
    double totalBill;

    // Constructor

     Motel(int motelId, String motelName, String dateOfBooking, int noOfRoomsBooked, String cabFacility, double totalBill)
     {
          
          this.motelId=motelId;
          this.motelName=motelName;
          this.dateOfBooking=dateOfBooking;
          this.noOfRoomsBooked=noOfRoomsBooked;
          this.cabFacility=cabFacility;
          this.totalBill=totalBill;
     }

    // GETTERS
    public int getId()
    {
        return motelId;
    }

    public String getMotelName()
    {
        return motelName;
    }

    public String getDateOfBooking()
    {
        return dateOfBooking;
    }

    public int getNoOfRoomsBooked()
    {
        return noOfRoomsBooked;
    }

    public String getCabFacility()
    {
        return cabFacility;
    }

    public double getTotalBill()
    {
        return totalBill;
    }


    // SETTERS
    public void setId(int motelId)
    {
        this.motelId=motelId;
    }

    public void setMotelName(String motelName)
    {
        this.motelName=motelName;
    }

    public void setDateOfBooking(String dateOfBooking)
    {
        this.dateOfBooking=dateOfBooking;
    }

    public void setNoOfRoomsBooked(int noOfRoomsBooked)
    {
        this.noOfRoomsBooked=noOfRoomsBooked;
    }

    public void setCabFacility(String cabFacility)
    {
        this.cabFacility=cabFacility;

    }

    public void setTotalBill(double totalBill)
    {
        this.totalBill=totalBill;
    }
}