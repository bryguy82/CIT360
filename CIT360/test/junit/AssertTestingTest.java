/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 *
 */
public class AssertTestingTest {

    public AssertTestingTest() {
    }

    /**
     * Test of addition method, of class AssertTesting. assertEquals
     */
    @Test
    public void testAddition() {
        int a = 3;
        int b = 18;
        int expected = 21;

        int result = AssertTesting.addition(a, b);
        assertEquals(expected, result);
    }

    /**
     * Test of buildArray method, of class AssertTesting. assertArrayEquals
     */
    @Test
    public void testBuildArray() {

        String[] expectedAnimal = {"dog", "cat", "bird", "horse", "cow"};
        String[] result = AssertTesting.buildArray();

        assertArrayEquals(expectedAnimal, result);
    }

    /**
     * Test of buildObject method, of class AssertTesting. assertFalse,
     * assertTrue, assertNotSame, assertSame, assertNotNull, assertNull,
     * assertThat
     */
    @Test
    public void testBuildObject1() {
        int a = 4;
        int b = 17;

        assertTrue(a < b);
    }

    @Test
    public void testBuildObject2() {
        int a = 4;
        int b = 17;

        assertFalse(a > b);
    }

    @Test
    public void testBuildObject3() {

        Map<Integer, String> obj1 = new HashMap<>();
        Map<Integer, String> obj2 = AssertTesting.buildObject();

        assertNotSame(obj1, obj2);
    }

    @Test
    public void testBuildObject4() {

        Map<Integer, String> obj1 = AssertTesting.buildObject();
        Map<Integer, String> obj2 = AssertTesting.buildObject();

        assertSame(obj1.get(0), obj2.get(0));
        assertSame(obj1.get(1), obj2.get(1));
        assertSame(obj1.get(2), obj2.get(2));
        assertSame(obj1.get(3), obj2.get(3));
        assertSame(obj1.get(4), obj2.get(4));
    }

    @Test
    public void testBuildObject5() {

        Map<Integer, String> obj1 = AssertTesting.buildObject();

        assertNotNull(obj1);
    }

    @Test
    public void testBuildObject6() {

        Map<Integer, String> obj1 = new HashMap<>();

        assertNull(obj1.get(0));
    }

    @Test
    public void testBuildObject7() {
        Map<Integer, String> obj1 = AssertTesting.buildObject();
        Map<Integer, String> obj2 = AssertTesting.buildObject();
        String[] animal = AssertTesting.buildArray();

        assertThat("CIT360", isA(String.class));
        assertThat(3400, isA(Integer.class));
        assertThat(obj1.get(2), is("red"));
        assertThat(obj1, notNullValue());
        assertThat(obj1.get(4), sameInstance(obj2.get(4)));
        assertThat(obj1.get(4), sameInstance("green"));
        assertThat(animal[3], is(anyOf(instanceOf(String.class), notNullValue(), equalTo("unicorn"))));
    }
}
