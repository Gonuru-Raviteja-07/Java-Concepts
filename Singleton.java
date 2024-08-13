//Instance of a class is created only "ONCE" (Singleton)
class Demo {
  int x = 10;
  public static Demo d1 = null;

  public static Demo getInstance() {
    if (d1 == null) {
      System.out.println("1st time");
      d1 = new Demo();
    }
    return d1;
  }
}

public class Singleton {
  public static void main(String[] args) {
    System.out.println(Demo.getInstance().x);
  }
}
