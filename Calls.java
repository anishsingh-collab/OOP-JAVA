//call by value vs call by reference

//there is no call by reference in java
//only call by value we just get a taste of call by reference for reference variables as all of them point to the same address in heap memory

class Random{
  int x;
  int y;
 Random(int x,int y){
  this.x =x;
  this.y = y;
 }
}
public class Calls{
  public static void main(String[]args){
    int z = 4;
    int q = 5;

    int x = 4;
    int y = 5;
    System.out.println("Before calling add method x = " + x + " y = " + y);
    add(z, 
      q
    );
    System.out.println("After calling add method x = " + x + " y = " + y);  
  Random r1 = new Random(4,5);
  System.out.println("Before calling addTen method x = " + r1.x + " y = " + r1.y);
  addTen(r1);
  System.out.println("After calling addTen method x = " + r1.x + " y = " + r1.y);
  }
  static void add(int x,int y){
    x = x+10;
    y = y+10;
  }
  static void addTen(Random r){
    r.x = r.x + 10;
    r.y = r.y + 10;
  }

  //4 aur 5 badha nahi
}