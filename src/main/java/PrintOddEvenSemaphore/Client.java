package PrintOddEvenSemaphore;

import java.util.concurrent.Semaphore;

public class Client {
    public static int number = 1;
    public static void main(String[] args){
        Semaphore odd = new Semaphore(1);
        Semaphore even = new Semaphore(0);

        Odd odd1 = new Odd(odd, even);
        Even even1 = new Even(odd, even);

        Thread to = new Thread(odd1);
        Thread te = new Thread(even1);

        to.start();
        te.start();
    }
}
