package com.length;

import java.util.HashMap;
import java.util.Map;

public class Length {
    protected double numericVal;
    protected Units unit;

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

//    @Override
//    public boolean equals(Length that) {
//        return isEqualTo(that);
//    }
//
//    private void createConversionList(){
//        unitToCm.put(Units.FT,30.48);
//        unitToCm.put(Units.CM,1.0);
//        unitToCm.put(Units.INCH,2.54);
//    }
//
//    public double compare(Length l) {
//        createConversionList();
//        return Math.abs(this.value*unitToCm.get(u)-l.value*unitToCm.get(l.u));
//    }
}
