/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.midwest.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Midwest
 */
public class CalculatorTest {
    Calculator cal;
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cal = new Calculator();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testAdd() {
         assertEquals(8, cal.add(6,2));
    
     
     }
     @Test
     public void testsub() {
         assertEquals(4, cal.sub(6,2));
         
     
     } 
     
       @Test
     public void testMulti() {
         assertEquals(6, cal.multi(3,2));
         
     
     } 
     
     
     
}
