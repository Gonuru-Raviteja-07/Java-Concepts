import java.util.*;
public class twelve {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            
            int[] alice=new int[n];
            
            for(int i=0;i<n;i++){
                alice[i]=sc.nextInt();    
            }
            
             int[] bob=new int[n];
             
             for(int j=0;j<n;j++){
                bob[j]=sc.nextInt();
            }
            
            int count1=0;
            int count2=0;
            
             for(int i=0;i<n;i++){
              for(int j=i;j<=i;j++){
                   if(alice[i]>bob[j]){
                  count1=count1+1; 
               }  
               else if(alice[i]<bob[j]){
                   count2=count2+1;
               }   
            }
              }
              System.out.println(count1+" "+count2);
        }
    }
}
