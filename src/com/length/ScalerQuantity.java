package com.length;

/**
 * Created by cprasenj on 3/16/2015.
 */
public class ScalerQuantity {
    protected double numericVal;
    protected Units unit;

    public Length convert(Length length, Units unit) {
        return new Length((length.numericVal*unitToCm.get(length.unit)/unitToCm.get(unit)),unit);
    }
}
