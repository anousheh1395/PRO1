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
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
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
     * Test of createFullDeck method, of class GroupOfCards.
     */
//    @Test
//    public void testCreateFullDeck() {
//        System.out.println("createFullDeck");
//        GroupOfCards instance = new GroupOfCards();
//        instance.createFullDeck();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void testGetSizeGood() {
        System.out.println("getSize good");
        GroupOfCards instance = new GroupOfCards();
        int size=52;
        int expResult =52;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetSizeBad() {
        System.out.println("getSize Bad");
        GroupOfCards instance = new GroupOfCards();
        int size=0;
        int expResult =52;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetSizeBoundry() {
        System.out.println("getSize Boundry");
        GroupOfCards instance = new GroupOfCards();
        int size=0;
        int expResult =52;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
//    @Test
//    public void testShuffle() {
//        System.out.println("shuffle");
//        GroupOfCards instance = new GroupOfCards();
//        instance.shuffle();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of removeCard method, of class GroupOfCards.
     */
//    @Test
//    public void testRemoveCard() {
//        System.out.println("removeCard");
//        int i = 0;
//        GroupOfCards instance = new GroupOfCards();
//        
//        instance.removeCard(i);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of getCard method, of class GroupOfCards.
     */
//    @Test
//    public void testGetCard() {
//        System.out.println("getCard");
//        int i = 0;
//        GroupOfCards instance = new GroupOfCards();
//        Card expResult = null;
//        Card result = instance.getCard(i);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of addCard method, of class GroupOfCards.
     */
//    @Test
//    public void testAddCard() {
//        System.out.println("addCard");
//        Card addCard = null;
//        GroupOfCards instance = new GroupOfCards();
//        instance.addCard(addCard);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of draw method, of class GroupOfCards.
     */
//    @Test
//    public void testDraw() {
//        System.out.println("draw");
//        GroupOfCards comingFrom = null;
//        GroupOfCards instance = new GroupOfCards();
//        instance.draw(comingFrom);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of deckSize method, of class GroupOfCards.
     */
//    @Test
//    public void testDeckSizeGood() {
//        System.out.println("deckSize Good");
//        GroupOfCards instance = new GroupOfCards();
//        int expResult = 52;
//        int result = instance.deckSize();
//        //assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
    

    /**
     * Test of moveAllToDeck method, of class GroupOfCards.
     */
//    @Test
//    public void testMoveAllToDeck() {
//        System.out.println("moveAllToDeck");
//        GroupOfCards moveTo = null;
//        GroupOfCards instance = new GroupOfCards();
//        instance.moveAllToDeck(moveTo);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
    /**
     * Test of setSize method, of class GroupOfCards.
     */
//    @Test
//    public void testSetSize() {
//        System.out.println("setSize");
//        int givenSize =52;
//        GroupOfCards instance = new GroupOfCards();
//        instance.setSize(givenSize);
//        assertEquals(instance.setSize(), givenSize);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of toString method, of class GroupOfCards.
     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        GroupOfCards instance = new GroupOfCards();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cardValue method, of class GroupOfCards.
//     */
    @Test
    public void testCardValueGood() {
        System.out.println("cardValue Good");
        GroupOfCards instance = new GroupOfCards();
        
        
        int expResult =0;
        int result = instance.cardValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
