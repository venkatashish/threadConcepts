package Runnable;

public class Client {
    public static void main(String [] args){
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        thread1.start();
        try{
            thread1.join();
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted!");
        }
        System.out.println("Printing Client of Runnable");
    }
}
