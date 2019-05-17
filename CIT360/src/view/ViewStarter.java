/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cit360.CIT360;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Bryan
 */
public abstract class ViewStarter implements View {

    protected final BufferedReader keyboard = CIT360.getInFile();
    protected final PrintWriter console = CIT360.getOutFile();

    public void ViewStarter() {
        // Empty constructor
    }

    /**
     * Force child views to display a message
     */
    protected abstract String getMessage();

    /**
     * Force child views to get inputs
     */
    protected abstract String[] getInputs() throws IOException;

    /**
     * Force child views to do an action
     */
    protected abstract boolean doAction(String[] inputs) throws IOException;

    /**
     *
     */
    public void displayView() throws IOException {

        boolean keepGoing = true;

        while (keepGoing == true) {
            // Retrieve messages and print valid messages
            String message = getMessage();
            if (message != null) {
                this.console.println(getMessage());
            }
            // Get input and do an action
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }

    }

    /**
     * Get good input from the user
     *
     * @param prompt
     * @param allowEmpty
     * @return input
     */
    protected String getUserInput(String prompt, boolean allowEmpty) throws IOException {

        String input = "";
        boolean inputReceived = false;

        while (inputReceived == false) {

            this.console.println(prompt);
            input = this.keyboard.readLine();

            // Make sure we avoid a null-pointer error.
            if (input == null) {
                input = "";
            }

            // Trim any trailing whitespace, including the carriage return.
            input = input.trim();

            if (input.equals("") == false || allowEmpty == true) {
                inputReceived = true;
            }
        }
        return input;
    }

    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we
     * don't have to type it ourselves.
     *
     * @param prompt
     * @return false prompt
     */
    protected String getUserInput(String prompt) throws IOException {
        return getUserInput(prompt, false);
    }

    protected static void pause(int milliseconds) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            // do nothing
        }
    }
}
