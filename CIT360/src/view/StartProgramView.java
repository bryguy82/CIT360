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
public class StartProgramView extends ViewStarter {

    public StartProgramView() {
        // empty constructor
    }

    @Override
    protected String getMessage() {
        return "Welcome to CIT360";
    }

    /**
     * No input here
     * @return
     */
    @Override
    public String[] getInputs() {
        return null;
    }
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true to repeat view, and false to exit to previous view.
     */
    @Override
    public boolean doAction(String[] inputs) throws IOException {

        // false returns to calling view.
        startMainMenuView();

        return false;
    }

    // Add other views here----- 
    private void startMainMenuView() throws IOException {
        pause(2000);
        View mainMenu = new MainMenuView();
        mainMenu.displayView();
    }
}

