/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import cit360.CIT360;
import java.io.Serializable;

/**
 *
 * @author Bryan
 */
public class VerbControl implements Serializable {

    public VerbControl() {
        // Empty contructor
    }

    public static void VerbSelect(int counter, int list) {

        String verb = "";
        // Convert TreeSets to String[]
        Object[] verbPresentArray = WordBankControl.buildVerbPresent().toArray();
        Object[] verbPastArray = WordBankControl.buildVerbPast().toArray();
        Object[] verbFutureArray = WordBankControl.buildVerbFuture().toArray();

        while (counter > verbPresentArray.length) {
            counter = counter - verbPresentArray.length / 2;
        }
        Object[][] verbTenses = new Object[3][verbPresentArray.length];
        // Populate two dimentional array[tense][word]
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < verbPresentArray.length; j++) {
                switch (i) {
                    case 0:
                        verbTenses[i][j] = verbPresentArray[j].toString();
                        break;
                    case 1:
                        verbTenses[i][j] = verbPastArray[j].toString();
                        break;
                    default:
                        verbTenses[i][j] = verbFutureArray[j].toString();
                        break;
                }
            }
        }

        verb = verbTenses[list][counter].toString();

        CIT360.getCurrentGame().getWordBank().setVerb(verb);
    }
}
