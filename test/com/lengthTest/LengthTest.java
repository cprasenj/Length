package com.lengthTest;


import com.length.Length;
import com.length.unit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthTest {
    @Test
    public void CompareGives_0_for_1_ft_and_12_in() {
        Length l1 = new Length (1, unit.ft);
        Length l2 = new Length(12,unit.inch);
        assertEquals(l1.compare(l2),0.0,0.0);
    }
}
