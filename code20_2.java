import java.util.*;
public class code20_2 {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        Motel[]arr=new  Motel[4];
        for(int i=0;i<arr.length;i++)
        {
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine(); 
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble(); sc.nextLine();

            arr[i]=new Motel(a,b,c,d,e,f);
        

        }

        String s = sc.nextLine();
       sc.close();
       int count=totalNoOfRoomsBooked(arr, s);
       if(count==0)
         System.out.println("No such rooms booked");
        else
        System.out.println(count);

    }

    public static int totalNoOfRoomsBooked(Motel[]arr, String s)
    {
        int c=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getNoOfRoomsBooked()>5 && arr[i].getCabFacility().equalsIgnoreCase(s))
              c+=(arr[i].getNoOfRoomsBooked());
        }
        return c;
    }
    
}

class Motel{
//     motelId - int
// motelName - String
// dateOfBooking – String (in the format dd-mon-yyyy)
// noOfRoomsBooked – int
// cabFacility – String
// totalBill- double

   int motelId;
   String motelName;
   String dateOfBooking;
   int noOfRoomsBooked;
   String cabFacility;
   double totalBill;

   // Getters
   public int getMotelId()
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

   //SETTERS
   public void setMotelId(int motelId)
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

   // Constructor

//     motelId - int
// motelName - String
// dateOfBooking – String (in the format dd-mon-yyyy)
// noOfRoomsBooked – int
// cabFacility – String
// totalBill- double
   Motel(int motelId, String motelName, String dateOfBooking, int noOfRoomsBooked, String cabFacility, double totalBill)
   {
    
    this.motelId=motelId;
    this.motelName=motelName;
    this.dateOfBooking=dateOfBooking;
    this.noOfRoomsBooked=noOfRoomsBooked;
    this.cabFacility=cabFacility;
    this.totalBill=totalBill;
   }


}
