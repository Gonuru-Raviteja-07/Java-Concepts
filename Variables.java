class TypesOfVariables {
    // Static variable :- variable which are declared inside a class but outside the
    // method using "static" Keyword
    // -> you can access these variables out side the class by "using class name"
    // -> cannot be declared inside a method
    // -> memory allocated only once
    static int i = 10;

    // Instance (or) non static variable :- variable which are declared inside a class but outside
    // the method using with out static Keyword
    // -> To access these variables you need to create object of the class and
    // access
    //-> cannot be referenced inside static methods
    int j = 20;

    public void method() {
    // local variable :- variables which are declared inside a method
    // -> we cannot access these variables outside the method because the scope of
    // these variables is within the method
    // ->we cannot print the variable with out intialising(compile time error)
    int k = 30;
    System.out.println(k);
    }
}

class Variables {
    public static void main(String[] args) {
        TypesOfVariables s=new TypesOfVariables();
        s.method();
    }
}