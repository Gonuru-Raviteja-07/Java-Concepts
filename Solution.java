class Arithmetic{
   
}
class Adder extends Arithmetic{
    public int add(int x,int y){
     return x+y;
    }
}

public class Solution{
    public static void main(String []args){
        Adder a = new Adder();
        
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        
        int m=a.add(10,32);
        int n=a.add(10,3);
        int o=a.add(10,10);


        System.out.println(m+ " " + n + " " + o);
     }
}