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
public class WordBank implements Serializable {

    private String personNoun;
    private String objectNoun;
    private String verb;
    private String adverb;
    private Adjective adjective;

//    public WordBank(String personNoun, String adverb, String verb, Adjective adjective, String objectNoun) {
//        setPersonNoun(personNoun);
//        setAdverb(adverb);
//        setVerb(verb);
//        setAdjective(adjective);
//        setObjectNoun(objectNoun);
//    }
    public WordBank() {
        // Empty contructor
    }

    public String getPersonNoun() {
        return personNoun;
    }

    public void setPersonNoun(String personNoun) {
        this.personNoun = personNoun;
    }

    public String getObjectNoun() {
        return objectNoun;
    }

    public void setObjectNoun(String objectNoun) {
        this.objectNoun = objectNoun;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getAdverb() {
        return adverb;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public Adjective getAdjective() {
        return adjective;
    }

    public void setAdjective(Adjective adjective) {
        this.adjective = adjective;
    }

    @Override
    public String toString() {
        return "";
    }
}
