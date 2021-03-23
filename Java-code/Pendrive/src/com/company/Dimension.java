package com.company;

import com.company.weight.Weight;

public class Dimension {
    private int width;
    private int height;
    private  int depth;
    private PendriveSize unit;
    private Weight weight;

    public Dimension(int width, int height, int depth,PendriveSize unit){
        this.width=width;
        this.height=height;
        this.depth=depth;
        this.unit=unit;
   }
   public Dimension(int width, int height, int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
        this.unit=PendriveSize.MM;

   }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public PendriveSize getUnit() {
        return unit;
    }

    public void setUnit(PendriveSize unit) {
        this.unit = unit;
    }
    @Override
    public String toString(){
        return "Dimension{"+
                "width="+width +
                ", height="+height +
                ", depth="+depth +
                ", unit='"+unit +
                ", weight='"+width +
                '}';

    }
}
