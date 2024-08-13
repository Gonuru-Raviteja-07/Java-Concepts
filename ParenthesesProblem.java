import java.util.Stack;

public class ParenthesesProblem {
    public static void main(String[] args) {
        String pattern = ")((()";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (st.isEmpty()) {
                st.push(ch);
            }
            else {
                if (st.peek() == '(' && ch == ')') {
                    st.pop();
                } 
                else {
                    st.push(ch);
                }
            }
        }
        int size=st.size();
        System.out.println(size);
    }
}
