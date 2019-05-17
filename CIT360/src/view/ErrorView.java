/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cit360.CIT360;
import java.io.PrintWriter;

/**
 *
 * @author Bryan
 */
public class ErrorView extends ViewStarter {

    public static PrintWriter console = CIT360.getOutFile();
    public static PrintWriter log = CIT360.getLogFile();

    public ErrorView() {
        // empty constructor        
    }

    public static void display(String className, String errorMessage) {
        console.println("\n-----------------ERROR-------------"
                + "\n" + errorMessage
                + "\n-----------------------------------"
                + "\n----------Excuse the dust----------");
        //log.printf("%n%n%s", className + " - " + errorMessage);
    }

    @Override
    protected String getMessage() {
        return "";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {
        return null;
    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs) {

        //Output errors here
        return false;
    }

}

