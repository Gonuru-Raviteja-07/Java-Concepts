import java.util.*;
public class diagonaldifference{
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
                sum1=sum1+arr[i][i];
            }
            int sum2=0;
            for(int i=0;i<n;i++){
                for(int j=n-1-i;j==n-1-i;j++){
                    sum2=sum2+arr[i][j];
                }
            }
            int result=Math.abs(sum1-sum2);
            System.out.println(result);
        }
    }
}