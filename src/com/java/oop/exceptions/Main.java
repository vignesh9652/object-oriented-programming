package com.java.oop.exceptions;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
//        //Arthimetic Exception
       int num1;
       int num2;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter first number: ");
       num1 = scanner.nextInt();
       System.out.println("Enter second number: ");
       num2 = scanner.nextInt();

       try {
           int result = num1 / num2;
           System.out.println(result);
       } catch (ArithmeticException e){
           System.out.println("Enter a valid number other than zero ");
       }

       // Negitive Array Size Exception
       try {
           int[] arr = new int[-5];
       }catch (Exception e){
           System.out.println("negative array size : " + e.getMessage());
       }

       //Array Index Out Of Bounds
       int[] nums = new int[7];
       try {
           nums[9] = 10;
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println(e.getMessage());
       }

       //Finally Block
       try {
           int[] arr1 = new int[-4];
       }catch (NegativeArraySizeException e){
           System.out.println("Array in negative: " + e.getMessage());
       }finally {
           System.out.println("finally block excutes...");
       }
       System.out.println("program completed");
   }
}
