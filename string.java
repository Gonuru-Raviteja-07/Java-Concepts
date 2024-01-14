//To convert a character of a string from uppercase to lowercase and vice versa //
public class string {

    public static void main(String[] args) {
      String name="rAVItEJA";
      for(int i=0;i<name.length();i++){
        if(name.charAt(i)>='A' && name.charAt(i)<='Z'){
        System.out.print(Character.toLowerCase(name.charAt(i)));
        }
       else{
        System.out.print(Character.toUpperCase(name.charAt(i)));
       }
      }
    }
  }