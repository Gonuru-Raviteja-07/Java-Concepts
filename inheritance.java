abstract class Animal{
    String name;
    public void eats(){
    System.out.println("Animal Eats");
    }
}
class Horse extends Animal{
    public void eats(String a){
    System.out.println(a+""+" Eats Grass");
    }
}
class Lion extends Animal{
    public void eats(){
    System.out.println("Lion Eats non-veg");
    }
}

public class inheritance {
    public static void main(String[] args) {
      Horse h1=new Horse();
      h1.eats("Horse");
      Lion l1=new Lion();
      l1.eats();
    }
}
