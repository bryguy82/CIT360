/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import httpUrl.HttpUrlExample;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author Bryan
 */
public class HttpUrlView extends ViewStarter {

    public HttpUrlView() {
        // empty constructor
    }

    @Override
    protected String getMessage() {
        return "You have one option to choose from:\n"
                + "H - HttpUrl\n"
                + "R - Return";
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
            case "H":
                showHttpUrl();
                break;
            case "R":
                return false;
            default:
                this.console.println("Invaild selection.  Please try again");
        }
        return true;
    }

    //Other actions go after this-----
    private void showHttpUrl() {
        pause(2000);
        HttpUrlExample httpUrlExample = new HttpUrlExample();
        try {
            String output = httpUrlExample.httpUrl();
            this.console.println(output);
        } catch (IOException ex) {
            this.console.println(httpUrlExample.getOutputMessage());
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        } finally {
            if (httpUrlExample.getConnect() != null) {
                httpUrlExample.getConnect().disconnect();
            }
            if (httpUrlExample.getReader() != null) {
                try {
                    httpUrlExample.getReader().close();
                } catch (IOException ex) {
                    ErrorView.display(this.getClass().getName(), ex.getMessage());                    
                }
            }
        }
    }
}
