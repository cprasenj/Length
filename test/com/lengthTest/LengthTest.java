package com.lengthTest;


import com.length.Length;
import com.length.ScalarQuantity;
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

    @Test
    public void convert_should_convert_1cm_to_1cm () {
        Length l = new Length(1.0, Units.CM);
        Length expected = new Length(1.0, Units.CM);
        Length actual = l.convert(Units.CM);
        assertTrue(expected.isEqualTo(actual));
    }

    @Test
    public void convert_should_convert_1ft_to_12inch () {
        Length l = new Length(1.0, Units.FT);
        Length expected = new Length(12.0, Units.INCH);
        Length actual = l.convert(Units.INCH);
        assertTrue(expected.isEqualTo(actual));
    }

    @Test
    public void convert_should_convert_12inch_to_1ft () {
        Length l = new Length(12, Units.INCH);
        Length expected = new Length(1.0, Units.FT);
        Length actual = l.convert(Units.FT);
        assertTrue(expected.isEqualTo(actual));
    }

    @Test
    public void convert_should_convert_1ft_to_30_48cm () {
        Length l = new Length(1, Units.FT);
        Length actual = l.convert(Units.CM);
        Length expected = new Length(30.48, Units.CM);
        assertTrue(expected.isEqualTo(actual));
    }

    @Test
    public void convert_should_convert_1inch_to_2_54cm () {
        Length l = new Length(1, Units.INCH);
        Length actual = l.convert(Units.CM);
        Length expected = new Length(2.54, Units.CM);
        assertTrue(expected.isEqualTo(actual));
    }

    @Test
    public void CompareGives_0_for_1_ft_and_12_in() {
        Length l1 = new Length (1, Units.FT);
        Length l2 = new Length(12, Units.INCH);
        assertEquals(l1.compare(l2),0.0,0.0);
        assertEquals(l2.compare(l1),0.0,0.0);
    }

    @Test
    public void CompareGives_0_for_1ft_and_1ft() {
        Length l1 = new Length(1,Units.FT);
        Length l2 = new Length(1,Units.FT);
        assertEquals(l1.compare(l2),0.0,0.0);
    assertEquals(l2.compare(l1),0.0,0.0);
    }
//
//    @Test
//    public void CompareGives_0_for_1cm_and_1cm() {
//
//    }
}
