
import java.util.*;

public class palindrome {

    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        String s=sc.next();
           String s1="";
           
           for(int i=s.length()-1;i>=0;i--){
               char ch=s.charAt(i);
               s1=s1+ch;
           }
           System.out.println(s1);
           
           if(s.compareTo(s1)==0){
               System.out.println("Yes");
           }
           else if(s!=s1){
               System.out.println("No");
           }
    }
       
    }
}