//Thread :- Is a light weight individual part of a running program
//->we can call a thread using start() or run() methods

//thread by using inheritance
class Demo extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=3;i++){
         System.out.println(i);
         try {
             Thread.sleep(2000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
        }
     }
}
//thread implementing by runnable interface
class Hello implements Runnable{
    @Override
    public void run(){
        System.out.println("From Hello class");
    }

}

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        Demo t1=new Demo();
        t1.start(); 
        t1.join(); 

        Hello h1=new Hello();
        Thread x=new Thread(h1);
        x.run();
        
    }
}
