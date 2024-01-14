import java.util.*;
public class eight {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            
            int[] arr1=new int[n];
            for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
            }
            
            int[] arr2=new int[n];
            for(int j=0;j<n;j++){
                arr2[j]=sc.nextInt();
            }
            int x=1;
            int sum=0;
            for(int i=4;i<n;i++){
                for(int j=0;j<=i;j++){
                   if(i==j){
                    x=x*arr1[i]*arr2[j];
                    sum=sum+x;
                    }
                    else{
                        continue;
                    }
                }
                System.out.println(sum);
            }
        }
        
    }
}
