package ThreadIssues;

public class Client {
    public static void main(String [] args) throws InterruptedException {
        count value = new count();

        adder add = new adder(value);
        subtractor sub = new subtractor(value);

        Thread t1 = new Thread(add);
        Thread t2 = new Thread(sub);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        //Thread.sleep(500);
        System.out.println(value.val);

    }
}
