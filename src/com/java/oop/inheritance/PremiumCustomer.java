package com.java.oop.inheritance;

public class PremiumCustomer extends Customer{
    int shippingCharges ;
    String memberShip ;

    public PremiumCustomer(int id, String name, String gender, String address, long phoneNo, int age, String mail, int password, int shippingCharges, String memberShip) {
        super(id, name, gender, address, phoneNo, age, mail, password);
        this.shippingCharges = shippingCharges;
        this.memberShip = memberShip;
    }

    public PremiumCustomer(int id, String ravi, String male, String mail, String mAdhapur, byte age, long l, int password, String gold) {
    }
}
