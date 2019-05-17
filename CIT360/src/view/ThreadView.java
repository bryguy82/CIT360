/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import threadsEtc.TestThreads;

/**
 *
 * @author Bryan
 */
public class ThreadView extends ViewStarter {

    public ThreadView() {
        // Empty constructor
    }

    @Override
    protected String getMessage() {
        return "There are three options to choose from:\n"
                + "L - Looped thread\n"
                + "I - Independent threads\n"
                + "M - Multiple threads\n"
                + "R - Return";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() throws IOException {

        // Declare the array to have the number of elements you intend to get from the user.
        String[] inputs = new String[1];

        inputs[0] = getUserInput("Please make a selection.").trim().toUpperCase();

        // Repeat for each input you need, putting it into its proper slot in the array.
        return inputs;
    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true to repeat view, and false to exit to previous view.
     */
    @Override
    public boolean doAction(String[] inputs) throws IOException {

        switch (inputs[0]) {
            case "L": // Loop
                showLoop();
                break;
            case "I": // Independent
                showIndependent();
                break;
            case "M": // Multiple
                showMultiple();
                break;
            case "R":
                return false;
            default:
                this.console.println("Invaild selection.  Please try again");
        }
        return true;
    }

    // Add other programs here----- 
    private void showLoop() {
        TestThreads showThread = new TestThreads();
        showThread.loopThreads();
    }

    private void showIndependent() {
        TestThreads showThread = new TestThreads();
        showThread.independentThreads();
    }

    private void showMultiple() {
        TestThreads showThread = new TestThreads();
        showThread.executorThreads();
    }

}
