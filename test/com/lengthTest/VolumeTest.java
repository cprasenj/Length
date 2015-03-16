package com.lengthTest;

import com.length.Units;
import com.length.Volume;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
