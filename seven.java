import java.util.Arrays;
import java.util.*;


public class seven {

    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        int n=sc.nextInt();
           int[] arr=new int[n];
           for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
           }
           double sum=0;
           for(int i=0;i<n;i++){
                sum=(double)sum+arr[i];
           }
           double mean=sum/n;
            System.out.println(mean);

           Arrays.sort(arr);
           if(n%2!=0){
            int median=arr[n/2];
            System.out.println(median);
           }
           else if(n%2==0){
            double median=(arr[(n-1)/2]+arr[(n-1)/2+1])/2;
            System.out.println(median);
           }
    }    
    }
}