package com.length;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cprasenj on 3/13/2015.
 */
public class ConvertionMultiplicant {
    public Map<unit, Double> unitToCm = new HashMap<unit, Double>();

    public void createConversionList(){
        unitToCm.put(unit.ft,30.48);
        unitToCm.put(unit.cm,1.0);
        unitToCm.put(unit.inch,2.54);
    }
}
