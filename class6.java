// create a class Antenna with below attributes.
// antennaid=int
// antennaName=String
// projectLead=String
// antennaVSWR=double

// the above attribute should be private ,write getter and
// setter and parametrized constructor as well.

// create class MyClass with main method.
// implement two static methods searchAntennaByName and sortAntennaByVSWR
// in MyClass class.


// searchAntennaByName :
//   This method will take an array of Antenna objects and the
// string value as input parameter.The method will find out Antenna name(String parameter
// passed) .it will return Antennaid if found.if there is no Antenna that matches then the
// method will return zero.
// the main method should print the antennaid,if the returned value is not 0.if the
// returned value is 0 then print,"There is no antenna with the given parameter".


// sortAntennaByVSWR:
// This method will take an array of Antenna Objects and a double value as input.
// this method will return an array of Antenna objects sorted in ascending orderof their
// antennaVSWR. which is less than VSWR(double value passed)       

//   the main method should print name of the project leads from the returned array
// if the returned value is not null.if the returned value is null then main method should
// print "No Antenna found";


// input1:

// 111
// Reconfigurable
// Hema
// 0.4
// 222
// Wearable
// Kavya
// 0.9
// 333
// Microstrip
// Teju
// 0.3
// 444
// Dielectric
// Sai
// 0.65
// Microstrip
// 0.5

// output:
// 333
// Teju
// Hema


// input 2:
// 111
// Reconfigurable
// Hema
// 0.3
// 222
// Wearable
// Kavya
// 0.9
// 333
// Microstrip
// Teju
// 0.4
// 444
// Dielectric
// Sai
// 0.65
// Resonator
// 0.25

// output:
// There is no antenna with given parameter
// No Antenna found

// https://tcsxplorejavacodingquestions.blogspot.com/2021/05/tcs-cpa-java-coding-questionsantenna.html


import java.util.*;
public class class6{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Antenna[] arr = new Antenna[5];
        for(int i=0;i<arr.length;i++)
        {
            int a = sc.nextInt(); sc.nextLine();
            String b= sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            arr[i]=new Antenna(a,b,c,d);
        }

        String s = sc.nextLine();
        double db=sc.nextDouble();
        int aId=searchAntennaByName(arr,s);
        if(aId==0)
        System.out.println("There is no antenna with the given parameter");
        else
        System.out.println(aId);

        Antenna an = sortAntennaByVSWR(arr,db);

        



    }

    public static int searchAntennaByName(Antenna[] arr, String s)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getAntennaName().equalsIgnoreCase(s))
               return arr[i].getAntennaId();
        }
        return 0;
    }

    public static Antenna sortAntennaByVSWR(Antenna[] arr, double db)
    {


        Antenna []ary = new Antenna[0];
        // int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getAntennaVSWR()<db)
            {
                ary=Arrays.copyOf(ary,ary.length+1) ;
                ary[ary.length-1]=arr[i];
            }
        }

        


        
        return null;
    }
}

class Antenna{


   // antennaid=int
   // antennaName=String
   // projectLead=String
   // antennaVSWR=double
    int antennaid;
    String antennaName;
    String projectLead;
    double antennaVSWR;

    // CONSTRUCTOR
    Antenna(int antennaid, String antennaName, String projectLead, double antennaVSWR)
    {
        this.antennaid=antennaid;
        this.antennaName=antennaName;
        this.projectLead=projectLead;
        this.antennaVSWR=antennaVSWR;

    }

    // GETTER
    public int getAntennaId()
    {
        return antennaid;
    }

    public String getAntennaName()
    {
        return antennaName;
    }
    public String getProjectLead()
    {
        return projectLead;
    }

    public double getAntennaVSWR()
    {
        return antennaVSWR;
    }


}