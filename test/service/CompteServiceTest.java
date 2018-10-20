/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YOUNES
 */
public class CompteServiceTest {
    
    public CompteServiceTest() {
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
     * Test of initDB method, of class CompteService.
     */
//    @Test
//    public void testInitDB() {
//        System.out.println("initDB");
//        CompteService instance = new CompteService();
//        instance.initDB();
//        // TODO review the generated test code and remove the default call to fail.
//    }

    /**
     * Test of ouvrir method, of class CompteService.
     */
  

    /**
     * Test of crediter method, of class CompteService.
     */
    @Test
    public void testCrediter() {
        System.out.println("crediter");
        String rib = "EE4";
        double montant = 4;
        CompteService instance = new CompteService();
        int expResult = 1;
        int result = instance.crediter(rib, montant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of transferer method, of class CompteService.
     */
    @Test
    public void testTransferer() {
        System.out.println("transferer");
        String ribSource = "EE1";
        String ribDestination = "EE2";
        double montant = 3;
        CompteService instance = new CompteService();
        int expResult = 1;
        int result = instance.transferer(ribSource, ribDestination, montant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
