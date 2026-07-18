
// 	Assignment 1: Even or Odd Numbers
// Problem Statement
// Write a Java program that accepts an integer N and prints all numbers from 1 to N. For each number, print whether it is Even or Odd.
// Input Format
// A single integer N.
// Output Format
// Print each number followed by Even or Odd.
// Test Case 1
// Input 5
// Output
// 1 -> Odd
// 2 -> Even
// 3 -> Odd
// 4 -> Even5 -> Odd
// Test Case 2
// Input 8
// Output
// 1 -> Odd
// 2 -> Even
// 3 -> Odd
// 4 -> Even
// 5 -> Odd
// 6 -> Even
// 7 -> Odd
// 8 -> Even
// Code :

import java.util.Scanner;

public class one {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int N = sc.nextInt();

       for (int i = 1; i <= N; i++) {

           if (i % 2 == 0) {

               System.out.println(i + " -> Even");

           } else {

               System.out.println(i + " -> Odd");

           }

       }

 

       sc.close();

   }

}



