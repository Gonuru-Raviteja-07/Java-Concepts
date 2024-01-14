public class sixteen {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
            System.out.print("*"+" ");
            for(int a=j+1;a<n;a++){
                System.out.print("a"+" ");
            }
            }
            System.out.println();
        }
    }
}
