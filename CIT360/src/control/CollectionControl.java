/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import java.io.Serializable;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map; //(Key, Value)
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Bryan
 */
public class CollectionControl implements Serializable {

    public CollectionControl() {
        //Empty constructor
    }
/*--------------------TREE------------------------------*/
    public static TreeSet<Integer> buildQuantities() {
        // Create quantity tree
        TreeSet<Integer> adjectiveQuantity = new TreeSet<>();

        adjectiveQuantity.add(55);
        
        for (int i = 0; i < 14; i ++) {
            adjectiveQuantity.add(ThreadLocalRandom.current().nextInt(0, 70));
        } // An amazing random number generator between values

        return adjectiveQuantity;
    }
/*--------------------LIST------------------------------*/
    public static List<String> buildQualities() {
        // Create quality list
        List<String> adjectiveQuality = new ArrayList<>();

        // Add to the list
        adjectiveQuality.add("clever");
        adjectiveQuality.add("beautiful");
        adjectiveQuality.add("sweet");
        adjectiveQuality.add("good");
        adjectiveQuality.add("bold");
        adjectiveQuality.add("clever");
        adjectiveQuality.add("strong");

        return adjectiveQuality;
    }
/*--------------------SET-------------------------------*/
    public static Set<String> buildSize1() {
        // Create size set 1
        Set<String> adjectiveSize1 = new HashSet<>();

        // Add to list 1
        adjectiveSize1.add("puny");
        adjectiveSize1.add("large");
        adjectiveSize1.add("scrawny");
        adjectiveSize1.add("little");
        adjectiveSize1.add("short");
        adjectiveSize1.add("scrawny");
        adjectiveSize1.add("giant");
        adjectiveSize1.add("gigantic");

        return adjectiveSize1;
    }

    public static Set<String> buildSize2() {
        // Create size set 2
        Set<String> adjectiveSize2 = new HashSet<>();

        // Add to list 2
        adjectiveSize2.add("huge");
        adjectiveSize2.add("large");
        adjectiveSize2.add("tiny");
        adjectiveSize2.add("little");
        adjectiveSize2.add("massive");
        adjectiveSize2.add("tall");
        adjectiveSize2.add("giant");
        adjectiveSize2.add("gigantic");

        return adjectiveSize2;
    }
/*--------------------QUEUE------------------------------*/
    public static Queue<String> buildShapes() {
        // Build a queue of shapes
        Queue<String> adjectiveShape = new LinkedList<>();

        List<String> shapes = new ArrayList<>();
        shapes.add("distorted");
        shapes.add("flat");
        shapes.add("round");
        shapes.add("chubby");
        shapes.add("fluffy");
        shapes.add("circular");
        shapes.add("square");
        shapes.add("oval");
        shapes.add("crooked");
        shapes.add("hollow");
        shapes.add("curved");
        shapes.add("straight");
        shapes.add("cylindrical");
        shapes.add("triangular");
        shapes.add("wide");

        adjectiveShape.addAll(shapes);

        return adjectiveShape;
    }
/*--------------------MAP------------------------------*/
    public static Map<Integer, String> buildColor() {
        // Create a map for colors
        Map<Integer, String> adjectiveMap = new HashMap<>();

        // Add to the map
        adjectiveMap.put(0, "gray");
        adjectiveMap.put(1, "pink");
        adjectiveMap.put(2, "black");
        adjectiveMap.put(3, "green");
        adjectiveMap.put(4, "purple");
        adjectiveMap.put(5, "blue");
        adjectiveMap.put(8, "yellow");

        return adjectiveMap;
    }

}
