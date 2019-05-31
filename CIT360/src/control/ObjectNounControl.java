/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

//import cit360.CIT360;
import java.io.Serializable;

/**
 *
 * @author Bryan
 */
public class ObjectNounControl implements Serializable, WordSelectorControl {

    public String build(String word, int selection, Object[] objectArray) {

        objectArray = WordBankControl.buildNounObjectQuantity().toArray();
        //selection = (int) Math.round(Math.random() * (30 - 1));

        if (selection < 0) {
            throw new ArrayIndexOutOfBoundsException("Number selected was less than zero.");
            //return -1
        }
        while (selection > objectArray.length - 1) {
            if (selection > 20) {
                throw new ArrayIndexOutOfBoundsException("Number selected was greater than twenty.");
                //return -2
            }
            selection = selection - objectArray.length;
        }

        word = objectArray[selection].toString();

        return word;
    }

//    public static void objectNounSelect(int counter) {
//
//        String objectNoun = "";
//        Object[] objectArray = WordBankControl.buildNounObjectQuantity().toArray();
//
//        while (counter > objectArray.length) {
//            counter = counter - objectArray.length / 2;
//        }
//
//        objectNoun = objectArray[counter].toString();
//
//        CIT360.getCurrentGame().getWordBank().setObjectNoun(objectNoun);
//    }
}
