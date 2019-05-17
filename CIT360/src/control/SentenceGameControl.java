/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import cit360.CIT360;
import java.util.concurrent.ThreadLocalRandom;
import model.Game;
import model.Player;
import model.WordBank;

/**
 *
 * @author Bryan
 */
public class SentenceGameControl {

    public SentenceGameControl() {
        // Empty contructor
    }

    public static Game createNewSentenceGame(String playerName) {

        Player player = new Player();
        Game game = new Game();
        WordBank wordBank = new WordBank();
        String sentence = "";

        player.setName(playerName);
        game.setThePlayer(player);
        game.setTheSentence(sentence);
        game.setWordBank(wordBank);

        return game;
    }

    public static String makeASentence() {

        Game game = CIT360.getCurrentGame();

        // random numbers to select which words to use
        int random = ThreadLocalRandom.current().nextInt(1, 30);
        int verbList = ThreadLocalRandom.current().nextInt(0, 2);
        int adjectiveList = ThreadLocalRandom.current().nextInt(0, 4);

        // Save the random different parts of speech to the game's wordBank
        PersonNounControl.personNounSelect(random);
        AdverbControl.adverbSelect(random);
        VerbControl.VerbSelect(random, verbList);
        AdjectiveControl.AdjectiveSelect(random, adjectiveList);
        ObjectNounControl.objectNounSelect(random);

        WordBank wordBank = game.getWordBank();
        // Call individual controls to build a random sentence
        String personNoun = wordBank.getPersonNoun();
        String adverb = wordBank.getAdverb();
        String verb = wordBank.getVerb();
        String adjective = wordBank.getAdjective().getQuantity() + " "
                + wordBank.getAdjective().getQuality() + " "
                + wordBank.getAdjective().getSize() + " "
                + wordBank.getAdjective().getShape() + " "
                + wordBank.getAdjective().getColor();
        String objectNoun = wordBank.getObjectNoun();

        String sentence = "The " + personNoun + " " + adverb + " " + verb + " the " + adjective + " " + objectNoun + "s.";
        game.setTheSentence(sentence);

        return sentence;
    }
}
