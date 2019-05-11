/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import model.Game;

import view.StartProgramView;
import view.View;

/**
 *
 * @author Bryan
 */
public class CIT360 {

    public static Game currentGame = null;
    public static PrintWriter outFile = null;
    public static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        CIT360.currentGame = currentGame;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        CIT360.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        CIT360.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        CIT360.logFile = logFile;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            inFile = new BufferedReader(new InputStreamReader(System.in));
            outFile = new PrintWriter(System.out, true);
            logFile = new PrintWriter("logFile.txt");

            // Welcome and main menu
            // Let's get this party started!
            View startProgramView = new StartProgramView();
            startProgramView.displayView();

        } catch (Throwable err) {
            System.out.println("Exception " + err.toString()
                    + "\nCause: " + err.getCause()
                    + "\nMessage " + err.getMessage());

            err.printStackTrace(); // this prints out the calling chain
        } finally {
            try {
                if (inFile != null) {
                    inFile.close();
                }
                if (outFile != null) {
                    outFile.close();
                }
                if (logFile != null) {
                    logFile.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing file.");
                return;
            }
        }

        /*       
        // Collections
        WordGameControl.modifyTreeQuantities();
        WordGameControl.modifyListQualities();
        WordGameControl.modifySetSize();
        WordGameControl.modifyQueueShape();
        WordGameControl.modifyMapColor();
         */
 /*
        // Executors, Threads, and Runnables
        TestThreads testing = new TestThreads();
        testing.loopThreads();
        testing.independentThreads();
        testing.executorThreads();
         */
    }

}
