import java.util.*;
class stack{ 
    public static void main(String []argh){
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                String input=sc.next();
                 Stack<Character>check=new Stack<>();
                for(int i=0;i<input.length();i++){
                    char ch=input.charAt(i);
                     if(ch=='(' || ch=='[' || ch=='{'){
                        check.push(ch);
                        continue;
                     }
                     if(check.isEmpty()){
                        if(ch==')' || ch==']' || ch=='}'){
                        System.out.println("false");
                        }
                        if(ch=='(' || ch=='[' || ch=='{'){
                        check.push(ch);
                     }
                     }
                     
                     if(ch==')' || ch==']' || ch=='}'){
                        char ch1=check.peek();
                        if(ch1=='(' && ch==')' || ch1=='{' && ch=='}' || ch1=='[' && ch==']'){
                         check.pop();
                        }
                    }
                }
                    if(check.isEmpty()){
                      System.out.println("true");
                    }
                    else if(!check.isEmpty()){
                        System.out.println("false");
                    }
                    
            }
        }
    }
}



