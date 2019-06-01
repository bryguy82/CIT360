/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.SentenceGameControl;
import java.io.IOException;

/**
 *
 * @author Bryan
 */
class SentenceMainMenuView extends ViewStarter {

    public SentenceMainMenuView() {
        // empty constructor
    }

    @Override
    protected String getMessage() {
        return "Here we are at the Main Menu.\n\n"
                + "R - Random Sentence\n"
                + "C - Custom sentence\n"
                + "Q - Quit Game.\n";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() throws IOException {

        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];

        inputs[0] = getUserInput("Please make a selection.").trim().toUpperCase();

        // Repeat for each input you need, putting it into its proper slot in the array.
        return inputs;
    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs) throws IOException {

        switch (inputs[0]) {
            case "R":
                showRandomSentence();
                break;
            case "C":
                showCustomSentence();
                break;
            case "Q":
                this.console.println("Thank you for playing. Come back soon!");
                return false;
            default:
                this.console.println("Invaild selection.  Please try again");
        }
        return true;
    }

    //Other actions go after this-----
    private void showRandomSentence() throws ArrayIndexOutOfBoundsException {

        try {
            // Call a function in the SentenceGameControl class
            String sentenceToShow = SentenceGameControl.makeASentence();

            this.console.println(sentenceToShow);
            pause(3000);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            ErrorView.display(this.getClass().getName(), aioobe.getMessage());
        }
    }

    private void showCustomSentence() throws ArrayIndexOutOfBoundsException, IOException {
        pause(2000);
        View customSentence = new SentenceCustomView();
        customSentence.displayView();
    }
}
