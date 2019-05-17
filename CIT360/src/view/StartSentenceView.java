/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cit360.CIT360;
import control.SentenceGameControl;
import java.io.IOException;
import model.Game;

/**
 *
 * @author Bryan
 */
public class StartSentenceView extends ViewStarter {

    public StartSentenceView() {
        // Empty contructor
    }

    @Override
    protected String getMessage() {
        return "Welcome to the Crazy Sentence.";
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

        inputs[0] = getUserInput("Please enter your name.").trim().toUpperCase();

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

        if (inputs[0] == null || inputs[0].equals("")) {
            this.console.println("Please enter your name again");
            return false;
        }

        String playerName = inputs[0];
        buildAndStartSentenceGame(playerName);

        // EXIT VIEW HERE
        return false;
    }

    // Add other views and actions here----- 
    private void buildAndStartSentenceGame(String playerName) throws IOException {

        Game sentenceGame = SentenceGameControl.createNewSentenceGame(playerName);
        CIT360.setCurrentGame(sentenceGame);

        this.console.println("Welcome " + playerName + ".");

        pause(2000);
        SentenceMainMenuView mainMenu = new SentenceMainMenuView();
        mainMenu.displayView();
        pause(2000);
    }

}
