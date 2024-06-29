package himanshu.designpattern.creatinal.singleton;

public class ThreadSafeSingleton{


    public static void main(String[] args) {

        Runnable r = () -> {
            synchronized (ThreadSafeSingleton.class) {
                for (int i = 0; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i + " " + Employee.getInstance());
                }
            }
        };


        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
}
