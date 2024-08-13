class Addition {
    public void add(int i, int j) {
        System.out.println(i + j);
    }

    public void add(int i, float j) {
        System.out.println(i + j);
    }

    public void add(double i, double j) {
        System.out.println(i + j);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
      Addition num=new Addition();
      num.add(10,20);
      num.add(20,20.00);
      num.add(45.00,55);
    }
}
