//Abstract class : The class which is prefixed with "abstract" keyword.
//->used to achieve partial abstraction
//->allows both abstract and non-abstract methods
//-> cannot be instatiated, allows constructors

abstract class Animal{
    int i=10;
    //non-abstract method
    public void printName(){
        System.out.println("Animal");
    }
    //abstract method
    abstract void eats();
    //constructor
    Animal(){

    }
    //static method
    public static void lives(){
        System.out.println("lives");
    }
}
class Dog extends Animal{
    @Override
    public void printName(){
        System.out.println("Dog");
    }
    public void eats(){
        System.out.println("Eats pedigree");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.printName();
        d1.eats();
        Dog.lives();
        System.out.println(d1.i);
    }
}
