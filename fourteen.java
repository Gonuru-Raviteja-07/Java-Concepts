import java.util.*;
public class fourteen{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n=5;
            int[] a=new int[5];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int sum1=a[1]+a[2]+a[3]+a[4];
            int sum2=a[0]+a[2]+a[3]+a[4];
            int sum3=a[0]+a[1]+a[3]+a[4]; 
            int sum4=a[0]+a[1]+a[2]+a[4];
            int sum5=a[0]+a[1]+a[2]+a[3];
            
            int[] sum={sum1,sum2,sum3,sum4,sum5};
            int max=sum[0];
            int min=sum[0];
            int temp1;
            int temp2;
            for(int i=1;i<n;i++){
               if(max<sum[i]){
                   temp1=max;
                   max=sum[i];
                   sum[i]=temp1;
               } 
               else if(min>sum[i]){
                   temp2=min;
                   min=sum[i];
                   sum[i]=temp2;
               }
            }
            System.out.println(min+" "+max);
        }
        
    }
}