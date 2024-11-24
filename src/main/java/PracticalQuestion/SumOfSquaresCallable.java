package PracticalQuestion;

import java.util.concurrent.Callable;

public class SumOfSquaresCallable implements Callable<Integer> {
    private int a;

    public SumOfSquaresCallable(int a){
        this.a = a;
    }

    @Override
    public Integer call(){
        return a*a;
    }
}
