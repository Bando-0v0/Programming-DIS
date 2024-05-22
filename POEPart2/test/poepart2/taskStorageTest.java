/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package poepart2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class taskStorageTest {
    
    public taskStorageTest() {
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
     * Test of registerUser method, of class taskStorage.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        taskStorage instance = new taskStorage();
        boolean expResult = false;
        boolean result = instance.registerUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class taskStorage.
     */
    @Test
    public void testCheckUserName_0args() {
        System.out.println("checkUserName");
        taskStorage instance = new taskStorage();
        boolean expResult = false;
        boolean result = instance.checkUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class taskStorage.
     */
    @Test
    public void testCheckUserName_String() {
        System.out.println("checkUserName");
        String username = "";
        taskStorage instance = new taskStorage();
        boolean expResult = false;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class taskStorage.
     */
    @Test
    public void testCheckPasswordComplexity_0args() {
        System.out.println("checkPasswordComplexity");
        taskStorage instance = new taskStorage();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class taskStorage.
     */
    @Test
    public void testCheckPasswordComplexity_String() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        taskStorage instance = new taskStorage();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LoginUser method, of class taskStorage.
     */
    @Test
    public void testLoginUser() {
        System.out.println("LoginUser");
        taskStorage instance = new taskStorage();
        boolean expResult = false;
        boolean result = instance.LoginUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity1 method, of class taskStorage.
     */
    @Test
    public void testCheckPasswordComplexity1() {
        System.out.println("checkPasswordComplexity1");
        String myPassword = "";
        String myUsername = "";
        taskStorage instance = new taskStorage();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity1(myPassword, myUsername);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menu method, of class taskStorage.
     */
    @Test
    public void testMenu() {
        System.out.println("menu");
        taskStorage.menu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
