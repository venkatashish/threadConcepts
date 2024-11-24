package PrintOddEvenSemaphore;

import java.util.concurrent.Semaphore;

public class Even implements Runnable{
    private Semaphore odd;
    private Semaphore even;

    public Even(Semaphore odd, Semaphore even){
        this.odd = odd;
        this.even = even;
    }

    @Override
    public void run(){
        for(int i=1;i<=20;i++){
            try {
                even.acquire();
                if(Client.number%2==0){
                    System.out.println("Even:- "+Client.number);
                    Client.number++;
                }
                odd.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
