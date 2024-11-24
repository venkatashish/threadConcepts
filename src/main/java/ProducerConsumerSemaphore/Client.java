package ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args){
        Queue<Object> queue = new ConcurrentLinkedQueue<>();
        Semaphore producer = new Semaphore(6);
        Semaphore consumer = new Semaphore(0);

        Producer producer1 = new Producer(queue, producer,consumer);
        Producer producer2 = new Producer(queue, producer,consumer);
        Producer producer3 = new Producer(queue, producer,consumer);
        Producer producer4 = new Producer(queue, producer,consumer);
        Producer producer5 = new Producer(queue, producer,consumer);
        Producer producer6 = new Producer(queue, producer,consumer);

        Consumer consumer1 = new Consumer(queue, producer,consumer);
        Consumer consumer2 = new Consumer(queue, producer,consumer);
        Consumer consumer3 = new Consumer(queue, producer,consumer);
        Consumer consumer4 = new Consumer(queue, producer,consumer);

        Thread p1 = new Thread(producer1);
        Thread p2 = new Thread(producer2);
        Thread p3 = new Thread(producer3);
        Thread p4 = new Thread(producer4);
        Thread p5 = new Thread(producer5);
        Thread p6 = new Thread(producer6);

        Thread c1 = new Thread(consumer1);
        Thread c2 = new Thread(consumer2);
        Thread c3 = new Thread(consumer3);
        Thread c4 = new Thread(consumer4);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();

        c1.start();
        c2.start();
        c3.start();
        c4.start();

    }
}
