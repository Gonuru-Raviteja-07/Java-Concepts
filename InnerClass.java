//Inner class : Class within a Class 
//->used to group classes that belong together it makes code more readable and maintainable
//->To access inner class, create object of outer class and then create object of inner classs
//->we can make inner class as private or protected if we don't want outside objects to access inner class
//->We can make inner class as "static class", we access it without creating object of outer class

//Outer Class
class Employee {
    int empId=101;
    String empName="Raviteja";

    public void printInfo() {
        System.out.println(empId + " " + empName);
    }

    // Inner Class
    class Laptop {
        String lapName="Mackbook";

        public void printDetails() {
            System.out.println(lapName);
        }
    }
    //static Inner Class
    static class Department{
        String depName="Developer";
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.printInfo();
        // To access inner class method
        Employee.Laptop l1 = e1.new Laptop();
        l1.printDetails();
        //To access static inner class variable
        Employee.Department d1=new Employee.Department();
        System.out.println(d1.depName);
    }
}
