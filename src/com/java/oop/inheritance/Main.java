package com.java.oop.inheritance;

public class Main {
    static void main(String[] args) {
        RegularCustomer regularCustomer = new RegularCustomer(10, "Balu", "male", "kkv", 9764677l, 21, "bab@12", 132, 50, "silver");

        Product product = new Product(1, "lenovo", 5637, 4.5f, 2, (byte)4, true, "lenovo", "mobile");
       int regularCustomerFianlPrice = product.calculateFinalPrice(regularCustomer);
        System.out.println(regularCustomerFianlPrice);
       PremiumCustomer premiumCustomer = new PremiumCustomer(9,"he","male","tpt",53944,55,"vhfh@gmail,com",585,0,"Gold");
    int regularPremium = product.calculateFinalPrice(premiumCustomer);
        System.out.println(regularPremium);
    }

}
