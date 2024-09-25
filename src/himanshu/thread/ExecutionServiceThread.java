package himanshu.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutionServiceThread {

    public static int factorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result = result * i;
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            service.submit(() -> {
                int factorial = factorial(finalI);
                System.out.println(factorial);
            });
        }
        service.shutdown();
    }

}
