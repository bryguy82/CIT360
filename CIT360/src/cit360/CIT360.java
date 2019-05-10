/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import control.WordGameControl;
import threadsEtc.TestRunnables;

/**
 *
 * @author Bryan
 */
public class CIT360 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Collections
        WordGameControl.modifyTreeQuantities();
        WordGameControl.modifyListQualities();
        WordGameControl.modifySetSize();
        WordGameControl.modifyQueueShape();
        WordGameControl.modifyMapColor();
        */
        
       (new Thread(new TestRunnables())).start();
        
    }
    
}
