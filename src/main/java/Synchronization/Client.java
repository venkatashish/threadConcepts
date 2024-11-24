package Synchronization;

public class Client {
    public static void main(String [] args) throws InterruptedException {
        Counter count = new Counter();

        Thread t1 = new Thread(()->{
            for(int i=0;i<10000;i++){
                count.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<10000;i++){
                count.decrement();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.count);

    }
}
