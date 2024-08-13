//Function: It is an FI which takes some input and perform some operations and returns the result in any datatype we want.
//->it has apply() method.
//->In this we have to mention the type of argument and return type
//->only accepts one argument
import java.util.function.Function;

public class FunctionFI {
    public static void main(String[] args) {
       
        Function<Integer,Integer> f1=i->i*i;
        System.out.println(f1.apply(10));

        Function<String,Integer> f2=s->s.length();
        System.out.println(f2.apply("Raviteja"));
        
    }
}
