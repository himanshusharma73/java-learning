package himanshu.Ktech;

public class DaemonThreadExample {


    /*
    A daemon thread in Java is a thread that runs in the background and does not prevent the Java Virtual Machine (JVM)
    from exiting when all user threads (non-daemon threads) finish their execution. Daemon threads are typically used
    for background tasks that should not block the application from shutting down, such as garbage collection,
     background monitoring, or housekeeping tasks.
    * */
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread is running...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        daemonThread.setDaemon(true);
        daemonThread.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is finished.");
    }
}
