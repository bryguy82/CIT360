/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
        
/**
 *
 * @author Bryan
 */
public class WordGameControl implements Serializable {
    
    public WordGameControl() {
        
    }
    
    /*
    Manipulate MAP, QUEUE, TREE
    */
/*--------------------TREE------------------------------10*/    
    public static TreeSet<Integer> modifyTreeQuantities() {
        
        TreeSet<Integer> modifyQuantities = SentenceControl.buildQuantities();
        
        System.out.println("The tree includes: " + modifyQuantities);
        
        // Remove and add numbers
        modifyQuantities.remove(55);
        modifyQuantities.add(74);
        
        System.out.println("The tree includes now: " + modifyQuantities);
        System.out.println("There are " + modifyQuantities.size() + " items in this tree.\n");
        
        return modifyQuantities;
    }
    

/*--------------------LIST-------------------------------7*/
    public static List<String> modifyListQualities() {
        
        List<String> modifyQuality = SentenceControl.buildQualities();
        
        System.out.println("The list of qualities includes: " + modifyQuality);
        
        // Remove from the list
        modifyQuality.remove(2);
        modifyQuality.remove("clever");
        modifyQuality.remove("beautiful");
        System.out.println("After removing some items: " + modifyQuality);

        // Add items in the middle
        modifyQuality.add(1, "honest");
        modifyQuality.add(3, "kind");
        modifyQuality.add(5, "beautiful");
        
        System.out.println("There are " + modifyQuality.size() + " items in this list");
        System.out.println("After adding items in the middle: " + modifyQuality + "\n");
        
        return modifyQuality;
    }
 /*--------------------SET-------------------------------11*/   
    public static Set<String> modifySetSize() {
        
        Set<String> modifySize1 = SentenceControl.buildSize1();
        Set<String> modifySize2 = SentenceControl.buildSize2();
        
        System.out.println("Set number one includes: " + modifySize1);
        System.out.println("Set number two includes: " + modifySize2);
        
        // Remove from a list
        modifySize1.remove("little");
        System.out.println("After removing an item from set one " + modifySize1);
        
        // Union (addAll)
        Set<String> unionSet = new HashSet<>(modifySize1);
        unionSet.addAll(modifySize2);
        
        System.out.println("UNION effect on both sets " + unionSet);
        System.out.println("There are " + unionSet.size() + " items in this list.");
        
        // Intersection (retainAll)
        Set<String> intersectionSet = new HashSet<>(modifySize1);
        intersectionSet.retainAll(modifySize2);
        
        System.out.println("INTERSECTION/matching effect on both sets " + intersectionSet);
        
        // Difference (removeAll)
        Set<String> differenceSet = new HashSet<>(modifySize1);
        differenceSet.removeAll(modifySize2);
        
        System.out.println("REMOVAL of matching items (set1-set2) " + differenceSet + "\n");
        
        return modifySize1;
    }
/*--------------------QUEUE------------------------------15*/
    public static Queue<String> modifyQueueShape() {
        
        Queue<String> modifyShape = SentenceControl.buildShapes();
        
        System.out.println("This queue contains: " + modifyShape);
        
        // Remove and add items
        modifyShape.remove();
        modifyShape.remove();
        modifyShape.add("distorted");
        modifyShape.add("flat");
        
        System.out.println("After adding and removing, we have : " + modifyShape);
        System.out.println("The first shape in line is: " + modifyShape.peek()
                           + "and there are: " + modifyShape.size() + " in queue.\n");
        
        return modifyShape;
    }
    
/*--------------------MAP------------------------------12*/
    public static Map<Integer, String> modifyMapColor() {
        
        Map<Integer, String> modifyColor = SentenceControl.buildColor();
        
        System.out.println("The color map contains: " + modifyColor);
        
        // Insert if empty
        modifyColor.putIfAbsent(6, "mustard");
        System.out.println("Insert if empty #6: " + modifyColor);

        // Remove and put in a slot
        modifyColor.remove(4);
        modifyColor.put(4, "violet");
        System.out.println("After removing #4 and violet: " + modifyColor);

        // Replace a value
        modifyColor.replace(8, "gold");
        System.out.println("After replacing yellow with gold: " + modifyColor);

        // Add remaining colors
        modifyColor.put(7, "red");
        modifyColor.put(9, "brown");
        modifyColor.put(10, "orange");
        modifyColor.put(11, "white");
        System.out.println("The completed map has: " + modifyColor);
        System.out.println("There are: " + modifyColor.size() + " colors in the map.\n");
        
        return modifyColor;
    }
        
}
