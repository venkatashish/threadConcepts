package ExecutorAndCallable;

public class MyExecutor implements Runnable{

    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(i+" is printed by Thread:- "+Thread.currentThread().getName());
        }
    }
}
