public class StaticVariables {
  // static variable can be accessed by both static and non static methods
  static int i = 10;

  // non static variable cannot be accessed by static methods
  int j = 20;

  //non-static method
  public void greet() {
    System.out.println("from non static method " + i);
    System.out.println("from non static method " + j);
  }

  //static method
  public static void main(String[] args) {
    System.out.println("from static method " + i);
    //To access non static variables inside static methods we should create object of the class and with the help of object reference we can access
    StaticVariables h1 = new StaticVariables();
    System.out.println("from static method " + h1.j);
    h1.greet();
  }
}
