package com.length;


import java.util.HashMap;
import java.util.Map;

public class ScalarQuantity {
    protected static final Map<Units, Double> conversionFactors = new HashMap<Units, Double>();

    protected Units baseUnit = null;
    protected double numericVal;
    protected Units unit;

    public ScalarQuantity(double val, Units unit) {
        this.numericVal = val;
        this.unit = unit;
    }

    public boolean isEqualTo(ScalarQuantity that) {
        double l1 = this.changeTo(baseUnit);
        double l2 = that.changeTo(baseUnit);
        return Math.abs(Double.compare(l1,l2)) < 0.1;
    }

    public double changeTo(Units unit) {
        return numericVal * conversionFactors.get(this.unit) / conversionFactors.get(unit);
    }

    public double compare(ScalarQuantity q,Units u) {
        return Math.abs(this.changeTo(u) - q.changeTo(u));
    }

}
