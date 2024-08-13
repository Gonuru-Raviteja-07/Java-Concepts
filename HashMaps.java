import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"ravi");
        map.put(2,"naveen");
        map.put(3,"sai");
        map.put(4,"Harish");
        map.put(5,"laxman");
        //we can put null as key only once,but null as value many times
        map.put(null,"vamshi");
       

        System.out.println(map);

        map.put(2,"teja");
        map.put(null,"krishna");

        System.out.println(map);

        //gives all the keys
        System.out.println(map.keySet());

        //gives all the values
        System.out.println(map.values());

        //checks key present or not
        System.out.println(map.containsKey(8));

         //checks value present or not
        System.out.println(map.containsValue("ravi"));

    }
}
