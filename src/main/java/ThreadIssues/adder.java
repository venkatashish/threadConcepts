package ThreadIssues;

public class adder implements Runnable{
    private count val;

    public adder(count val){
        this.val = val;
    }

    @Override
    public void run(){
        for(int i=0;i<10000;i++){
            synchronized (val){
                val.val += 1;
            }

        }
    }
}
