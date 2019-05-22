/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.Serializable;
//import cit360.CIT360;

/**
 *
 * @author Bryan
 */
public class PersonNounControl implements Serializable, WordSelectorControl {

    public String build(String word, int a, Object[] personArray) {

        personArray = WordBankControl.buildNounPersonQuantity().toArray();
        a = (int) Math.round(Math.random() * (30 - 1));

        while (a > personArray.length - 1) {
            a = a - personArray.length;
        }

        return word = personArray[a].toString();
    }

//    public static void personNounSelect(int counter) {
//
//        String personNoun = "";
//        Object[] personArray = WordBankControl.buildNounPersonQuantity().toArray();
//
//        while (counter > personArray.length) {
//            counter = counter - personArray.length / 2;
//        }
//
//        personNoun = personArray[counter].toString();
//
//        CIT360.getCurrentGame().getWordBank().setPersonNoun(personNoun);
//    }
}
