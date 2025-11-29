package com.example.assessment;
public class FoodItem {
    private String name;
    private int imageResId;
    private int quantity;
    private double price;

    public FoodItem(String name, int imageResId, double price) {
        this.name = name;
        this.imageResId = imageResId;
        this.price = price;
        this.quantity = 0;
    }

    public String getName() { return name; }
    public int getImageResId() { return imageResId; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getPrice() { return price; }
    public void increaseQuantity() { quantity++; }
    public void decreaseQuantity() { if (quantity > 0) quantity--; }
}