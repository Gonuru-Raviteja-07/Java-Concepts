
import java.util.Scanner;

public class thirteen {
    public static void main(String[] args){
      try (Scanner sc = new Scanner(System.in)) {
        int n=sc.nextInt();
            int[][] arr=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
           int sum1=0;
            for(int i=0;i<n;i++){
                for(int j=i;j<=i;j++){
                 sum1=sum1+arr[i][j];
                }
            }
            
            int sum2=0;
            for(int i=0;i<n;i++){
            for(int j=n-1-i;j==n-1-i;j++){
               sum2=sum2+arr[i][j];
             }
            }
           
            int diff=sum1-sum2;
            
            if(diff>=0){
                System.out.println(diff);
            }
            else if(diff<0){
            diff=-(diff);
            System.out.println(diff);
            }
    }
    }
}
