class Student{
    String name;
    int age;
    double percentage;

    public void printInfo(){
        System.out.println(this.name);
         System.out.println(this.age);
          System.out.println(this.percentage);
    }
}
   
class Pen{
    String colour;
    int price;
    public void printDetails(){
         System.out.println(this.colour);
         System.out.println(this.price);
    }
    Pen(String colour,int price){
        this.colour=colour;
        this.price=price;
    }
}

class oops{
    public static void main(String[] args) {
//non-parameterise constructor
        Student s1=new Student();
        s1.name="Ravi";
        s1.age=22;
        s1.percentage=7.0;
        s1.printInfo();
       System.out.println();

//parameterise constructor
       Pen p1=new Pen("black",10);
       p1.printDetails();
    }
}