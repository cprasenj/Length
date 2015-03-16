package com.lengthTest;

import com.length.VolUnits;
import com.length.Volume;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cprasenj on 3/16/2015.
 */
public class VolumeTest {
    @Test
    public void compare_compares_gallon_with_lts() {
        Volume v1 = new Volume(1, VolUnits.GALLON);
        Volume v2 = new Volume(3.78, VolUnits.LT);
        assertEquals(v1.compare(v2), 0.0,  0.0);
        assertEquals(v2.compare(v1), 0.0,  0.0);
    }
}
