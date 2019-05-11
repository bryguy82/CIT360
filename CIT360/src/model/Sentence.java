/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Bryan
 */
class Sentence implements Serializable {
    
    private Sentence[] sentence;
//    private Noun[] noun;
//    private Verb[] verb;
//    private Adverb[] adverb;
    private Adjective[] adjective;
      
    public Sentence() {
        // Empty constructor
    }

    public Sentence[] getSentence() {
        return sentence;
    }

    public void setSentence(Sentence[] sentence) {
        this.sentence = sentence;
    }

    public Adjective[] getAdjective() {
        return adjective;
    }

    public void setAdjective(Adjective[] adjective) {
        this.adjective = adjective;
    }

    @Override
    public String toString() {
        return "Sentence: " + sentence + "Adjective: " + adjective;
    }
}
