package PrintOddEvenSemaphore;

import java.util.concurrent.Semaphore;

public class Odd implements Runnable{
    private Semaphore odd;
    private Semaphore even;

    public Odd(Semaphore odd, Semaphore even){
        this.odd = odd;
        this.even = even;
    }

    @Override
    public void run(){
        for(int i=1;i<=20;i++){
            try {
                odd.acquire();
                if(Client.number%2==1){
                    System.out.println("Odd:- "+Client.number);
                    Client.number++;
                }
                even.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
