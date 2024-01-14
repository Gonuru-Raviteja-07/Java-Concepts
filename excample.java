public class excample {
public static void main(String[] args) {
    int[] numbers={1,3,5,7,9,11,13,15};
    int d=5;
    for(int i=1;i<numbers.length-2;i++){
         int sum=numbers[i]+numbers[i+1];
        for(int j=i+2;j==i+2;j++){
         sum=sum+numbers[j];
        if(sum%d==0){
         System.out.println(sum+" "+"Yes");
        }
        else{
          System.out.println(sum+" "+"No");   
        }
    }
    }
}
}