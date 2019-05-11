/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.WordGameControl;
import java.io.IOException;

/**
 *
 * @author Bryan
 */
public class MapView extends ViewStarter {

    public MapView() {
        // Empty contructor
    }
    
    @Override
    protected String getMessage() {
        return "Press D to display or R to return\n"
              + "D - Display\n"
              + "R - Return";
    }
    /**
     * Get the set of inputs from the user.
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
     * @param inputs
     * @return true to repeat view, and false to exit to previous view.
     */
    @Override
    public boolean doAction(String[] inputs) throws IOException {

        switch (inputs[0]) {
            case "D": // Map
                showMap();
                return false;
            case "R":
                return false;
            default:
                this.console.println("Invaild selection.  Please try again");
        }
        return true;
    }

    // Add other views here----- 
    private void showMap() throws IOException {
        WordGameControl.modifyMapColor();
        pause(2000);
    }
}