import java.util.*;
public class seventeen{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt(); 
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            } 
            int max=0;
            for(int i=0;i<arr.length;i++){
                if(max<arr[i]){
                  max=arr[i];  
                }
            } 
            int count=0;
            for(int j=0;j<n;j++){
                if(max==arr[j]){
                 count++;
            }
            }
            System.out.println(count);
        }
    }
}