//METHOD OVER LOADING(compile time polymoephism)
//same method name but does different funtions or work
class Car{
    String name;
    int price;
    public void printInfo(String name){
      System.out.println(name);
    }
    public void printInfo(int price){
      System.out.println(price);
    }
    public void printInfo(String name,int price){
      System.out.println(name);
      System.out.println(price);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.name="Alto";
        c1.price=10000;
        c1.printInfo(c1.name);
        c1.printInfo(c1.price);
        c1.printInfo(c1.name,c1.price);
    }
}
