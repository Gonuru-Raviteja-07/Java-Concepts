//->When all the methods of a class are static methods instead of using class we can use interface to declare all the static methods because class is more costly than interface
//->static methods of interface can be called with the name of the interface 
//->From java 1.8 we can declare the main method inside the interface
interface Demo{
    public static void m1(){
        System.out.println("Hello1");
    }
    public static void m2(){
        System.out.println("Hello2");
    }
}

public class InterfaceStaticMethods {
    public static void main(String[] args) {
        Demo.m1();
        Demo.m2();
    }
}
