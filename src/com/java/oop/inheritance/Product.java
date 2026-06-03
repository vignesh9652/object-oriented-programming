package com.java.oop.inheritance;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    float rating;
    long reviewsCount;
    int discountPercentage;
    boolean isAvailable;
    String company;
    String category;

    public Product(int id, String name, int maxRetailPrice, float rating, long reviewsCount, byte discountPercentage, boolean isAvailable, String company, String category) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
        this.discountPercentage = discountPercentage;
        this.isAvailable = isAvailable;
        this.company = company;
        this.category = category;
    }
    public int calculateFinalPrice(RegularCustomer regularCustomer){
        int dicountPrice = maxRetailPrice * discountPercentage / 100;
        int finalPrice = maxRetailPrice - dicountPrice + 50;
        return finalPrice;
    }
    public int calculateFinalPrice(PremiumCustomer premiumCustomer){
        discountPercentage = discountPercentage + 20;
        int dicountPrice = maxRetailPrice * discountPercentage / 100;
        int finalPrice = maxRetailPrice - dicountPrice;
        return finalPrice;
    }

}
