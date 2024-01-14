
import java.util.*;
import java.lang.Math;

public class five {

    public static void main(String[] args) {
       
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();
            for(int i=1;i<=t;i++){
            long n=sc.nextLong();
            if(n>=-128 && n<=127){
                System.out.println(n+" can be fitted in:");
                System.out.println("* byte");
            }
            else if(n>=-32768 && n<=32767){
                System.out.println(n+" can be fitted in:");           
                  System.out.println("* short");
                 
            }
             else if(n>=-((int)Math.pow(2,31)) && n<=((int)Math.pow(2,31)-1)){
                System.out.println(n+" can be fitted in:");
                   System.out.println("* int");
                  
             }
               else if(n>=-((int)Math.pow(2,63)) && n<=((int)Math.pow(2,63)-1)){
                System.out.println(n+" can be fitted in:");
                   System.out.println("* long");
                   
              } 
              else{
                 System.out.println(n+" can't be fitted :");  
              }
            }
        }
    }
}
