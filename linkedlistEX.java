import java.util.LinkedList;

public class linkedlistEX {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();
        names.add("Ravi");
        names.add("sai");
        names.add("naveen");
        names.add("simha");
        System.out.println(names.size());
        names.remove(0);
        System.out.println(names);

        System.out.println(names.set(2,"ravi"));
        System.out.println(names);

    }
}
