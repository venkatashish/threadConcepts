package ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Queue<Object> queue;
    private Semaphore producer;
    private Semaphore consumer;

    public Consumer(Queue<Object> queue, Semaphore producer, Semaphore consumer){
        this.queue = queue;
        this.producer = producer;
        this.consumer = consumer;
    }

    @Override
    public void run(){
    while (true){
        try {
            consumer.acquire();
            queue.remove();
            System.out.println("Consumer is consuming");
            producer.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
    }
}
