package com.example.micka.coopshopexpress;


public class Item {

    private String product;
    private String id;
    private boolean isScanned;
    private double cost;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Item (String product, String id, double cost) {
        this.product=product;
        this.id=id;
        this.cost = cost;
    }

    public Item (String product, String id, double cost, boolean isScanned) {
        this.product=product;
        this.id=id;
        this.cost = cost;
        this.isScanned = isScanned;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setScanned(boolean b) { this.isScanned = b; }

    public boolean isScanned() { return isScanned; }

    public String toString(){
        return product + " " + id + " " + cost;
    }
}

