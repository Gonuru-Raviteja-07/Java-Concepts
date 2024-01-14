import java.util.*;
public class twentytwo {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        int n=sc.nextInt();
           ArrayList<ArrayList<Integer>>al1=new ArrayList<>();
           ArrayList<Integer> al=new ArrayList<>();
           for(int i=0;i<n;i++){
               int a=sc.nextInt();
               for(int j=0;j<a;j++){
                   int m=sc.nextInt();
                    al.add(m);
               }
             al1.add(al);
           }
          int k=sc.nextInt();
          for(int i=0;i<k;i++){
              int y=sc.nextInt();
              int x=sc.nextInt();
          if(x>al1.size() || y>al1.get(x-1).size()){
              System.out.println("ERROR!");
          }
          else{
              System.out.println(al1.get(x-1).get(y-1));
          }
          }
    }
    }
}