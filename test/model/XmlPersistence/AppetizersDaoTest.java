/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.XmlPersistence;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import model.Food;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.xml.sax.SAXException;

/**
 *
 * @author anthonylyons
 */
public class AppetizersDaoTest {
    
    public AppetizersDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAppetizerByName method, of class AppetizersDao.
     */
    @Test
    public void testGetAppetizerByName() {
        try {
            System.out.println("getAppetizerByName");
            String name = "Boneless Wings";
            AppetizersDao instance = new AppetizersDao();
            double price = 7.99;
            int q = 1;
            Food expResult = null;
            Food result = instance.getAppetizerByName(name);
            
            //Item generated info
            double generatedPrice = result.getPrice();
            String generatedName = result.getName();
            String generatedDescription = result.getDescription();
            int generatedQuantity = result.getQuantity();
            String generatedType = result.getType();
            
            //Items actual info
            double expPrice = 7.99;
            String expName = "Boneless Wings";
            String expDescription = "No bones about it, these are great. Lightly breaded boneless chicken with your choice of sauce.";
            int expQuantity = 1;
            String expType = "Appetizer";
            
            //assertEquals(expPrice, actualPrice, 0);
            assertEquals(expName,generatedName);
            assertEquals(expPrice,generatedPrice,0);
            assertEquals(expDescription,generatedDescription);
            assertEquals(expQuantity,generatedQuantity);
            assertEquals(expType,generatedType);
            // TODO review the generated test code and remove the default call to fail.
            //fail("The test case is a prototype.");
        } catch (SAXException ex) {
            Logger.getLogger(AppetizersDaoTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(AppetizersDaoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
