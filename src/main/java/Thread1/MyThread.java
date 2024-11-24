package Thread1;

public class MyThread extends Thread{
    public void run(){
        for(int i = 0;i<100;i++){
            System.out.println(i);
            try{
                Thread.sleep(5);
            }
            catch (InterruptedException e) {
                System.out.println("Main thread interrupted!");
            }
        }
    }
}
