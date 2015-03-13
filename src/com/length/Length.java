package com.length;

public class Length {
    private  double value;
    private unit u;

    public Length(double quantity, unit u) {
        this.value = quantity;
        this.u = u;
    }

    public double compare(Length l) {
        ConvertionMultiplicant c = new ConvertionMultiplicant();
        c.createConversionList();
        return Math.abs(this.value*c.unitToCm.get(u)-l.value*c.unitToCm.get(l.u));
    }
}
