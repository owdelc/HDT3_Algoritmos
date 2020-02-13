/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author oscar
 */
public class selectionSortTest {
    
    public selectionSortTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Ssort method, of class selectionSort.
     */
    @Test
    public void testSsort() {
        System.out.println("Ssort");
        int[] bobeda = null;
        selectionSort instance = new selectionSort();
        instance.Ssort(bobeda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printres method, of class selectionSort.
     */
    @Test
    public void testPrintres() {
        System.out.println("printres");
        int[] bobeda = null;
        selectionSort instance = new selectionSort();
        instance.printres(bobeda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
