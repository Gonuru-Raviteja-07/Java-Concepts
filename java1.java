import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class java1 {
public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        int n=sc.nextInt();
                    
        List<Integer>numbers=new ArrayList<>();

        for(int i=0;i<n;i++){
          int ele=sc.nextInt();
            numbers.add(ele);
        }
              
        int index=sc.nextInt();
        int insertNumber=sc.nextInt();
              
        int delete=sc.nextInt();

        String name="Ravi";
        if(name.equals("Ravi")){
        
        }
              
        numbers.set(index,insertNumber);
        numbers.remove(delete);
              
        for(int r=0;r<numbers.size();r++){
          System.out.print(numbers.get(r));
        }
      }  
  }
}