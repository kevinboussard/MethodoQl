/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

// Class to execute Tests
import org.junit.Test;
// Class to equal 2 params
import static org.junit.Assert.*;

/**
 *
 * @author kevin
 */
public class FunctionTest {
    
    public FunctionTest() {
    }

    /**
     * Test of addition method, of class Function.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        long a = 5L;
        long b = 1L;
        Function instance = new Function();
        long expResult = 6L;
        long result = instance.addition(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplication method, of class Function.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        long a = 8L;
        long b = 2L;
        Function instance = new Function();
        long expResult = 16L;
        long result = instance.multiplication(a, b);
        assertEquals(expResult, result);
    }
    
}
