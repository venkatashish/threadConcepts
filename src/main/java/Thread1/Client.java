package Thread1;

public class Client {
    public static void main(String [] args){
       MyThread thread = new MyThread();
       thread.start();
       System.out.println("Main thread is executing 1.....");
        try {
            thread.join(); // Wait for thread to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }
       MyThread thread1 = new MyThread();
       thread1.start();
        System.out.println("Main thread is executing 2.....");


        MyThread thread4 = new MyThread();
        Thread t = new Thread(thread4);
        t.start();
    }
}
