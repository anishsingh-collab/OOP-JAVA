class Student{
  String name;//instance variable
  String college;
  int age;
  int rollNumber;
  void MarkAttendance(){//instance method
    System.out.println("Attendance Marked");
  }
}
public class Demo {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Anish";
    s1.age = 21;
     
    System.out.println(s1.name);//default values
     
  }
  
}
