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
public class CollectionView extends ViewStarter {

    public CollectionView() {
        // Empty contructor
    }

    @Override
    protected String getMessage() {
        return "Which collection would you like to see?\n"
                + "T - Tree\n"
                + "L - List\n"
                + "S - Set\n"
                + "F - FIFO Queue\n"
                + "M - Map\n"
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
            case "T": // Tree
                showTree();
                break;
            case "L": // List
                showList();
                break;
            case "S": // Set
                showSet();
                break;
            case "F": // FIFO Queue
                showQueue();
                break;
            case "M": // Map
                showMap();
                break;
            case "R":
                this.console.println("Thank you for coming. Come back soon!");
                return false;
            default:
                this.console.println("Invaild selection.  Please try again");
        }
        return true;
    }

    // Add other views here----- 
    private void showTree() throws IOException {
        pause(2000);
        View treeView = new TreeView();
        treeView.displayView();
    }

    private void showList() throws IOException {
        pause(2000);
        View listView = new ListView();
        listView.displayView();
    }

    private void showSet() throws IOException {
        pause(2000);
        View setView = new SetView();
        setView.displayView();
    }

    private void showQueue() throws IOException {
        pause(2000);
        View queueView = new QueueView();
        queueView.displayView();
    }

    private void showMap() throws IOException {
        pause(2000);
        View mapView = new MapView();
        mapView.displayView();
    }
}
