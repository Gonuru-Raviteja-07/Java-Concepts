class Car{

}
class Vehicle extends Car{

}
class problem {
    public static void main(String[] args) {
    Car c=new Vehicle();
    boolean r=c instanceof Vehicle;
    System.out.println(r);
}
}
