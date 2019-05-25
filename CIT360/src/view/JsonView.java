/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import json.JsonCodeExample;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Bryan
 */
public class JsonView extends ViewStarter {

    public JsonView() {
        // Empty constructor
    }

    @Override
    protected String getMessage() {
        return "You have one option to choose from:\n"
                + "J - JSON example\n"
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
            case "J":
                try {
                    showJson();
                } catch (FileNotFoundException fnfex) {
                    ErrorView.display(this.getClass().getName(), fnfex.getMessage());
                } catch (ParseException | NullPointerException | IOException ex) {
                    ErrorView.display(this.getClass().getName(), ex.getMessage());
                }
                break;
            case "R":
                return false;
            default:
                this.console.println("Invaild selection.  Please try again");
        }
        return true;
    }

    // Add other programs here----- 
    private void showJson() throws ParseException, IOException, FileNotFoundException, NullPointerException {
        JsonCodeExample jsonExample = new JsonCodeExample();
        jsonExample.jsonFunction();
        pause(2000);
    }

}
