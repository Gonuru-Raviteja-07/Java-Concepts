//Prediacte:- instead of using conditional statments we can use "Predicate FI"
//->It is "test()" method
//->The test method only returns boolean values
//->only accepts one argument
import java.util.function.*;

public class PredicateFI {
    public static void main(String[] args) {
        //To check a number is even or odd
        Predicate<Integer> p1=i->i%2==0;
        System.out.println(p1.test(11));

        //To check the length of a string>5 or not
        Predicate<String> s1=s->s.length()>5;
        System.out.println(s1.test("Raviteja"));

        int[] numbers={125,1,55,200,984,76};
        Predicate<Integer> p2=i->i>100;
        for(int i : numbers){
            if(p2.test(i)){
                System.out.println(i);
            }
        }
        
    }
}
