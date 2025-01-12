package com.StarkIndustries.SpringWebMark1.Model;

public class Product {

    private int productId;
    private String name;
    private String company;
    private double price;

    public Product(int productId, String name, String company, double price) {
        this.productId = productId;
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public Product(String name, String company, double price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public Product(){

    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }
}

