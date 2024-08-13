//public: can be accessed from any where
//private : can be accessed only with in the same class
//protected : can be accessed in the same package and outside the package through sub classes
//default : cab be accessed in the same package
class Demo {
  int i = 10;
  public int j = 20;
  private int k = 30;
  protected int l = 40;

  // All can be accessed within the same class
  public void d1() {
    System.out.println(i);// 10
    System.out.println(j);// 20
    System.out.println(k);// 30
    System.out.println(l);// 40
  }
}
// Except private all others can be accessed in the subclass but in the same package
class Hello extends Demo {
  public void d1() {
    System.out.println(i);// 10
    System.out.println(j);// 20
    //System.out.println(k); CTE
    System.out.println(l);// 40
  }
}
public class AccessModifiers {
  // except private all others can be accessed outside the class but in the same package
  public static void main(String[] args) {
    Demo s1 = new Demo();
    System.out.println(s1.i);// 10
    System.out.println(s1.j);// 20
    //System.out.println(s1.k); CTE
    System.out.println(s1.l);// 40
  }
}
