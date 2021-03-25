package com.company.pendrive;


import java.util.Arrays;
import java.util.UUID;

public class PenDrive {
    private  final String id;
    private String title;
    private String summary;
    private String description;
    private String brand;
    private String productCode;
    private String SKU;
    private Price price;
    private ProductStatus status;
    private String [] features;
    private ProductSpecification [] specifications;
    private  Faq [] questions;
    private Image[] gallery;

    private int featuresCount =0;
    private int specificationsCount =0;


    public PenDrive(String title, String summary, Price price) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.summary = summary;
        this.price = price;
        this.status=ProductStatus.Upcoming;
        this.features = new String[10];
        this.specifications= new ProductSpecification[20];
        this.questions =new Faq[10];
        this.gallery =new Image[5];
        featuresCount =0;
        specificationsCount =0;
    }

    public PenDrive(String title, String summary, String brand, String productCode, String SKU, Price price) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.summary = summary;
        this.brand = brand;
        this.productCode = productCode;
        this.SKU = SKU;
        this.price = price;
        this.status=ProductStatus.Upcoming;
        this.features = new String[10];
        this.specifications= new ProductSpecification[20];
        this.questions =new Faq[10];
        this.gallery =new Image[5];
        featuresCount =0;
        specificationsCount =0;
    }



    public String getId() {
        return id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getSummary() {

        return summary;
    }

    public void setSummary(String summary) {

        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {

        this.productCode = productCode;
    }

    public String getSKU() {

        return SKU;
    }

    public void setSKU(String SKU) {

        this.SKU = SKU;
    }

    public Price getPrice() {

        return price;
    }

    public void setPrice(Price price) {

        this.price = price;
    }

    public ProductStatus getStatus() {

        return status;
    }

    public void setStatus(ProductStatus status) {

        this.status = status;
    }

    public String[] getFeatures() {

        return features;
    }

    public void setFeatures(String[] features) {

        this.features = features;
    }

    public ProductSpecification[] getSpecifications() {

        return specifications;
    }

    public void setSpecifications(ProductSpecification[] specifications) {

        this.specifications = specifications;
    }

    public Faq[] getQuestions() {

        return questions;
    }

    public void setQuestions(Faq[] questions) {

        this.questions = questions;
    }

    public Image[] getGallery() {

        return gallery;
    }

    public void setGallery(Image[] gallery) {

        this.gallery = gallery;
    }
    public void addFeature(String feature) {

           features[featuresCount++] =feature;
    }

    public void addSpecification(ProductSpecification specification){

            specifications[specificationsCount++]=specification;
    }
    public void addQuestion(Faq question) {
        questions[question.Length] =question;
    }

    public void addImage(Image image){
        gallery[gallery.length]=image;
    }
    public  void drawProduct(){
        System.out.println(title);
        System.out.println("-------------------------------");
        System.out.println("Brand" + brand+"| product code "+ productCode +" |Sku"+ SKU);
        System.out.println();
        System.out.println(summary);

        System.out.println("-------------------------------");
        System.out.println("Features");
        for(int i=0;i<featuresCount;i++){
            System.out.println((i+1)+".\t"+features[i]);
        }
    }

    @Override
    public String toString() {
        return "PenDrive{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", productCode='" + productCode + '\'' +
                ", SKU='" + SKU + '\'' +
                ", price='" + price + '\'' +
                ", status=" + status +
                ", features=" + Arrays.toString(features) +
                ", specifications=" + Arrays.toString(specifications) +
                ", questions=" + Arrays.toString(questions) +
                ", gallery=" + Arrays.toString(gallery) +
                '}';
    }
}
