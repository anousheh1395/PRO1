/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anousheh
 */
public class DealerTest {
    
    public DealerTest() {
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
     * Test of getDealerID method, of class Dealer.
     */
//    @Test
//    public void testGetDealerIDGood() {
//        System.out.println("getDealerID Good");
//        
//        Dealer instance = new Dealer();
//        String dealerID="Dealer";
//        String expResult ="Dealer";
//        String result = instance.getDealerID();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//     @Test
//    public void testGetDealerIDBad() {
//        System.out.println("getDealerID Bad");
//        Dealer instance = new Dealer();
//        String expResult=" ";
//        String result =instance.getDealerID();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//     @Test
//    public void testGetDealerIDBoundry() {
//        System.out.println("getDealerID boundry");
//        Dealer instance = new Dealer();
//        String expResult ="";
//        String result = instance.getDealerID();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of setDealerID method, of class Dealer.
     */
    @Test
    public void testSetDealerIDGood(){
        System.out.println("setDealerID Good");
        String dealerID = "Dealer";
        Dealer instance = new Dealer();
        instance.setDealerID(dealerID);
        assertEquals(instance.getDealerID(), dealerID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testSetDealerIDBad(){
        System.out.println("setDealerID Bad");
        String dealerID = " ";
        Dealer instance = new Dealer();
        instance.setDealerID(dealerID);
        assertEquals(instance.getDealerID(), dealerID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testSetDealerIDBoundry(){
        System.out.println("setDealerID Boundry");
        String dealerID = " ";
        Dealer instance = new Dealer();
        instance.setDealerID(dealerID);
        assertEquals(instance.getDealerID(), dealerID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Dealer.
     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Dealer instance = new Dealer();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
