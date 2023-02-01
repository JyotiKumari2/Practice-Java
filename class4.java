import java.util.*;
public class class4{
    public static void main(String[] args)
    {


          Scanner sc=new Scanner(System.in);
          Course[]arr=new Course[5];
          for(int i=0;i<5;i++)
            {
                int a=sc.nextInt(); sc.nextLine();
                String b= sc.nextLine();
                String c=sc.nextLine();
                int d=sc.nextInt(); sc.nextLine();
                int e=sc.nextInt(); sc.nextLine();
                arr[i]=new Course(a,b,c,d,e);
            }

            String admin = sc.nextLine();
            int num = sc.nextInt(); sc.nextLine();
            sc.close();
            int count = findAvgOfQuizByAdmin(arr, admin);
            

    }


    public static int findAvgOfQuizByAdmin(Course[] arr, String admin)
    {
        int c=0;
        int avg=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getCourseAdmin().equalsIgnoreCase(admin))
            {
                avg+=arr[i].getQuiz();
                c++;
            }
        }

        if(c==0)
        return c;
        else
         return (avg/c);

    }

    public static Course sortCourseByHandsOn(Course[]arr, int num)
    {

      
        
        return null;
    }
}

class Course{
    
//     courseId- int
// courseName- String
// courseAdmin- String
// quiz- int
// handson -int

 int courseId;
 String courseName;
 String courseAdmin;
 int quiz;
 int handson;

 // GETTERS

 public int getCourseId()
    {
        return courseId;
    }

 public String getCourseName()
 {
       return courseName;
 }

 public String getCourseAdmin()
 {
    return courseAdmin;
 }

 public int getQuiz()
 {
    return quiz;
 }

 public int getHandSon()
 {
    return handson;
 }

 // SETTERS
 public  void setCourseId(int courseId)
 {
       this.courseId=courseId;

 }


 public void setCourseName(String courseName)
 {
    this.courseName=courseName;
 }

 public void setCourseAdmin(String courseAdmin)
 {
    this.courseAdmin=courseAdmin;
 }

 public void setQuiz(int quiz)
 {
    this.quiz=quiz;
 }

 public void setHandSon(int handson)
 {
    this.handson=handson;
 }


 // CONSTRUCTOR

 Course(int courseId, String courseName, String courseAdmin, int quiz, int handson)
 {
    this.courseId=courseId;
    this.courseName=courseName;
    this.courseAdmin=courseAdmin;
    this.quiz=quiz;
    this.handson=handson;
 }





}