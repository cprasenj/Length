package com.length;


import java.util.HashMap;
import java.util.Map;

public class ScalarQuantity {
    protected static final Map<Units, Double> conversionFactors = new HashMap<Units, Double>();

    protected double numericVal;
    protected Units unit;

    public ScalarQuantity(double val, Units unit) {
        this.numericVal = val;
        this.unit = unit;
    }

    public double changeTo(Units unit) {
        return numericVal * conversionFactors.get(this.unit) / conversionFactors.get(unit);
    }

    public double compare(ScalarQuantity q) {
        return 0;
    }
}
