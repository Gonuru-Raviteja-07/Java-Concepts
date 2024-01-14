import java.util.*;
//overloading
class Comparator{
    public void compare(int a,int b){
        if(a==b){
          System.out.println("Same");
        }
        else{
           System.out.println("Different"); 
        }
    }
        public void compare(String a,String b){
        if(a.compareTo(b)==0){
          System.out.println("Same");
        }
        else{
           System.out.println("Different"); 
        }
    }
        public void compare(int[] a,int[] b){
        if(Arrays.equals(a,b)){
          System.out.println("Same");
        }
        else{
           System.out.println("Different"); 
        }
    }
}
    


class twosums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Comparator comp = new Comparator();
        
        int testCases = Integer.parseInt(scan.nextLine());
        while(testCases-- > 0){
            int condition = Integer.parseInt(scan.nextLine());
            switch(condition){
                case 1:
                    String s1=scan.nextLine().trim();
                    String s2=scan.nextLine().trim();
                    comp.compare(s1,s2);
                    break;
                case 2:
                    int num1 = scan.nextInt();
                    int num2 = scan.nextInt();
                    
                    comp.compare(num1,num2);
                    if(scan.hasNext()){ 
                        scan.nextLine(); 
                    }
                    break;
                case 3:
                    int[] array1 = new int[scan.nextInt()];
                    int[] array2 = new int[scan.nextInt()];
                    for(int i = 0; i < array1.length; i++){
                        array1[i] = scan.nextInt();
                    }
                    for(int i = 0; i < array2.length; i++){
                        array2[i] = scan.nextInt();
                    }
                    
                     comp.compare(array1, array2);
                    if(scan.hasNext()){ 
                        scan.nextLine(); 
                    }
                    break;
                default:
                    System.err.println("Invalid input.");
            }
        }
        scan.close();
    }
}