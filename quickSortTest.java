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
public class quickSortTest {
    
    public quickSortTest() {
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
     * Test of distri method, of class quickSort.
     */
    @Test
    public void testDistri() {
        System.out.println("distri");
        int[] bobeda = null;
        int chico = 0;
        int grande = 0;
        quickSort instance = new quickSort();
        int expResult = 0;
        int result = instance.distri(bobeda, chico, grande);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Qsort method, of class quickSort.
     */
    @Test
    public void testQsort() {
        System.out.println("Qsort");
        int[] bobeda = null;
        int chico = 0;
        int grande = 0;
        quickSort instance = new quickSort();
        instance.Qsort(bobeda, chico, grande);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
