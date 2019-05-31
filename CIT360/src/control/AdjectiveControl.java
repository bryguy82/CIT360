/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.Serializable;
//import model.Adjective;

/**
 *
 * @author Bryan
 */
public class AdjectiveControl implements Serializable, WordSelectorArrayControl {

    @Override
    public String build(String word, int selection, int listSize, Object[] adjectiveQuantityTree) {

        String adjectiveQuantity;
        String adjectiveQuality;
        String adjectiveSize;
        String adjectiveShape;
        String adjectiveColor;

        adjectiveQuantityTree = WordBankControl.buildAdjectiveQuantity().toArray();
        Object[] adjectiveQualityTree = WordBankControl.buildAdjectiveQuality().toArray();
        Object[] adjectiveSizeTree = WordBankControl.buildAdjectiveSize().toArray();
        Object[] adjectiveShapeTree = WordBankControl.buildAdjectiveShape().toArray();
        Object[] adjectiveColorTree = WordBankControl.buildAdjectiveColor().toArray();

        //selection = (int) Math.round(Math.random() * (30 - 1));
        listSize = (int) Math.round(Math.random() * (4 - 0));

        if (selection < 0) {
            throw new ArrayIndexOutOfBoundsException("Number selected was less than zero.");
            //return -1
        }
        while (selection > adjectiveQuantityTree.length - 1) {
            if (selection > 20) {
                throw new ArrayIndexOutOfBoundsException("Number selected was greater than twenty.");
                //return -2
            }
            selection = selection - adjectiveQuantityTree.length;
        }

        Object[][] adjectiveOrder = buildTwoDimentionalArray(adjectiveQuantityTree, adjectiveQualityTree,
                adjectiveSizeTree, adjectiveShapeTree, adjectiveColorTree);

        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    adjectiveQuantity = adjectiveOrder[i][selection].toString();
                    word = adjectiveQuantity + " ";
                    break;
                case 1:
                    adjectiveQuality = adjectiveOrder[i][selection].toString();
                    word = word + adjectiveQuality + " ";
                    break;
                case 2:
                    adjectiveSize = adjectiveOrder[i][selection].toString();
                    word = word + adjectiveSize + " ";
                    break;
                case 3:
                    adjectiveShape = adjectiveOrder[i][selection].toString();
                    word = word + adjectiveShape + " ";
                    break;
                default:
                    adjectiveColor = adjectiveOrder[i][selection].toString();
                    word = word + adjectiveColor;
                    break;
            }
        }

        return word;
    }

    /*
    public static void AdjectiveSelect(int counter, int list) {

        String adjectiveQuantity = "";
        String adjectiveQuality = "";
        String adjectiveSize = "";
        String adjectiveShape = "";
        String adjectiveColor = "";

        Object[] adjectiveQuantityTree = WordBankControl.buildAdjectiveQuantity().toArray();
        Object[] adjectiveQualityTree = WordBankControl.buildAdjectiveQuality().toArray();
        Object[] adjectiveSizeTree = WordBankControl.buildAdjectiveSize().toArray();
        Object[] adjectiveShapeTree = WordBankControl.buildAdjectiveShape().toArray();
        Object[] adjectiveColorTree = WordBankControl.buildAdjectiveColor().toArray();

        // all of these arrays are the same size
        while (counter > adjectiveQuantityTree.length) {
            counter = counter - adjectiveQuantityTree.length / 2;
        }
        // build 2 dimentional array with arrays
        Object[][] adjectiveOrder = buildTwoDimentionalArray(adjectiveQuantityTree, adjectiveQualityTree,
                adjectiveSizeTree, adjectiveShapeTree, adjectiveColorTree);

        // populate arrays with random choices
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    adjectiveQuantity = adjectiveOrder[i][counter].toString();
                    break;
                case 1:
                    adjectiveQuality = adjectiveOrder[i][counter].toString();
                    break;
                case 2:
                    adjectiveSize = adjectiveOrder[i][counter].toString();
                    break;
                case 3:
                    adjectiveShape = adjectiveOrder[i][counter].toString();
                    break;
                default:
                    adjectiveColor = adjectiveOrder[i][counter].toString();
                    break;
            }
        }
        // Assign words to each adjective type
        //WordBank word = new WordBank();
        Adjective adjective = new Adjective();
        adjective.setQuantity(adjectiveQuantity);
        adjective.setQuality(adjectiveQuality);
        adjective.setSize(adjectiveSize);
        adjective.setShape(adjectiveShape);
        adjective.setColor(adjectiveColor);

        //word.setAdjective(adjective);
//        cit360.CIT360.getCurrentGame().getWordBank().setAdjective(adjective);
    }
     */
    private static Object[][] buildTwoDimentionalArray(Object[] a, Object[] b, Object[] c, Object[] d, Object[] e) {

        Object[][] adjectiveOrder = new Object[5][a.length];
        // Populate two dimentional array[type][word]
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < a.length; j++) {
                switch (i) {
                    case 0:
                        adjectiveOrder[i][j] = a[j].toString();
                        break;
                    case 1:
                        adjectiveOrder[i][j] = b[j].toString();
                        break;
                    case 2:
                        adjectiveOrder[i][j] = c[j].toString();
                        break;
                    case 3:
                        adjectiveOrder[i][j] = d[j].toString();
                        break;
                    default:
                        adjectiveOrder[i][j] = e[j].toString();
                        break;
                }
            }
        }
        return adjectiveOrder;
    }
}
