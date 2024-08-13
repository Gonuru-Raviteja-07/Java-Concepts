class Animal {
    String name = "Animal";
    void eats() {
        System.out.println("Animal eats to survive");
    }
    Animal(){
        System.out.println("From Animal Class");
    }
}
class lion extends Animal {
    String name = "Lion";
    void printName() {
        //Calling parent class variable
        System.out.println(super.name);
        System.out.println(name);
    }
    void eats() {
        //calling parent class method
        super.eats();
        System.out.println("Lion eats other animal to survive");
    }
    //If parent class has constructor It is called implicitly
    lion(){
        System.out.println("From Lion Class");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        lion l1 = new lion();
        l1.printName();
        l1.eats();
    }
}