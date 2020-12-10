package se.iths;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.gen5.api.AfterEach;
import org.junit.gen5.api.BeforeAll;
import se.iths.TextProcessor.TextProcessor;

public class TextProcessorTest {

    TextProcessor textProcessor = new TextProcessor();

    //BeforeAll
    @BeforeAll
    public void testStarter(){
        System.out.println("Starting Tests ");
    
    }

    //AfterEach
    @AfterEach
    public void afterTest(){
        System.out.println("Next Test ");
    }
    
    //@Disabled didn't want to work, @Ignore still skipps the test.
    @Ignore
    @Test
    public void willReturnFalse(){
        assertTrue(false);
    }

    //Test for the toUpper method
    @Test
    public void toUpperTest(){
        assertTrue("HEHEHOHO".equals(textProcessor.stringToUppercase("hehehoho")));
    }

    //Test for the toLower method
    @Test
    public void toLowerTest(){
        assertTrue("hehehoho".equals(textProcessor.stringToLowercase("HEHEHOHO")));
    }

    //Test for the reverse string
    @Test
    public void reverseStringTest(){
        assertFalse("oHoHeHeH".equals(textProcessor.stringReverse("HeHeHoHo")));
        assertNotNull(textProcessor.stringReverse("HeHeHoHo"));
    } 
}
