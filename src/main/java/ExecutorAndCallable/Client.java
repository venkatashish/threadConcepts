package ExecutorAndCallable;

import java.util.concurrent.*;

public class Client {
    public static void main(String [] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        /*executor.submit(()->{System.out.println("This is thread no:- "+Thread.currentThread().getName());});
        executor.submit(()->{System.out.println("This is thread no:- "+Thread.currentThread().getName());});
        executor.submit(()->{System.out.println("This is thread no:- "+Thread.currentThread().getName());});
        executor.submit(()->{System.out.println("This is thread no:- "+Thread.currentThread().getName());});
        executor.submit(()->{System.out.println("This is thread no:- "+Thread.currentThread().getName());});
        executor.execute(()->{System.out.println("This is thread no:- "+Thread.currentThread().getName());});
        executor.shutdown();


        MyExecutor object = new MyExecutor();
        MyExecutor object1 = new MyExecutor();
        ExecutorService executor1 = Executors.newCachedThreadPool();
        executor1.submit(object);
        executor1.execute(object1);
        executor1.shutdown();*/

        //This is just to see how lambda expression can be used to create an object of Interface
        /*testing<Integer> ash = () -> {System.out.println("In testing..."); return 1;};
        Integer k = ash.display();
        System.out.println(k);*/

        MyCallable call1 = new MyCallable(2,4);
        MyCallable call2 = new MyCallable(5,7);
        MyCallable call3 = new MyCallable(2,9);
        Future<Integer> k = executor.submit(call1);
        Future<Integer> g = executor.submit(call2);
        Future<Integer> f = executor.submit(call3);
        System.out.println("Value is:- "+k.get());
        System.out.println("Value is:- "+g.get());
        System.out.println("Value is:- "+f.get());

        executor.shutdown();

    }
}
