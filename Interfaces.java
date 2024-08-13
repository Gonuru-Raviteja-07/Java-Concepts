//Interface : used to specify the behavior of a class by providing an abstract type.
//-> variables which are declared inside the interface are "public,static & final" by default
//-> Methods which are declared inside the interface are "public & abstract" by default
//-> The class which implements an interface should provide the implematation for all the methods of an inteface or else the class must be abstract class.
//-> Interfaces cannot have constructors and cannot be instantiated
//->A interface can extend any no of other intefaces

interface Animal{
    public void eats();
    public void legs();
}

interface Actions {
    public void shouts();
}
interface Demo extends Animal,Actions{

}

class Dog implements Animal,Actions{
   public void eats(){
    System.out.println("Eats pedigree");
   }
   public void legs(){
    System.out.println("4 legs");
   }
   public void shouts(){
      System.out.println("Bow Bow");
   }
}

public class Interfaces {
   public static void main(String[] args) {
     Dog d1=new Dog();
     d1.eats();
   } 
}
