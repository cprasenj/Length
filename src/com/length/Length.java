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
        this.baseUnit = Units.CM;
    }

    public Length convert(Units u) {
        return new Length(changeTo(u),u);
    }

    public String toString() {
        return ""+this.numericVal;
    }
}
