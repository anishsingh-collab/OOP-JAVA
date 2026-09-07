class BankAccount{
  private double balance;

  public void deposit(int amount){
    balance+=amount;
  }
  public void withdraw(int amount){
    balance-=amount; 
  }
  public double getBalance(){
    return balance;
  }
}
class Student{
   private String name;
 private int roll;
  private int age;
  private String college;
  Student(String name,int roll,int age,String college){
    this.name=name;
    this.roll=roll;
    this.age=age;
    this.college=college;
  }
  //getters and setters
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }
  public String getCollege(){
    return college;
  }
  public void setCollege(String college){
    this.college=college;  //first and last name validation 
  }
}

public class Encap {
  public static void main(String[]args){
     
  }
}
