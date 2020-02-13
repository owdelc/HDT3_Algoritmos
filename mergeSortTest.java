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
public class mergeSortTest {
    
    public mergeSortTest() {
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
     * Test of Msort method, of class mergeSort.
     */
    @Test
    public void testMsort() {
        System.out.println("Msort");
        int[] bobeda = null;
        int q = 0;
        int w = 0;
        int e = 0;
        mergeSort instance = new mergeSort();
        instance.Msort(bobeda, q, w, e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printArr method, of class mergeSort.
     */
    @Test
    public void testPrintArr() {
        System.out.println("printArr");
        int[] bobeda = null;
        mergeSort.printArr(bobeda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
