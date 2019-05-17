/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.Serializable;
import cit360.CIT360;

/**
 *
 * @author Bryan
 */
public class AdverbControl implements Serializable {

    public AdverbControl() {
        // Empty contructor
    }

    public static void adverbSelect(int counter) {

        String adverb = "";
        Object[] adverbArray = WordBankControl.buildAdverbTree().toArray();

        while (counter > adverbArray.length) {
            counter = counter - adverbArray.length / 2;
        }

        adverb = adverbArray[counter].toString();

        CIT360.getCurrentGame().getWordBank().setAdverb(adverb);
    }
}
