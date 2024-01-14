
import java.util.*;
public class eleven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int count1=0;
             int count2=0;
              int count3=0;
              
            for(int j=0;j<n;j++){
                if(arr[j]==0){
                   count1=count1+1;
                }
                else if(arr[j]>0){
                    count2=count2+1;
                }
                else if(arr[j]<0){
                    count3=count3+1;
                }
            }
            
            int x=count1/n;
            int y=count2/n;
            int z=count3/n;
            
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        }
    }
}
