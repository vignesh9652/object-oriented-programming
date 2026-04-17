package com.java.oop;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.id = 1;
        product.name = "Vivo Y75";
        product.company = "Vivo";
        product.maxRetailPrice = 21000;
        product.isAvailable = true;
        product.rating = 4.5F;
        product.discountPercentage = 25;
        product.reviewsCount = 1900;
        product.category = "Mobile";
        System.out.println("Id Name : " + product.id);
        System.out.println("Name : " + product.name);
        System.out.println("Company Name : " + product.company);
        System.out.println("Product MRP : " + product.maxRetailPrice);
        System.out.println("Available : " + product.isAvailable);
        System.out.println("Rating : " + product.rating);
        System.out.println("Discount Percentage : " + product.discountPercentage);
        System.out.println("Reviews Count : " + product.reviewsCount);
        System.out.println("Category : " + product.category);
        System.out.println("--------------------------------------");

        Product product1 = new Product();
        product1.id = 2;
        product1.name = "Smart LED Tv";
        product1.company = "Samsung";
        product1.maxRetailPrice = 27490;
        product1.isAvailable = true;
        product1.rating = 3.9F;
        product1.discountPercentage = 30;
        product1.reviewsCount = 890;
        product1.category = "LED TV";
        System.out.println("Id Name : " + product1.id);
        System.out.println("Name : " + product1.name);
        System.out.println("Company Name : " + product1.company);
        System.out.println("Product MRP : " + product1.maxRetailPrice);
        System.out.println("Available : " + product1.isAvailable);
        System.out.println("Rating : " + product1.rating);
        System.out.println("Discount Percentage : " + product1.discountPercentage);
        System.out.println("Reviews Count : " + product1.reviewsCount);
        System.out.println("Category : " + product1.category);
        System.out.println("---------------------------------");
        Customer customer = new Customer();
        System.out.println("ID: " + customer.id);
        System.out.println("Name: " + customer.name);
        System.out.println("Gender: " + customer.gender);
        System.out.println("Address: " + customer.address);
        System.out.println("Age: " + customer.age);
        System.out.println("Phone Number: " +customer.phoneNo);
        System.out.println("Password: " + customer.password);
        System.out.println("---------------------");
        Customer customer1 = new Customer(1,"gun","male","nandyala",9866544,24,"gun@123",787);
        System.out.println("Id: " +customer1.id);
        System.out.println("Name: " + customer1.name);
        System.out.println("Gender: " + customer1.gender);
        System.out.println("Address: " + customer1.address);
        System.out.println("Age: " + customer1.age);
        System.out.println("Phone Number: " +customer1.phoneNo);
        System.out.println("Password: " + customer1.password);
    }
}
