package com.length;

import java.util.HashMap;
import java.util.Map;

public class Length extends ScalerQuantity {

    public Length(double numericVal, Units unit) {
        this.numericVal = numericVal;
        this.unit = unit;
    }

    public boolean isEqualTo(Length that) {
        LengthConverter converter = new LengthConverter();
        Length l1 = converter.convert(this, Units.CM);
        Length l2 = converter.convert(that, Units.CM);
        return l1.numericVal - l2.numericVal < 0.1;
    }

    public String toString() {
        return ""+this.numericVal;
    }
}
