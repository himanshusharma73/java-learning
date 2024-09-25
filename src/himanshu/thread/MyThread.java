package himanshu.thread;

public class MyThread extends Thread{

    /*//@Override
    public void run(){
        try {
            System.out.println("RUNNING");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }*/

    public void run(){
        for (int i= 0; i<5;i++ ){
            System.out.println(Thread.currentThread().getName()
                    +" priority "+Thread.currentThread().getPriority()
                    +" count "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread l = new MyThread();
        MyThread m = new MyThread();
        MyThread h = new MyThread();
       /* System.out.println(thread.getState());
        thread.start();;
        System.out.println(thread.getState());
        Thread.sleep(100);
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getState());*/

        l.setName("Low priority thread");
        l.setPriority(Thread.MIN_PRIORITY);
        l.start();
        m.setName("medium priority thread");
        m.setPriority(5);
        m.start();
        h.setName("High priority thread");
        h.setPriority(10);
        h.start();

    }
}
