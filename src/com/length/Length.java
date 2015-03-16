package com.length;

import java.util.HashMap;
import java.util.Map;

public class Length extends ScalarQuantity {
    static{
        conversionFactors.put(Units.FT,30.48);
        conversionFactors.put(Units.CM,1.0);
        conversionFactors.put(Units.INCH,2.54);
    }
    public Length(double numericVal, Units unit) {
        super(numericVal, unit);
    }

    public boolean isEqualTo(Length that) {
        double l1 = this.changeTo(Units.CM);
        double l2 = that.changeTo(Units.CM);
        return (l1 - l2 < 0.1) && (this.unit.equals(that.unit));
    }

    public Length convert(Units unit) {
        return new Length(this.changeTo(unit),unit);
    }

    public String toString() {
        return ""+this.numericVal;
    }
}
