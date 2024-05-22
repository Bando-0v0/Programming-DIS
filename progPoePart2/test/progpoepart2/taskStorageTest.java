
package progpoepart2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


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

   
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        taskStorage instance = new taskStorage();
        String expResult = "kyl_1";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

 
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "kyl_1";
        taskStorage instance = new taskStorage();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        taskStorage instance = new taskStorage();
        String expResult = "Ch&&sec@ke99!";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "Ch&&sec@ke99!";
        taskStorage instance = new taskStorage();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetMyUsername() {
        System.out.println("getMyUsername");
        taskStorage instance = new taskStorage();
        String expResult = "kyl_1";
        String result = instance.getMyUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testSetMyUsername() {
        System.out.println("setMyUsername");
        String myUsername = "kyl_1";
        taskStorage instance = new taskStorage();
        instance.setMyUsername(myUsername);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testGetMyPassword() {
        System.out.println("getMyPassword");
        taskStorage instance = new taskStorage();
        String expResult = "Ch&&sec@ke99!";
        String result = instance.getMyPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetMyPassword() {
        System.out.println("setMyPassword");
        String myPassword = "Ch&&sec@ke99!";
        taskStorage instance = new taskStorage();
        instance.setMyPassword(myPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


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

   
    @Test
    public void testCheckUserName_String() {
        System.out.println("checkUserName");
        String username = "kyl_1";
        taskStorage instance = new taskStorage();
        boolean expResult = false;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


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


    @Test
    public void testCheckPasswordComplexity_String() {
        System.out.println("checkPasswordComplexity");
        String password = "Ch&&sec@ke99!";
        taskStorage instance = new taskStorage();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


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


    @Test
    public void testCheckPasswordComplexity1() {
        System.out.println("checkPasswordComplexity1");
        String myPassword = "Ch&&sec@ke99!";
        String myUsername = "kyl_1";
        taskStorage instance = new taskStorage();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity1(myPassword, myUsername);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testMenu() {
        System.out.println("menu");
        taskStorage instance = new taskStorage();
        boolean expResult = false;
        boolean result = instance.menu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        taskStorage instance = new taskStorage();
        boolean expResult = false;
        boolean result = instance.checkTaskDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        taskStorage instance = new taskStorage();
        boolean expResult = false;
        boolean result = instance.createTaskID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testPrinTaskDetails() {
        System.out.println("prinTaskDetails");
        taskStorage instance = new taskStorage();
        boolean expResult = false;
        boolean result = instance.prinTaskDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        taskStorage instance = new taskStorage();
        boolean expResult = false;
        boolean result = instance.returnTotalHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
