import java.util.HashSet;
//import java.util.Iterator;
public class hashSet {
    public static void main(String[] args) {
      HashSet<Integer> names=new HashSet<>();
      int[] nums={1,1,2,2,3,3,4,4};
     for(int i=0;i<nums.length;i++){
      names.add(nums[i]);
     }
     //To print the values of hashset we should use iterator
     
     //Iterator it=names.iterator();
     //while(it.hasNext()){
     //System.out.println(it.next());
     
  }
}
