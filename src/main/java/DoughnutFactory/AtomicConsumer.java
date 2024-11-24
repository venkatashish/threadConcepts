package DoughnutFactory;

public class AtomicConsumer {
    private AtomicDoughnutFactory doughnutFactory;
    public AtomicConsumer(AtomicDoughnutFactory doughnutFactory) {
        this.doughnutFactory = doughnutFactory;
    }

     public synchronized void consume(int numberOfDoughnuts) {
        synchronized (doughnutFactory) {
            System.out.println("Doughnut is being consumed by consumer on Thread: " + Thread.currentThread().getName());
            doughnutFactory.consumeDoughnut(numberOfDoughnuts);
            System.out.println("Doughnuts left:" + doughnutFactory.getDoughnutCount());
        }
    }
}