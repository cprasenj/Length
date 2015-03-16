package com.length;

import java.util.HashMap;
import java.util.Map;

public class LengthConverter {
    private Map<Units, Double> unitToCm = new HashMap<Units, Double>();

    public LengthConverter() {
        unitToCm.put(Units.FT,30.48);
        unitToCm.put(Units.CM,1.0);
        unitToCm.put(Units.INCH,2.54);
    }

    public Length convert(Length length, Units unit) {
        return new Length((length.numericVal*unitToCm.get(length.unit)/unitToCm.get(unit)),unit);
    }
}



