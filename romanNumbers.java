import java.util.*;
public class romanNumbers {
    public static void main(String[] args) {
        String s="MCMXCIV";
        HashMap<Character,Integer> map=new HashMap<>();
         map.put('I',1);
         map.put('V',5);
         map.put('X',10);
         map.put('L',50);
         map.put('C',100);
         map.put('D',500);
         map.put('M',1000);
        int sum=map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
         if(map.get(s.charAt(i))<sum){
         sum-=map.get(s.charAt(i));
         }
         else{
         sum+=map.get(s.charAt(i)); 
         }
        }
        System.out.println(sum);
    }
}
