/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsEtc;

import collection.CollectionBuildControl;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Bryan
 */
public class TestRunnables implements Runnable {

    // Thread tasks
    private final AtomicInteger atomNum = new AtomicInteger(0);

    public AtomicInteger getAtomNum() {
        return atomNum;
    }

    ArrayList list = new ArrayList<>();

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        for (int i : CollectionBuildControl.buildQuantities()) {
            atomNum.getAndIncrement();
            System.out.println("Random number: " + (i) + " thread: " + name + " increment: " + atomNum);
        }

    }

//    protected void pause(int milliseconds) {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException ie) {
//            System.out.println("Interrupted again.");
//        }
//    }
}
