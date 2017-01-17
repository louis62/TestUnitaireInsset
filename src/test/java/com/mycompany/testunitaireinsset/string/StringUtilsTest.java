/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import java.util.Map;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class StringUtilsTest {
    
    public StringUtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isChaineValide method, of class StringUtils.
     */
    @org.junit.Test
    public void testIsChaineValide() {
        String str = "kayak";
        StringUtils instance = new StringUtils();
        boolean expResult = true;
        boolean result = instance.isChaineValide(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
     @org.junit.Test(expected=IllegalArgumentException.class)
    public void testIsChaineValideKo() {
        String str = "L";
        StringUtils instance = new StringUtils();
       instance.isChaineValide(str);
        // TODO review the generated test code and remove the default call to fail.
    }
    

    /**
     * Test of inverse method, of class StringUtils.
     */
    @org.junit.Test
    public void testInverse() {
        String str = "kayak";
        StringUtils instance = new StringUtils();
        String expResult = "kayak";
        String result = instance.inverse(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @org.junit.Test
    public void testIsPalindrome() {
        String str = "kayak";
        StringUtils instance = new StringUtils();
        boolean expResult = true;
        boolean result = instance.isPalindrome(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @org.junit.Test
    public void testIsPalindromeko() {
        String str = "Loic";
        StringUtils instance = new StringUtils();
        boolean expResult = false;
        boolean result = instance.isPalindrome(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of compterOccurences method, of class StringUtils.
     */
    @org.junit.Test
    public void testCompterOccurences() {
        String str = "kayak";
        StringUtils instance = new StringUtils();
        Map<String, Integer> expResult = new TreeMap<>();
        expResult.put("a", 2);
        expResult.put("k", 2);
        expResult.put("y", 1);
        Map<String, Integer> result = instance.compterOccurences(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
