//Streams : To process the objects from collections
//->We can perform operations like filtering,mapping,reducing & sorting
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Streams {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(91);
        marks.add(35);
        marks.add(70);
        marks.add(55);
        marks.add(20);
        marks.add(29);
        System.out.println(marks);
        
        //sort the objects in ASC order
        List<Integer> c=marks.stream().sorted().collect(Collectors.toList());
        System.out.println(c);

        //apply the given function on all the object of the collecton
        List<Integer> a= marks.stream().map(m -> m + 5).collect(Collectors.toList());
        System.out.println(a);

        //returns the objects which are satisfied by the given condition
        List<Integer> b = marks.stream().filter(m -> m >= 35).collect(Collectors.toList());
        System.out.println(b);
    }
}