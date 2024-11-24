package PracticalQuestion;

public class SumOfSquaresThread extends Thread{
    private int a;

    public SumOfSquaresThread(int a){
        this.a = a;
    }
    public void run(){
        System.out.println("Square of "+a+" is:- "+a*a+" and thread is:- "+Thread.currentThread().getName());

    }
}
