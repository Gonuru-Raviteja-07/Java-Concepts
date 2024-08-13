//AnonymousInnerClass : A class without a name and for which only single object is created
//->we can override a method of a class without a subclass
//->we can provide implementation of abstract methods of an abstract classes and interfaces without a subclass

//non-abstract class
class Demo1{
    public void show(){
        System.out.println("From class Demo");
    }
}
//abstract class
abstract class Demo2{
    public abstract void show();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Demo1 a=new Demo1(){
            public void show(){
                System.out.println("from Anonymous Inner class");
            }
        };
        a.show();

        Demo2 b=new Demo2(){
            public void show(){
                System.out.println("from Anonymous Inner class");
            }
        };
        b.show();
    }
}
