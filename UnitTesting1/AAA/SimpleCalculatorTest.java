package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    private  SimpleCalculator cal;

    @BeforeEach
    void setup()
    {
        cal=new SimpleCalculator();
        System.out.println("Arrange step pf AAA,new instance created");
    }

    @AfterEach
    void tearDown(){
        cal=null;
        System.out.println("Teardown pr cleaning up");
    }
    @Test
    void addition_of_2_2(){
        int res=cal.add(2,2);
        assertEquals(4,res);

        assertNotEquals(5,res);

        assertTrue(res==4);

        assertFalse(res==5);

        assertNull(null);

        assertNotNull(cal);
    }

    @Test
    void three_plus_7_is_10(){
        int res=cal.add(7,3);
        assertEquals(10,res);
    }
}