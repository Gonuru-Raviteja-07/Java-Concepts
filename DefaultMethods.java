//Default Method (or) Defender Method (or) Virtual Extension Method
//->Methods with default implementation inside interfaces
//->allowed only inside "Interfaces"
//->Default methods are used to add new methods inside interface without effecting the implementing classes
//->Can be "Overriden" to change the implementation

interface interf {
    default void m1() {
        System.out.println("Default Implementation");
    }
}
class Demo implements interf{
    public void m1(){
        System.out.println("Changed Implementation");
    }
}

public class DefaultMethods {
    public static void main(String[] args) {
     Demo d1=new Demo();
     d1.m1();
    }
}
