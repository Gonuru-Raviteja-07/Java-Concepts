import java.util.*;

public class nine {

    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        String a=sc.next();
           String b=sc.next();
           int count=0;

           if(a.length()!=b.length()){
               System.out.println("Not Anagrams");
           }
           else if(a.length()==b.length()){
           for(int i=0;i<a.length();i++){
               for(int j=0;j<b.length();j++){
                   if(a.charAt(i)==b.charAt(j)){
                      count=count++; 
                   }
                   else{
                       continue;
                   }
               }
           }
           }
    }
    }
}