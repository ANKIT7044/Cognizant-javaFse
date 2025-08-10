package org.example;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void addition_of_2_2(){
        SimpleCalculator cal=new SimpleCalculator();
        assertEquals(4,cal.add(2,2));

        assertNotEquals(5,cal.add(2,2));

        assertTrue(cal.add(2,2)==4);

        assertFalse(cal.add(2,2)==4);

        assertNull(null);

        assertNotNull(cal);
    }

    @Test
    void three_plus_7_is_10(){
        SimpleCalculator cal=new SimpleCalculator();
        assertEquals(10,cal.add(3,7));
    }
}
