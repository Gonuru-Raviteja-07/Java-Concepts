//Marker Interface: Empty Interface(no feilds, no methods)
//->used for giving permission for an object to call a method
//Ex:- Serializable,Cloneable & Remote

interface Demo {

}

// class implements marker interface Demo
class Hello implements Demo {
    public void greet() {
        System.out.println("Hello");
    }
}

// class not implementing marker interface Demo
class Welcome {
    public void greet() {
        System.out.println("Welcome");
    }
}

public class MarkerInterface {
    public static void main(String[] args) {
        Hello d1 = new Hello();
        if (d1 instanceof Demo) {
            d1.greet();//Hello
        } else {
            System.out.println("NO permission");
        }

        Welcome w1 = new Welcome();
        if (w1 instanceof Demo) {
            w1.greet();
        } else {
            System.out.println("NO permission");//No permission
        }
    }
}
