package com.lengthTest;

import com.length.Length;
import com.length.Units;
import com.length.Volume;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by cprasenj on 3/16/2015.
 */
public class VolumeTest {
    @Test
    public void compare_compares_gallon_with_lts() {
        Volume v1 = new Volume(1, Units.GALLON);
        Volume v2 = new Volume(3.78, Units.LT);
        assertEquals(v1.compare(v2, Units.LT), 0.0, 0.0);
        assertEquals(v2.compare(v1, Units.LT), 0.0, 0.0);
    }
    @Test
    public void compare_compares_1gallon_with_7p56_lts_and_give_difference() {
        Volume v1 = new Volume(1, Units.GALLON);
        Volume v2 = new Volume(3.78*2, Units.LT);
        assertEquals(v1.compare(v2, Units.GALLON), 1.0, 0.0);
        assertEquals(v2.compare(v1, Units.LT), 3.78, 0.0);
    }

    @Test
    public void convert_should_convert_1Gallon_to_3_78lt () {
        Volume l = new Volume(1, Units.GALLON);
        Volume actual = l.convert(Units.LT);
        Volume expected = new Volume(3.78, Units.LT);
        assertTrue(expected.isEqualTo(actual));
    }

    @Test
    public void add_1lt_with_1lt_should_give_2lt() {
        Volume sq1 = new Volume(1, Units.LT);
        Volume sq2 = new Volume(1, Units.LT);
        Volume expected = new Volume(2, Units.LT);
        Volume actual = (Volume)sq1.add(sq2, Units.LT);
        assertTrue(expected.isEqualTo(actual));
    }
}
