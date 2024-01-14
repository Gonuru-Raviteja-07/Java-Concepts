import java.util.*;

public class hashmap {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
             sc.nextLine();
             HashMap<String,Integer>phoneBook=new HashMap<>();
             for(int i=0;i<n;i++){
               String name=sc.nextLine();
               int pNo=sc.nextInt();
               phoneBook.put(name,pNo);
               sc.nextLine();  
             }
            while(sc.hasNext()){
            String query=sc.next();
            
            if(phoneBook.containsKey(query)){
                System.out.println(query+"="+phoneBook.get(query));
            }
            else{
                System.out.println("Not found");
            }
            }
        }
    }
}
