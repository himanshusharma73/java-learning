package himanshu.funtionalinterface;

public class ThreadUsingFunctionalInterface {


    public static void main(String[] args) {
        Runnable r = () ->{
            for (int i=0;i<1000;i++) {
                System.out.println("tread");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);

                }
            }
        };
        Runnable r1 = () ->{
            for (int i=0;i<1000;i++) {
                System.out.println("tread 1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                        throw new RuntimeException(e);

                }
            }

        };
        Thread thread = new Thread(r);
        Thread thread1 = new Thread(r1);
        thread.start();
        thread1.start();
    }
}
