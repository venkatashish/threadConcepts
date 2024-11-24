package DoughnutFactory;

import DoughnutFactory.AtomicConsumer;
import DoughnutFactory.AtomicDoughnutFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AtomicMain {
    public static void main(String[] args) throws InterruptedException {
        int numberOfConsumers = 10;
        AtomicDoughnutFactory doughnutFactory = new AtomicDoughnutFactory(20);
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for (int i = 1; i <= numberOfConsumers; i++) {
            executor.submit(()->{
                AtomicConsumer consumer = new AtomicConsumer(doughnutFactory);
                consumer.consume(1);
            });
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);
        //Here if i am not awaiting for termination, then the getDoughnutCount is showing inconsistent result.
        //Using this i am getting 10 answer which is right.
        System.out.println("Doughnuts left for consumers:"+ doughnutFactory.getDoughnutCount());

    }
}

