class Address {
    String city;
    
    Address(String city) {
        this.city = city;
    }
}

class Person {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}

public class Shallow {
    public static void main(String[] args) {
        
        // ------------- SHALLOW COPY -------------
        System.out.println("--- SHALLOW COPY ---");
        Address add1 = new Address("Delhi");
        Person p1 = new Person("Anish", add1);

        // Creating p2 (Shallow Copy)
        // We pass the SAME address object to p2
        Person p2 = new Person(p1.name, p1.address); 
        
        System.out.println("Before changing:");
        System.out.println("p1 city: " + p1.address.city);
        System.out.println("p2 city: " + p2.address.city);

        // Agar p2 ka city change kiya, toh p1 ka bhi change ho jayega
        // Kyunki dono same Address object ko point kar rahe hain
        p2.address.city = "Mumbai"; 

        System.out.println("\nAfter changing p2's city to Mumbai:");
        System.out.println("p1 city: " + p1.address.city); // p1 will also change!
        System.out.println("p2 city: " + p2.address.city);


        // ------------- DEEP COPY -------------
        System.out.println("\n--- DEEP COPY ---");
        Address add3 = new Address("Pune");
        Person p3 = new Person("Ayush", add3);

        // Creating p4 (Deep Copy)
        // We create a completely NEW Address object for p4 using p3's city
        Address add4 = new Address(p3.address.city); 
        Person p4 = new Person(p3.name, add4);

        System.out.println("Before changing:");
        System.out.println("p3 city: " + p3.address.city);
        System.out.println("p4 city: " + p4.address.city);

        // Agar p4 ka city change kiya, toh p3 par koi asar nahi hoga
        // Kyunki dono ke paas alag-alag Address objects hain
        p4.address.city = "Bangalore";

        System.out.println("\nAfter changing p4's city to Bangalore:");
        System.out.println("p3 city: " + p3.address.city); // p3 will NOT change!
        System.out.println("p4 city: " + p4.address.city);
    }
}
