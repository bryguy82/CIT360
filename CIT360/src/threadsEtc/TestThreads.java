/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsEtc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Bryan
 */
public class TestThreads {
    // Thread objects themselves

    public void loopThreads() {

        System.out.println("Starting loop\n");
        for (int i = 0; i < 3; i++) {
            Runnable task = new TestRunnables();
            task.run();
        }

        System.out.println("looped threads done!");
        pause(2000);
    }

    public void independentThreads() {

        System.out.println("Starting independent\n");
        TestRunnables task = new TestRunnables();

        task.run();
        Thread thread1 = new Thread(task, "Thread1");
        thread1.start();
        Thread thread2 = new Thread(task, "Thread2");
        thread2.start();
        Thread thread3 = new Thread(task, "Thread3");
        thread3.start();

        pause(2000);
        System.out.println("independent threads done!");
        pause(2000);
    }

    public void executorThreads() {
        ExecutorService threadPool = Executors.newFixedThreadPool(4);
        //ConcurrentMap maping = new ConcurrentHashMap();

        System.out.println("Starting executors\n");
        Runnable task = new TestRunnables();

        for (int i = 0; i < 4; i++) {
            threadPool.execute(task);
        }

        threadPool.shutdown();

        pause(2000);

        System.out.println("executor threads done!");
        pause(2000);
    }

    protected void pause(int milliseconds) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.out.println("Interrupted again.");
        }
    }
}
