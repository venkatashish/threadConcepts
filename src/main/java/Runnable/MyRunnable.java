package Runnable;

public class MyRunnable implements Runnable{

    public MyRunnable(){
        System.out.println("I am MyRunable class");
    }
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
