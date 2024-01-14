import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        //1.add element at last of the arraylist
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //2.get an element from particular index of the arraylist
        list.get(3);
        System.out.println(list);

        //3.add element in b/w the elements of arraylist
        list.add(1,1);
        System.out.println(list);

        //4.change the element present at a particular index of the arraylist
        list.set(0,5);
        System.out.println(list);

        //5.remove/delete an element from particular index of the arraylist
        list.remove(1);
        System.out.println(list);

        //to get the length of the arraylist
        System.out.println(list.size());

        //to sort an arraylist in ascending order
       Collections.sort(list);
       System.out.println(list);
    }
}
