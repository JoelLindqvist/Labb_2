package se.iths;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.gen5.api.AfterEach;
import org.junit.gen5.api.BeforeAll;
import org.junit.gen5.api.DisplayName;
import se.iths.Calculator.Calculator;


@DisplayName("Calculator test file")
public class CalculatorTest {
    Calculator calculator = new Calculator();
    
    //Trying to @BeforeAll but my JUnit dependency don't work for some reason
    @BeforeAll
    public void testStarter(){
        System.out.println("Starting Tests ");
    
    }

    //Same with AfterEach
    @AfterEach
    public void afterTest(){
        System.out.println("Next Test ");
    }
    
    //The @Test's works fine so Test for add method
    @Test
    public void add(){
    assertEquals(10, calculator.add(5, 5));
    }

    /*
    //This repeatedtest should work but i can't test it :/
    @DisplayName("@RepeatedTest")
    @RepeatedTest(5)
    void addNumber(){
        assertEquals(2, calculator.add(1, 1));
    }
    */

    //Test for the subtraction method
    @Test
    public void subtract(){
        assertEquals(8, calculator.subract(10, 2));
    }

    //Test for the multiplication method
    @Test
    public void multiplication(){
        assertEquals(100, calculator.multiplication(10, 10));
    }

    //Test for the division method
    @Test 
    public void division(){
        assertEquals(3, calculator.division(6, 2));
    }
}