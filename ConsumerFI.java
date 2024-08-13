//Consumer: Takes some input and perform some operation and does not return anything 
//->It has accept() method;
//->Type of the argument must be declared
//->only accepts one argument
import java.util.function.Consumer;

public class ConsumerFI {
    public static void main(String[] args) {
        Consumer<Integer> num=n->System.out.println(n);
        num.accept(10);

        Consumer<String> name=s->System.out.println(s.length());
        name.accept("Gonuru Raviteja");
    }
}
