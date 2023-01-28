import java.util.Scanner;
public class sampleClass {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
Motel[] Motel = new Motel[4];
for(int i=0;i<Motel.length;i++)
{
int motelId = sc.nextInt();sc.nextLine();
 
String motelName=sc.nextLine();
String date = sc.nextLine();
int noOfRooms = sc.nextInt(); sc.nextLine();
String cab=sc.nextLine();
double bill= sc.nextDouble();
sc.nextLine();
Motel[i]= new Motel(motelId,motelName,date, noOfRooms,cab,bill);
}
String cabFaci = sc.nextLine();
int nos = totalNoOfRoomsBooked(Motel,cabFaci);
if(nos>0)
{ System.out.println(nos);
}
else {
System.out.println("No such rooms booked");
}
}

public static int totalNoOfRoomsBooked(Motel[] motel,String cabFaci)
{
int count=0;
for(Motel mo:motel)
{
if(mo.getNoOfRoomsBooked()>5 && mo.getCabFacility().equalsIgnoreCase(cabFaci))
{
 
count = count+ mo.getNoOfRoomsBooked();
}
}
return count;
}
}
class Motel {
int motelId;
String motelName;
String dateOfBooking;
int noOfRoomsBooked;
String cabFacility;
double totalbill;
public int getMotelId() {
return motelId;
}
public void setMotelId(int motelId) {
this.motelId = motelId;
}
public String getMotelName() {
return motelName;
}
 
public void setMotelName(String motelName) {
this.motelName = motelName;
}
public String getDateOfBooking() {
return dateOfBooking;
}
public void setDateOfBooking(String dateOfBooking) {
this.dateOfBooking = dateOfBooking;
}
public int getNoOfRoomsBooked() {
return noOfRoomsBooked;
}
public void setNoOfRoomsBooked(int noOfRoomsBooked) {
this.noOfRoomsBooked = noOfRoomsBooked;
}
public String getCabFacility() {
return cabFacility;
}
public void setCabFacility(String cabFacility) {
this.cabFacility = cabFacility;
}
public double getTotalbill() {
return totalbill;
}
public void setTotalbill(double totalbill) {
this.totalbill = totalbill;
}
public Motel(int motelId, String motelName, String dateOfBooking, int noOfRoomsBooked, String cabFacility,

double totalbill) {
super();
this.motelId = motelId;
this.motelName = motelName;
this.dateOfBooking = dateOfBooking;
this.noOfRoomsBooked = noOfRoomsBooked;
this.cabFacility = cabFacility;
this.totalbill = totalbill;
}
}