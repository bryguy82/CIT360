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
public class Game implements Serializable {

    private Game theGame;
    private Player thePlayer;
    private WordBank wordBank;
    private String theSentence;
    private String person;
    private String adverb;
    private String verb;
    private String adjective;
    private String object;

    public Game() {
        // Empty constructor        
    }

    public Game getTheGame() {
        return theGame;
    }

    public void setTheGame(Game theGame) {
        this.theGame = theGame;
    }

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    public WordBank getWordBank() {
        return wordBank;
    }

    public void setWordBank(WordBank wordBank) {
        this.wordBank = wordBank;
    }

    public String getTheSentence() {
        return theSentence;
    }

    public void setTheSentence(String theSentence) {
        this.theSentence = theSentence;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getAdverb() {
        return adverb;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Game " + theGame;
    }

}
