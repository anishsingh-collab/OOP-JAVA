public class Fin {
  public static void main(String[]args){
    Random r1 = new Random();
    System.out.println(r1.PI);
    //r1.PI = 3.15; //error as PI is final and cannot be changed
    
  }
}

class Random{
  final double PI = 3.14;
}
