import java.util.*;
public class twosets {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int m=sc.nextInt();
            int n=sc.nextInt();
            
            int[] a=new int[m];
            for(int i=0;i<m;i++){
                a[i]=sc.nextInt();
            }
   
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            
            ArrayList<Integer>factors=new ArrayList<>();
            
            for(int i=0;i<n;i++){
                for(int j=1;j<100;j++){
                 if(b[i]%j==0){
                   factors.add(j);    
                } 
                }
            }
            HashSet<Integer>filter=new HashSet<>();
            for(int i=0;i<factors.size();i++){
                int num=factors.get(i);
                for(int j=2;j<n;j++){
                    if(num>=a[m-1]){
                    if(num%a[j]==0){
                      filter.add(num);
                    }
                }
            }
            }
            System.out.println(factors);
            System.out.println(filter);
        }
    }
}
