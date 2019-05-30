/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Bryan
 */
public class AssertTesting {
    
    public AssertTesting() {
    
    }
    /**
     * Test the following Assert cases:
     * assertEquals, assertArrayEquals, assertFalse, assertTrue,
     * assertNotSame, assertSame, assertNotNull, assertNull, assertThat.
     */
    //assertEquals
    public static int addition(int a, int b) {
        return a + b;
    }
    /**
     * assertArrayEquals
     */
    public static String[] buildArray() {
        
        String[] animal = { "dog", "cat", "bird", "horse", "cow"};
        
        return animal;
    }
    /**
     * assertFalse, assertTrue, assertNotSame, assertSameassertNotNull, assertNull,
     * assertThat - is(), isA(), matches(), anyof()
     * isA(String.class)
     */
    public static String buildObjectString(int key) {
        
        Map<Integer, String> object = new HashMap<>();
        object.put(1, "blue");
        object.put(2, "red");
        object.put(3, "yellow");
        object.put(4, "green");
        object.put(5, "white");
        
        return object.get(key);
    }
    public static Map buildObject() {
        
        Map<Integer, String> object = new HashMap<>();
        object.put(0, "white");
        object.put(1, "blue");
        object.put(2, "red");
        object.put(3, "yellow");
        object.put(4, "green");
        
        return object;
    }
}
