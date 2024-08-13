//->Inteface with single abstract method is called Functional Interface
//->we can have any no of default & static methods inside Functional Interface
//->with the help of lamda expressions we can implement functional interfaces
interface Demo {
    public void greet();

    default void m2() {
        System.out.println("from m2 method");
    }

    public static void m3() {
        System.out.println("from m3 method");
    }
}

public class FunctionalInterface {
    public static void main(String[] args) {
        Demo i = () -> System.out.println("Hello...");
        i.greet();
    }
}