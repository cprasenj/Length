package com.lengthTest;


import com.length.Length;
import com.length.Units;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LengthTest {
    @Test
    public void comparision_of_1cm_with_1cm_should_give_0() {
        Length l1 = new Length(1.00, Units.CM);
        Length l2 = new Length(1.00, Units.CM);
        assertTrue(l1.isEqualTo(l2));
    }

//    @Test
//    public void CompareGives_0_for_1_ft_and_12_in() {
//        Length l1 = new Length (1, Units.FT);
//        Length l2 = new Length(12, Units.INCH);
//        assertEquals(l1.compare(l2),0.0,0.0);
//        assertEquals(l2.compare(l1),0.0,0.0);
//    }
//
//    @Test
//    public void CompareGives_0_for_1ft_and_1ft() {
//        Length l1 = new Length(1,Units.FT);
//        Length l2 = new Length(1,Units.FT);
//        assertEquals(l1.compare(l2),0.0,0.0);
//    assertEquals(l2.compare(l1),0.0,0.0);
//    }
//
//    @Test
//    public void CompareGives_0_for_1cm_and_1cm() {
//
//    }
}
