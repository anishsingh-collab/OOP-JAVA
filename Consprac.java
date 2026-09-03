class Student{
  String name;
  int age;
  int roll;
  String college;

  Student(String name,int age,int roll,String college){
    this.name = name;
    this.age = age;
    this.roll = roll;
    this.college = college;
  }
}
public class Consprac {

  public static void main(String[]args){
    Student s1 = new Student("Anish",21,101,"SNU");
    System.out.println("Name: " + s1.name); 
    System.out.println("Age: " + s1.age);
    System.out.println("Roll Number: " + s1.roll);
    System.out.println("College: " + s1.college); 
  }
  
}
