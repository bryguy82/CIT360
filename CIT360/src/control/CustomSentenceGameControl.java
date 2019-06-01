/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import cit360.CIT360;
import java.util.HashMap;
import model.Game;

/**
 *
 * @author Bryan
 */
public class CustomSentenceGameControl {

    public CustomSentenceGameControl() {

    }

    public void buildsCustomSentence(String[] inputs) {

        Game game = CIT360.getCurrentGame();

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

        int personSelected = Integer.parseInt(inputs[0]);
        int adverbSelected = Integer.parseInt(inputs[1]);
        int verbSelected = Integer.parseInt(inputs[2]);
        int adjectiveSelected = Integer.parseInt(inputs[3]);
        int objectSelected = Integer.parseInt(inputs[4]);

        WordSelectorControl wordSelect;
        WordSelectorArrayControl wordSelectArray;
        // for loop with OR for both maps, then case statements
        for (int i = 0; i < wordLists.size() + wordArrayLists.size(); i++) {
            switch ((partsOfSpeech[i])) {
                case "person":
                    wordSelect = wordLists.get(partsOfSpeech[i]);
                    person = wordSelect.build(person, personSelected, partsOfSpeech);
                    game.setPerson(person);
                    break;
                case "adverb":
                    wordSelect = wordLists.get(partsOfSpeech[i]);
                    adverb = wordSelect.build(adverb, adverbSelected, partsOfSpeech);
                    game.setAdverb(adverb);
                    break;
                case "verb":
                    wordSelectArray = wordArrayLists.get(partsOfSpeech[i]);
                    verb = wordSelectArray.build(verb, verbSelected, i, partsOfSpeech);
                    game.setVerb(verb);
                    break;
                case "adjective":
                    wordSelectArray = wordArrayLists.get(partsOfSpeech[i]);
                    adjective = wordSelectArray.build(adjective, adjectiveSelected, i, partsOfSpeech);
                    game.setAdjective(adjective);
                    break;
                default:
                    wordSelect = wordLists.get(partsOfSpeech[i]);
                    object = wordSelect.build(object, objectSelected, partsOfSpeech);
                    game.setObject(object);
                    break;
            }
        }
    }
}
