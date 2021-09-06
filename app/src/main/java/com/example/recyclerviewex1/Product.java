package com.example.recyclerviewex1;

public class Product {
    private String name;
    private String price;
    private int image;

    public Product() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }

    public Product(String name, String price, int image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }
}
