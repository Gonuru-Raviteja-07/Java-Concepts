import java.util.*;
public class recursion {
    public static void printFabonacci(int a,int b,int res,int n){
        if(n<0){
        System.out.println(res);
        return;
        }
        int c=a+b;
        res=c;
        printFabonacci(b,c,res,n-1);
        
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            printFabonacci(0,1,0,n-2);
        }
    
    }
}
