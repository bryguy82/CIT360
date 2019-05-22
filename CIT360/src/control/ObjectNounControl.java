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

    public String build(String word, int a, Object[] objectArray) {

        objectArray = WordBankControl.buildNounObjectQuantity().toArray();
        a = (int) Math.round(Math.random() * (30 - 1));

        while (a > objectArray.length - 1) {
            a = a - objectArray.length;
        }

        word = objectArray[a].toString();

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
