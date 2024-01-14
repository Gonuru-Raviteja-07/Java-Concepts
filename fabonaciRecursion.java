public class fabonaciRecursion{
    public static void printFactorial(int n,int fact){
        if(n==1){
        System.out.println(fact);
        return ;
        }
        fact=fact*n;
        printFactorial(n-1,fact);
    }
    
    public static void main(String[] args){
        printFactorial(5,1);
    }
}
