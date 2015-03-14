package com.lengthTest;

import com.length.Length;
import com.length.LengthConverter;
import com.length.Units;
import com.length.Units;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class LengthConverterTest {
    @Test
    public void toCMUnit_should_convert_1cm_to_1cm () {
        LengthConverter converter = new LengthConverter();
        Length l = new Length(1.0, Units.CM);
        Length expected = new Length(1.0, Units.CM);
        Length actual = converter.convert(l, Units.CM);
        assertTrue(expected.isEqualTo(actual));
    }

    @Test
    public void toCMUnit_should_convert_1ft_to_12inch () {
        LengthConverter converter = new LengthConverter();
        Length l = new Length(1.0, Units.FT);
        Length expected = new Length(12.0, Units.INCH);
        Length actual = converter.convert(l, Units.INCH);
        assertTrue(expected.isEqualTo(actual));
    }
}

