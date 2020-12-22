// Executors: It is used for creation and managing threads
// Task submission
// Executor, ExecutorService, ScheduledExecutorService

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorPrg {

    public static void main(String[] args) {
//        ExecutorService executorService= Executors.newSingleThreadExecutor();
//
//        Runnable r1=()->{  // task
//            System.out.println("In runnable...");
//        };
//
//        executorService.submit(r1);
//        executorService.shutdown();

        System.out.println("Executing the main Thread... "+Thread.currentThread().getName());
        ExecutorService executorService=Executors.newFixedThreadPool(2);

        //Task1
        Runnable r1=()->{
            System.out.println("Executing task1... "+Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        //Task2
        Runnable r2=()->{
            System.out.println("Executing task2... "+Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        //Task3
        Runnable r3=()->{
            System.out.println("Executing task3... "+Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        executorService.submit(r1);
        executorService.submit(r2);
        executorService.submit(r3);
        executorService.shutdown();

    }
}
