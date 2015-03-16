package com.lengthTest;

import com.length.Length;
import com.length.LengthConverter;
import com.length.Units;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class LengthConverterTest {
    @Test
    public void convert_should_convert_1cm_to_1cm () {
        LengthConverter converter = new LengthConverter();
        Length l = new Length(1.0, Units.CM);
        Length expected = new Length(1.0, Units.CM);
        Length actual = converter.convert(l, Units.CM);
        assertTrue(expected.isEqualTo(actual));
    }
    @Test
    public void convert_should_convert_1ft_to_12inch () {
        LengthConverter converter = new LengthConverter();
        Length l = new Length(1.0, Units.FT);
        Length expected = new Length(12.0, Units.INCH);
        Length actual = converter.convert(l, Units.INCH);
        assertTrue(expected.isEqualTo(actual));
    }
    @Test
    public void convert_should_convert_12inch_to_1ft () {
        LengthConverter converter = new LengthConverter();
        Length l = new Length(12, Units.INCH);
        Length expected = new Length(1.0, Units.FT);
        Length actual = converter.convert(l, Units.FT);
        assertTrue(expected.isEqualTo(actual));
    }
    @Test
    public void convert_should_convert_1ft_to_30_48cm () {
        LengthConverter converter = new LengthConverter();
        Length l = new Length(1, Units.FT);
        Length actual = converter.convert(l, Units.CM);
        Length expected = new Length(30.48, Units.CM);
        assertTrue(expected.isEqualTo(actual));
    }
    @Test
    public void convert_should_convert_1inch_to_2_54cm () {
        LengthConverter converter = new LengthConverter();
        Length l = new Length(1, Units.INCH);
        Length actual = converter.convert(l, Units.CM);
        Length expected = new Length(2.54, Units.CM);
        assertTrue(expected.isEqualTo(actual));
    }
}

