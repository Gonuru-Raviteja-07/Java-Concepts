//static methods: Methods with static keyword
//->can be accessed outside the class with class name
//->can also be called with the object reference & null reference variable
//->cannot be overriden
class Demo1{
    public static void greet(){
        System.out.println("Hello from parent class");
    }
}
class Demo2 extends Demo1{
    public static void welcome(){
        System.out.println("Welcome");
    }
}


public class StaticMethods {
    public static void main(String[] args) {
       Demo1.greet();
       Demo2.welcome();
    }
}
