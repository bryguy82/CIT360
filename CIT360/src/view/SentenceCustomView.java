/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cit360.CIT360;
import control.CustomSentenceGameControl;
import java.io.IOException;
import model.Game;

/**
 *
 * @author Bryan
 */
public class SentenceCustomView extends ViewStarter {

    public SentenceCustomView() {
        // empty constructor
    }

    @Override
    protected String getMessage() {
        return "Let's do this!";
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
        String[] inputs = new String[5];

        inputs[0] = getUserInput("Person noun - select a number from 0 to 20.").trim().toUpperCase();
        inputs[1] = getUserInput("Adverb - select a number from 0 to 20.").trim().toUpperCase();
        inputs[2] = getUserInput("Verb - select a number from 0 to 20.").trim().toUpperCase();
        inputs[3] = getUserInput("Adjective - select a number from 0 to 20.").trim().toUpperCase();
        inputs[4] = getUserInput("Object noun - select a number from 0 to 20.").trim().toUpperCase();

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

        //call the programs to set up the sentence
        try {
            customSentence(inputs);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException numex) {
            ErrorView.display(this.getClass().getName(), numex.getMessage());
        }

        return false;
    }

    //Other actions go after this-----
    private void customSentence(String[] inputs) throws ArrayIndexOutOfBoundsException {

        CustomSentenceGameControl customSentence = new CustomSentenceGameControl();
        customSentence.buildsCustomSentence(inputs);

        Game game = CIT360.getCurrentGame();

        String person = game.getPerson();
        String adverb = game.getAdverb();
        String verb = game.getVerb();
        String adjective = game.getAdjective();
        String object = game.getObject();

        //String sentence = "The " + person + " " + adverb + " " + verb + " the " + adjective + " " + object + "s.";
        this.console.format("The %s %s %s the %s %ss.\n", person, adverb, verb, adjective, object);

        //game.setTheSentence(sentence);
        pause(2000);
    }
}