class today1{
  public static void main(String[] args) {
    int x=-121;
    int sum=0;
    while (x>0) {
      sum=(sum*10)+x%10;
      x=x/10;
    }
    if(x==sum){
      System.out.println("true");
    }
    else if(x<0 || x!=sum){
      System.out.println("false");
    }
  }
}