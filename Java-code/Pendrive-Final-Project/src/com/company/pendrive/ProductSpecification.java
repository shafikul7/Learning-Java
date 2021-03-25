package com.company.pendrive;

import java.util.UUID;

public class ProductSpecification {
    private  final String id;
    public int Lenght;
    private  String key;
    private String value;
    private  String group;

    public ProductSpecification(String key, String value, String group) {
        this.id= UUID.randomUUID().toString();
        this.key = key;
        this.value = value;
        this.group = group;
    }

    public String getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "ProductSpecification{" +
                "id='" + id + '\'' +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
