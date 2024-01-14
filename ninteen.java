public class ninteen {
    public static void main(String[] args) {
      int arr[]={1,-2,4,-5,1}; 
      int count=0;
     
      for(int i=0;i<5;i++){
      int sum=0;
      for(int j=i;j<5;j++){
        sum=sum+arr[j];
        if(sum<0){
            count++;
        }
      }
      }
        System.out.println(count);
    }
}