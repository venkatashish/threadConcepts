package Synchronization;

public class Counter {
    public int count = 0;

    public synchronized void increment(){
        count += 1;

        }

        public synchronized void decrement(){
        count -= 1;
        }
    }

