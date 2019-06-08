/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;

/**
 *
 * @author Bryan
 */
public class MainMenuView extends ViewStarter {

    public MainMenuView() {
        // Empty contructor
    }

    @Override
    protected String getMessage() {
        return "What would you like to see?\n"
                + "S - Sentences\n"
                + "C - Collections\n"
                + "T - Threads, Executors, and Runnables\n"
                + "J - JSON\n"
                + "H - Hibernate\n"
                + "U - HttpUrl\n"
                + "Q - Quit";
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
            case "S":
                showSentences();
                break;
            case "C":
                showCollections();
                break;
            case "T":
                showThreads();
                break;
            case "J":
                showJSON();
                break;
            case "H":
                showHibernate();
                break;
            case "U":
                showHttpUrl();
                break;
            case "Q":
                this.console.println("Thank you for coming. Come back soon!");
                return false;
            default:
                this.console.println("Invaild selection.  Please try again");
        }
        return true;
    }

    // Add other views here----- 
    private void showSentences() throws IOException {
        pause(2000);
        View sentenceView = new StartSentenceView();
        sentenceView.displayView();
    }

    private void showCollections() throws IOException {
        pause(2000);
        View collectionView = new CollectionView();
        collectionView.displayView();
    }

    private void showThreads() throws IOException {
        pause(2000);
        View threadView = new ThreadView();
        threadView.displayView();
    }

    private void showJSON() throws IOException {
        pause(2000);
        View jsonView = new JsonView();
        jsonView.displayView();
    }

    private void showHibernate() throws IOException {
        pause(2000);
        View hibernateView = new HibernateView();
        hibernateView.displayView();
    }
    
    private void showHttpUrl() throws IOException {
        pause(2000);
        View httpUrl = new HttpUrlView();
        httpUrl.displayView();
    }
}
