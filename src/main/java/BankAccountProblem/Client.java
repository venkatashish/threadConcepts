package BankAccountProblem;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(10.0);

        Thread deposit = new Thread(()->{
            for(int i=0;i<10;i++){
                account.deposit(200.0);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread withdraw = new Thread(()->{
            for(int i=0;i<10;i++){
                account.withdraw(200);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        deposit.start();
        withdraw.start();

        deposit.join();
        withdraw.join();

        System.out.println("Your final balance is:- "+account.getBalance());
    }
}
