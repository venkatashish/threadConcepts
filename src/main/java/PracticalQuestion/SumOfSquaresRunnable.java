package PracticalQuestion;

public class SumOfSquaresRunnable implements Runnable{
    private int a;

    public SumOfSquaresRunnable(int a){
        this.a = a;
    }

    @Override
    public void run(){
    System.out.println("Square of "+a+" is:- "+a*a+" and thread is:- "+Thread.currentThread().getName());
    }
}
