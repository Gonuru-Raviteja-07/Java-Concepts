public class generics {
//by using only one method we can println any datatypes 
      public static <E> void printArray(E[] arr){
        for(E ele :arr){
            System.out.println(ele);
        }
    }

    public static void main(String[] args) {
        
        Integer[] numbers={1,3,5};
        String[] names={"ravi","sai"};
        Double[] a={1.0,2.0};


        printArray(numbers);
        printArray(names);
        printArray(a);
    }
}

































