/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsEtc;

/**
 *
 * @author Bryan
 */
public class TestRunnables implements Runnable {
    
    public void run() {
        // Something to process/run
        // FOR loop with messages
        pause(3000);
    }
    
    
    
    protected void pause(int milliseconds) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.out.println("Interrupted again.");
        }
    }
}
