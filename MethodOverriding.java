//Method Overriding : Changing the implementation of a parent class method inside the child class.
//-> To achive this there should be a parent chaild relation
//-> It is Run time polymorphism
//-> static methods cannot be overriden because they are associated with the class

class Parentclass {
    public void greet() {
        System.out.println("Hello from parent class");
    }
}

class Childclass extends Parentclass {
    @Override
    public void greet() {
        System.out.println("Hello from child class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parentclass c1=new Childclass();
        c1.greet();
      
    }
}
