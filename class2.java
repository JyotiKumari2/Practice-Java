import java.util.*;
public class class2{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        TravelAgencies[] arr = new TravelAgencies[4];
        for(int i=0;i<arr.length;i++)
        {
            int regNo=sc.nextInt();     sc.nextLine();
            String agencyName=sc.nextLine();
            String packageType=sc.nextLine();
             int price=sc.nextInt();  
            boolean flightFacility=sc.nextBoolean();  
            arr[i]=new TravelAgencies(regNo, agencyName, packageType,price,flightFacility);

        }
        int getRegNo = sc.nextInt();
        sc.nextLine();
        String pT=sc.nextLine();
        sc.close();

        int hP = findAgencyWithHighestPackagePrice(arr);
        TravelAgencies tr = agencyDetailsForGivenldAndType(arr, getRegNo, pT);

        System.out.println(hP);
        if (tr == null)
            System.out.println("A string value should be printed here!");
        else
            System.out.println(tr.getAgencyName() + ":" + tr.getPrice());

    }

    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr)
    {
        int max = arr[0].getPrice();
        for(int i=1;i<arr.length;i++)
            max = Math.max(arr[i].getPrice(),max);

        return max;
    }

    public static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies []arr, int rN, String pT)
    {

         for(int i=0;i<arr.length;i++)
             {
                if(arr[i].getFLightFacility())
                {
                    if(arr[i].getRegNo()==rN && arr[i].getPackageType().equalsIgnoreCase(pT))
                      return arr[i];
                }
             }
        return null;
    }
}

class TravelAgencies{


//     regNo – int
// agencyName – String
// pakageType – String
// price – int
// flightFacility – boolean

    int regNo;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;


    // CONSTRUCTOR-----------------------------------
    
    TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility)
    {
        this.regNo=regNo;
        this.agencyName=agencyName;
        this.packageType=packageType;
        this.price=price;
        this.flightFacility=flightFacility;
    }
    
    // GETTERS---------------------------------------XXX------------------

    public int getRegNo()
    {
        return regNo;
    }

    public String getAgencyName()
    {
        return agencyName;
    }

    public String getPackageType()
    {
        return packageType;
    }

    public int getPrice()
    {
        return price;
    }

    public boolean getFLightFacility()
    {
        return flightFacility;
    }


    // SETTERS-----------------------------------X-----------------X------------------
    public void setRegNo()
    {
        this.regNo=regNo;
    }

    public void setAgencyName()
    {
        this.agencyName=agencyName;
    }

    public void setPackageType()
    {
        this.packageType=packageType;
    }

    public void setPrice()
    {
        this.price=price;
    }

    public void setFlightFacility()
    {
        this.flightFacility=flightFacility;

    }

    
}






// import java.util.Scanner;
// public class class2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         TravelAgencies[] ta = new TravelAgencies[4];
//         for (int i = 0; i < ta.length; i++) {
//             int regNo = sc.nextInt();
//             sc.nextLine();
//             String agencyName = sc.nextLine();
//             String packageType = sc.nextLine();
//             int price = sc.nextInt();
//             boolean flightFacility = sc.nextBoolean();
//             ta[i] = new TravelAgencies(regNo, agencyName, packageType, price, flightFacility);
//         }

//         int getRegNo = sc.nextInt();
//         sc.nextLine();
//         String getPackageType = sc.nextLine();
//         sc.close();

//         int highestPackagePrice = findAgencyWithHighestPackagePrice(ta);
//         TravelAgencies travelAgencies = agencyDetailsForGivenIdAndType(ta, getRegNo, getPackageType);

//         System.out.println(highestPackagePrice);
//         if (travelAgencies == null)
//             System.out.println("A string value should be printed here!");
//         else
//             System.out.println(travelAgencies.getAgencyName() + ":" + travelAgencies.getPrice());
//     }
//     public static int findAgencyWithHighestPackagePrice(TravelAgencies[] agencies) {
//         int maxPrice = agencies[0].getPrice();
//         for (int i = 1; i < agencies.length; i++) {
//             if (agencies[i].getPrice() > maxPrice)
//                 maxPrice = agencies[i].getPrice();
//         }
//         return maxPrice;
//     }
//     public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] agencies, int regNo, String packageType) {
//         for (int i = 0; i < agencies.length; i++) {
//             if (agencies[i].getFlightFacility()) {
//                 if (agencies[i].getRegNo() == regNo && packageType.equalsIgnoreCase(agencies[i].getPackageType())) {
//                     return agencies[i];
//                 }
//             }
//         }
//         return null;
//     }
// }

// class TravelAgencies {
//     int regNo;
//     String agencyName;
//     String packageType;
//     int price;
//     boolean flightFacility;
//     TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
//         this.regNo = regNo;
//         this.agencyName = agencyName;
//         this.packageType = packageType;
//         this.price = price;
//         this.flightFacility = flightFacility;
//     }
//     int getRegNo() {
//         return regNo;
//     }
//     String getAgencyName() {
//         return agencyName;
//     }
//     String getPackageType() {
//         return packageType;
//     }
//     int getPrice() {
//         return price;
//     }
//     boolean getFlightFacility() {
//         return flightFacility;
//     }
// }








// TEST CASE:
// 123
// A2Z Agency
// Platinum
// 50000
// true
// 345
// SSS Agency
// Gold
// 30000
// false
// 987
// Cox and Kings
// Diamond
// 40000
// true
// 888
// Global Tours
// Silver
// 20000
// false
// 987
// Diamond

