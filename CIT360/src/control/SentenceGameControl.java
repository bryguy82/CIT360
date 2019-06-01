/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

//import cit360.CIT360;
import java.util.HashMap;
//import java.util.concurrent.ThreadLocalRandom;
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
        game.setWordBank(wordBank);
        game.setTheSentence(sentence);

        return game;
    }

    public static String makeASentence() {

        // Game object with each individual string
        String person = "";
        String adverb = "";
        String verb = "";
        String adjective = "";
        String object = "";

        // Save the random different parts of speech to the game's wordBank
        HashMap<String, WordSelectorControl> wordLists = new HashMap<>();
        wordLists.put("person", new PersonNounControl());
        wordLists.put("adverb", new AdverbControl());
        wordLists.put("object", new ObjectNounControl());

        HashMap<String, WordSelectorArrayControl> wordArrayLists = new HashMap<>();
        wordArrayLists.put("verb", new VerbControl());
        wordArrayLists.put("adjective", new AdjectiveControl());

        String[] partsOfSpeech = {"person", "adverb", "verb", "adjective", "object"};

        int random = (int) Math.round(Math.random() * (20 - 1));
        WordSelectorControl wordSelect;
        WordSelectorArrayControl wordSelectArray;
        // for loop with OR for both maps, then case statements
        for (int i = 0; i < wordLists.size() + wordArrayLists.size(); i++) {
            switch ((partsOfSpeech[i])) {
                case "person":
                    wordSelect = wordLists.get(partsOfSpeech[i]);
                    person = wordSelect.build(person, random, partsOfSpeech);
                    break;
                case "adverb":
                    wordSelect = wordLists.get(partsOfSpeech[i]);
                    adverb = wordSelect.build(adverb, random, partsOfSpeech);
                    break;
                case "verb":
                    wordSelectArray = wordArrayLists.get(partsOfSpeech[i]);
                    verb = wordSelectArray.build(verb, random, i, partsOfSpeech);
                    break;
                case "adjective":
                    wordSelectArray = wordArrayLists.get(partsOfSpeech[i]);
                    adjective = wordSelectArray.build(adjective, random, i, partsOfSpeech);
                    break;
                default:
                    wordSelect = wordLists.get(partsOfSpeech[i]);
                    object = wordSelect.build(object, random, partsOfSpeech);
                    break;
            }
        }

        String sentence = "The " + person + " " + adverb + " " + verb + " the " + adjective + " " + object + "s.";
        //game.setTheSentence(sentence);

        return sentence;

        //Game game = CIT360.getCurrentGame();
        // random numbers to select which words to use
//        int random = (int) (Math.random() * (30 - 1)); // ThreadLocalRandom.current().nextInt(1, 30);
//        int verbList = (int) (Math.random() * (2 - 0)); // ThreadLocalRandom.current().nextInt(0, 2);
//        int adjectiveList = (int) (Math.random() * (4 - 0)); // ThreadLocalRandom.current().nextInt(0, 4);
//        PersonNounControl.personNounSelect(random);
//        AdverbControl.adverbSelect(random);
//        VerbControl.VerbSelect(random, verbList);
//        AdjectiveControl.AdjectiveSelect(random, adjectiveList);
//        ObjectNounControl.objectNounSelect(random);

        /*
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

        String sentence = "The ";// + personNoun + " " + adverb + " " + verb + " the " + adjective + " " + objectNoun + "s.";
        //game.setTheSentence(sentence);

        return sentence;
         */
    }
}
