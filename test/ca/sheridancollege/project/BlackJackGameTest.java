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
public class BlackJackGameTest {
    
    public BlackJackGameTest() {
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
     * Test of main method, of class BlackJackGame.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        BlackJackGame.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of playAgain method, of class BlackJackGame.
     */
    @Test
    public void testPlayAgainGood() {
        System.out.println("playAgain Good");
        String answer="yes";
        boolean expResult = true;
        boolean result = BlackJackGame.playAgain();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testPlayAgainBad() {
        System.out.println("playAgain Bad");
        String answer=" ";
        boolean expResult = false;
        boolean result = BlackJackGame.playAgain();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testPlayAgainBoundry() {
        System.out.println("playAgain Boundry");
        String answer="y";
        boolean expResult = false;
        boolean result = BlackJackGame.playAgain();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
