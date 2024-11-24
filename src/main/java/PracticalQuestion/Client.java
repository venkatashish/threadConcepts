package PracticalQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> values = new ArrayList<>(List.of(1,2,3,4,5,6));
        ExecutorService execute = Executors.newCachedThreadPool();
        ExecutorService execute1 = Executors.newFixedThreadPool(2);
        /*for(Integer element: values){
            SumOfSquaresThread thread = new SumOfSquaresThread(element);
            thread.start();
        }*/
        /*for(Integer element: values){
            SumOfSquaresRunnable sos = new SumOfSquaresRunnable(element);
            Thread t = new Thread(sos);
            t.start();
        }*/
        for(Integer element: values){
        SumOfSquaresCallable soc = new SumOfSquaresCallable(element);
        Future<Integer> k = execute1.submit(soc);
        System.out.println("Square of "+element+" is:- "+k.get());

        }
        execute1.shutdown();
    }
}
