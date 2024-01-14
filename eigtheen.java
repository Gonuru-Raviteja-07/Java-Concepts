import java.util.Arrays;
import java.util.*;

public class eigtheen {

    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        String a=sc.next();
           a=a.toLowerCase();
           
           String b=sc.next();
           b=b.toLowerCase();
           
           char[] arr1=new char[a.length()];
           for(int i=0;i<a.length();i++){
                arr1[i]=a.charAt(i);
            }
            char[] arr2=new char[b.length()];
           for(int i=0;i<b.length();i++){
                arr2[i]=b.charAt(i);
            }
            
            Arrays.sort(arr1);
             Arrays.sort(arr2);
           
            String a1="";
            for(int i=0;i<a.length();i++){
                a1=a1+arr1[i];
            }
             String b1="";
            for(int i=0;i<b.length();i++){
                b1=b1+arr2[i];
            }
            
           if(a1.compareTo(b1)==0){
               System.out.println("Anagrams");
           }
           else{
                System.out.println("Not Anagrams");
           }
    }   
    }    
}


