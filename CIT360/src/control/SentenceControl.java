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

/**
 *
 * @author Bryan
 */
public class SentenceControl implements Serializable {

    public SentenceControl() {
        //Empty constructor
    }
/*--------------------TREE------------------------------*/
    public static TreeSet<Integer> buildQuantities() {
        // Create quantity tree
        TreeSet<Integer> adjectiveQuantity = new TreeSet<>();

        adjectiveQuantity.add(34);
        adjectiveQuantity.add(15);
        adjectiveQuantity.add(19);
        adjectiveQuantity.add(25);
        adjectiveQuantity.add(6);
        adjectiveQuantity.add(62);
        adjectiveQuantity.add(41);
        adjectiveQuantity.add(23);
        adjectiveQuantity.add(55);
        adjectiveQuantity.add(45);

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

    /* FOR HASHMAPS

  }https://www.w3schools.com/java/java_hashmap.asp
    get() remove() size()
    
    QUEUE INFO
    LinkedList, ArrayBlockingQueue and PriorityQueue are the most frequently used implementations.
    Methods in Queue:

add()- This method is used to add elements at the tail of queue. More specifically, at the last of linkedlist if it is used, or according to the priority in case of priority queue implementation.
peek()- This method is used to view the head of queue without removing it. It returns Null if the queue is empty.
element()- This method is similar to peek(). It throws NoSuchElementException when the queue is empty.
poll()- This method removes and returns the head of the queue. It returns null if the queue is empty.
size()- This method return the no. of elements in the queue.
    
    OPERATION: Insert, remove, examine
    THROWS EXCEPTION: add(element), remove(), element()
    RETURN VALUES: offer(element), poll(), peek()
     */
}
