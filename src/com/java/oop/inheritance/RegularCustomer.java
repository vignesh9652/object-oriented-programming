package com.java.oop.inheritance;

public class RegularCustomer extends Customer{
    int shippingCharges = 50;
    String memberShip = "Silver";

    public RegularCustomer(int id, String name, String gender, String address, long phoneNo, int age, String mail, int password, int shippingCharges, String memberShip) {
        super(id, name, gender, address, phoneNo, age, mail, password);
        this.shippingCharges = shippingCharges;
        this.memberShip = memberShip;
    }

    public RegularCustomer(int id, String rani, String female, String mail, String secundrabad, byte age, long l, int password, String silver) {
        super();
    }
}
