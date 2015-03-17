package com.length;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;


public abstract class ScalarQuantity {
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

    public ScalarQuantity add(ScalarQuantity that, Units unit) {
        double result = this.changeTo(unit)+that.changeTo(unit);
        try {
            return this.getClass().getConstructor(double.class,Units.class).newInstance(result,unit);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
