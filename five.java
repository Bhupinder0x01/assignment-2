// Assignment 5: Strong Numbers in a Range
// Problem Statement
// A Strong Number is a number equal to the sum of the factorials of its digits. Accept Start and End and print all Strong Numbers in the range.
// Input Format
// First line: Start
// Second line: End
// Output Format
// Print each Strong Number on a new line.
// Test Case 1
// Input
// 1 200
// Output
// 1
// 2
// 145
// Test Case 2
// Input
// 100 500
// Output
// 145
 
// Code:
import java.util.Scanner;
 
public class five {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
 
       int start = sc.nextInt();
       int end = sc.nextInt();
 
       for (int i = start; i <= end; i++) {
           int num = i;
           int sum = 0;
 
           while (num > 0) {
               int digit = num % 10;
 
               int fact = 1;
               for (int j = 1; j <= digit; j++) {
                   fact = fact * j;
               }
 
               sum = sum + fact;
               num = num / 10;
           }
 
           if (i == 0) {
               sum = 1;
           }
 
           if (sum == i) {
               System.out.println(i);
           }
       }
 
       sc.close();
   }
}