package com.company.weight;

public class Weight {
    private double value;
    private  WeightUnit unit;

    public Weight(double value,WeightUnit unit){
       this.value=value;
       this.unit=unit;
    }
    public Weight(double value){
        this.value=value;
        this.unit=WeightUnit.G;
    }

    public void getValue(double value) {
        this.value = value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void getValue(WeightUnit unit) {
        this.unit= unit;
    }

    public void setValue(WeightUnit unit) {
        this.unit = unit;
    }


    public  double getValue() {
        return value;
    }

    public WeightUnit getUnit() {
        return unit;
    }
}


