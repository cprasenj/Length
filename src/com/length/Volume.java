package com.length;

/**
 * Created by cprasenj on 3/16/2015.
 */
public class Volume extends ScalarQuantity{
    static{
        conversionFactors.put(Units.LT,1.0);
        conversionFactors.put(Units.GALLON,3.78);
    }
    public Volume(double numericVal, Units unit) {
        super(numericVal, unit);
        this.baseUnit = Units.LT;
    }

    public Volume convert(Units u) {
        return new Volume(changeTo(u),u);
    }
}
