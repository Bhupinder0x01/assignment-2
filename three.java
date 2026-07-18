// Assignment 3: Prime Numbers in a Range
// Problem Statement
// Accept Start and End as input and print all prime numbers in the given range (inclusive).
// Input Format
// First line: Start
// Second line: End
// Output Format
// Print each prime number on a new line.
// Test Case 1
// Input
// 10 30
// Output
// 11
// 13
// 17
// 19
// 23
// 29
// Test Case 2
// Input 2 15
// Output
// 2
// 3
// 5
// 7
// 11
// 13

// Code:

import java.util.Scanner;

 

public class three {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

 

       int start = sc.nextInt();

       int end = sc.nextInt();

 

       for (int i = start; i <= end; i++) {

 

           if (i < 2) {

               continue;

           }

 

           boolean isPrime = true;

 

           for (int j = 2; j <= i / 2; j++) {

               if (i % j == 0) {

                   isPrime = false;

                   break;

               }

           }

 

           if (isPrime) {

               System.out.println(i);

           }

       }

 

       sc.close();

   }

}

