package com.company.pendrive;

public class Price {
    private double regularPrice;
    private double salesPrice;

    public Price(double regularPrice, double salesPrice) {
        this.regularPrice = regularPrice;
        this.salesPrice = salesPrice;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    @Override
    public String toString() {
        return "Price{" +
                "regularPrice=" + regularPrice +
                ", salesPrice=" + salesPrice +
                '}';
    }
}
