 public class Inherit{
  public static void main(String[]args){
  Car c = new Car();
  c.Start();
  c.getKey();
  }
 }
 
 class Vehicle {  //parrent class
  String name;
  String model;

  void Start()
  {
    System.out.println("Car is running");
  }
}
class Car extends Vehicle{
   void getKey(){
    System.out.println("Car key is available");
   }
}
