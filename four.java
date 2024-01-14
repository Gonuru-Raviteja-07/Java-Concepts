import java.util.*;

public class four {

    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        String a=sc.next();
           String b=sc.next();
           
           System.out.println(a.length()+b.length());
           
           char a1=a.charAt(0);
            char b1=b.charAt(0);
            
            int x=a1;
            int y=b1;
            
            if(x<y || x==y){
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
           
            if(a1>='a' && a1<='z'){
                a1=Character.toUpperCase(a1);
                System.out.print(a1+""+a.substring(1,a.length()));
                
            }
             if(b1>='a' && b1<='z'){
                b1=Character.toUpperCase(b1);
                System.out.print(" "+b1+""+b.substring(1,b.length()));
            }
    }
        
    }
}
