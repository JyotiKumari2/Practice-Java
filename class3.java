import java.util.*;
public class class3{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       Footwear[]arr=new Footwear[5];
       for(int i=0;i<arr.length;i++)
       {
        int footwearId=sc.nextInt(); sc.nextLine();
        String footwearName=sc.nextLine();
        String footwearType=sc.nextLine();
        int price =sc.nextInt(); sc.nextLine();

        arr[i] = new Footwear(footwearId,footwearName,footwearType,price);

       }


       String fwT=sc.nextLine();
       String fwN = sc.nextLine();
       sc.close();

       int count=getCountByType(arr, fwT);

       Footwear fObj =getSecondHighestPriceByBrand(arr, fwN);
         

       if(count==0)
         System.out.println("Footwear not available");
         else
         System.out.println(count);

      if(fObj==null)
          System.out.println("Brand not available");
    else
    {
        System.out.println(fObj.getFootwearId());
        System.out.println(fObj.getFootwearName());
        System.out.println(fObj.getPrice());
    }


    }

    public static int getCountByType(Footwear[]arr, String fwT)
    {

        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getFootwearType().equalsIgnoreCase(fwT))
            c++;

        }
        return c;
    }


    public static Footwear getSecondHighestPriceByBrand(Footwear[]arr , String fwN)
    {

         
        //  Vector<Integer> v = new Vector<>();
        int []v =new int[5];
        for(int i=0;i<5;i++)
          v[i]=0;
        int k=0;
         for(int i=0;i<arr.length;i++)
         {
            if(arr[i].getFootwearName().equalsIgnoreCase(fwN))
              v[k++]=arr[i].getPrice();
                
         }

         Arrays.sort(v);


         int max2=v[3];
         for(int i=0;i<arr.length;i++)
         {
            if(arr[i].getFootwearName().equalsIgnoreCase(fwN)  && arr[i].getPrice()==max2)
                    return arr[i];
         }
         



        

        


 

        

        return null;
    }
}

class Footwear{


    // footwearId=int
    // footwearName=String
    // footwearType=String
    // price =int


    int footwearId;
    String footwearName;
    String footwearType;
    int price;


    // CONSTRUCTOR
    Footwear(int footwearId, String footwearName, String footwearType, int price)
    {
        this.footwearId=footwearId;
        this.footwearName=footwearName;
        this.footwearType=footwearType;
        this.price=price;

    }

    // GETTERS---------------------------------------------------------------------

    public int getFootwearId()
    {
        return footwearId;
    }

    public String getFootwearName()
    {
        return footwearName;
    }

    public String getFootwearType()
    {
        return footwearType;
    }

    public int getPrice()
    {
        return price;

    }

    // SETTERS--------------------------------------------


      
}