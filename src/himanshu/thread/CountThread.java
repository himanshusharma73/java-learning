package himanshu.thread;

public class CountThread extends Thread{

    private Counter counter;

    CountThread(Counter counter){
        this.counter = counter;
    }
    public void run(){
        for (int i =1; i<=1000; i++){
            counter.increment();
        }

    }
}
