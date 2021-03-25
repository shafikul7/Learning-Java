package com.company;

import com.company.pendrive.PenDrive;
import com.company.pendrive.Price;
import com.company.pendrive.ProductSpecification;
import com.company.pendrive.ProductStatus;

public class Main {

    public static void main(String[] args) {
        PenDrive penDrive1 =new PenDrive("AData UV128 USB 3.2 128GB Pendrive",
                "Adata UV128 USB 3.2 Pendrive featured with 128GB capacity, USB 3.2 High-Speed Interface and a sliding USB connector," +
                        " which smoothly extends from the drive at the push of a thumb. In this Pen Drive", new Price(800,740));
        penDrive1.setBrand("Adata");
        penDrive1.setProductCode("123ds");
        penDrive1.setSKU("PP123");
        penDrive1.setStatus(ProductStatus.In_Stock);

        //Add Feature
        penDrive1.addFeature("Feature 1");
        penDrive1.addFeature("Feature 2");
        penDrive1.addFeature("Feature 3");
        penDrive1.addFeature("Feature 4");
        penDrive1.addFeature("Feature 5");

        //Add specifications
        penDrive1.addSpecification(new ProductSpecification("Capacity","128GB","key Features"));
        penDrive1.addSpecification(new ProductSpecification("Read Speed","Up to 100 MB/s read","key Features"));
        penDrive1.addSpecification(new ProductSpecification("Connectivity","USB 3.2","Physical Attribute"));
        penDrive1.addSpecification(new ProductSpecification("Dimensions","60 x 20 x 9mm","Physical Attribute"));

       penDrive1.drawProduct();
}

    }

