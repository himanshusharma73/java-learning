package himanshu.thread;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CountThread thread = new CountThread(counter);
        CountThread thread1 = new CountThread(counter);

        thread.start();
        thread1.start();

        try {
            thread.join();
            thread1.join();
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println(counter.getCount());
    }
}
