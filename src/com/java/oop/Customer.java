package com.java.oop;

public class Customer {

        int id;
        String name;
        String gender;
        String address;
        long phoneNo;
        int age;
        String mail;
        int password;
// Passing Arguments into the Constructor (Argument Constructor)

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
   //No argument Constructor
    public Customer(){
            id =2;
            name = "Balu";
            gender = "Male";
            address = "Tirupati";
            phoneNo = 964393;
            age = 21;
            mail = "balu123@gami.com";
            password = 122222;

        }
    }



