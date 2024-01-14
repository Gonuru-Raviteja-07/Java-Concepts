import java.util.Stack;

public class stackEx {
    public static void main(String[] args) {
        Stack<Integer>nums=new Stack<>();
        nums.push(1);
         nums.push(2);
          nums.push(3);
           nums.push(4);

           while(!nums.isEmpty()){
            nums.pop();
           }
           if(nums.isEmpty()){
            nums.push(5);
           }

           System.out.println(nums);
           System.out.println(nums.peek());
    }
}
