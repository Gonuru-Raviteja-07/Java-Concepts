import java.util.Arrays;
//small number in the array is shifted to the first of the array
//one iteration one swap
//time complexity - O(n)
public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={7,8,1,3,2};
        for(int i=0;i<arr.length;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                 smallest=j;
                }
                int temp=arr[j];
                arr[j]=arr[smallest];
                arr[smallest]=temp;
                }
            }
         System.out.println(Arrays.toString(arr));
    }
}
