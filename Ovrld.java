class Student{
  String name;
  int age;
  int roll;
  String college;
  Student(){

  }
  Student(String name){ //name = name is  
   this(name,0,0,null);//is constructor se sabse bade waale ko call kiya 
  }

  Student(String name,int age){
    this.name = name;
    this.age = age;//isko call kiya toh name and age de payenge
  }
  Student(String name,int age,int roll){
    this.name = name;
    this.age = age;
    this.roll = roll;
  }
  Student(String name,int age,int roll,String college){
    this.name = name;
    this.age = age;
    this.roll = roll;
    this.college = college;
  }
}
public class Ovrld {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student("Anish");
    Student s3 = new Student("Anish",21);
    Student s4 = new Student("Anish",21,101);
    Student s5 = new Student("Anish",21,101,"XYZ College");
    System.out.println("Name: " + s2.name);
    System.out.println("Age: " + s2.age);
    System.out.println("Roll: " + s4.roll);
    System.out.println("College: " + s5.college);
  }
  
}
