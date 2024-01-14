import java.util.*;
public class countingSort{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
      
      int[] count=new int[n];
      for(int i=0;i<n;i++){
              count[i]=0; 
      }
      for(int i=0;i<n;i++){
               if(arr[i]>=0){
                   int x=arr[i];
                count[x]=count[x]+1;
               }
      }
      
      for(int i=0;i<100;i++){
               System.out.print(count[i]+" ");
      }
        }
    }
}

