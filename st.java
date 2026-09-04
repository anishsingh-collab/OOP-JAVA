public class st {
  public static void main(String[] args) {
    Student s1 = new Student("Anish",21,101);
    Student s2 = new Student("Ayush",22,102);
    Student.college = "SNU"; //explicitly setting the static variable college for the Student class
    System.out.println(s1.name + " " + s1.age + " " + s1.rollno + " " + Student.college);
    System.out.println(s2.name + " " + s2.age + " " + s2.rollno + " " + Student.college);
   
  }
  
}

class Student{
  String name;
  int age;
  int rollno;
  static String college;
  Student(String name,int age,int rollno){
    this.name = name;
    this.age = age;
    this.rollno = rollno;
    
  }
}
