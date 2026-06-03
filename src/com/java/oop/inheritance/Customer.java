package com.java.oop.inheritance;

public class Customer {
    int id;
    String name;
    String gender;
    String address;
    long phoneNo;
    int age;
    String mail;
    int password;

    public Customer(int id, String name, String gender, String address, long phoneNo, int age, String mail, int password) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phoneNo = phoneNo;
        this.age = age;
        this.mail = mail;
        this.password = password;

    }

    public Customer() {
    }

    public void displayDetails(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Address : " + address);
        System.out.println("Mobile Number : " + phoneNo);
        System.out.println("Age : " + age);
        System.out.println("Email Address : " + mail);
        System.out.println("Password : " + password);

    }
}
