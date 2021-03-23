package com.company;
import com.company.weight.Weight;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {

        Dimension dim=new Dimension(60,20,9,PendriveSize.MM);
        dim.setWeight(new Weight(10));
        System.out.println(dim.getWidth()+" * " +dim.getHeight() +" * "+dim.getDepth() + dim.getUnit());
        Weight weight = dim.getWeight();
        System.out.println((int) weight.getValue() + weight.getUnit().toString().toLowerCase());
}

    }

