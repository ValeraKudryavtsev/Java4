package task4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyExecutorService myExecutorService = new MyExecutorService(2);
        myExecutorService.submit(new MyRunnable());
        System.out.println(myExecutorService.submit(new MyCallable()).get());
        myExecutorService.shutdown();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("'MyRunnable' print this message!");
        }
    }

    static class MyCallable implements Callable {
        @Override
        public Object call() {
            return "'MyCallable' return this message!";
        }
    }
}
