// Assignment 2: Multiplication Tables
// Problem Statement
// Write a Java program that takes an integer N and prints multiplication tables from 1 to N. Each table should be printed up to 10.
// Input Format
// A single integer N.
// Output Format
// Print the multiplication table for every number from 1 to N.
// Test Case 1
// Input 2
// Output
// Table of 1 ... up to 10

// Table of 2 ... up to 10
// Test Case 2
// Input 1
// Output
// Table of 1
// 1 x 1 = 1
// ...
// 1 x 10 = 10

 

 

// Code:

import java.util.Scanner;

 

public class two {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

 

       int N = sc.nextInt();

 

       for (int i = 1; i <= N; i++) {

           System.out.println("Table of " + i);

 

           for (int j = 1; j <= 10; j++) {

               System.out.println(i + " x " + j + " = " + (i * j));

           }

 

           System.out.println(); //

       }

 

       sc.close();

   }

}

