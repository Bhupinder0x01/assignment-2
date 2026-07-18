// Assignment 4: Number Guessing Game
// Problem Statement
// The secret number is 27. The user has 5 attempts to guess it. Print Too Low, Too High, or Congratulations accordingly. If not guessed within five attempts, print Better Luck Next Time!
// Input Format
// Five integers representing guesses.
// Output Format
// Print the appropriate response after every guess.
// Test Case 1
// Input
// 10 20 27
// Output
// Too Low
// Too Low
// Congratulations! You guessed it.
// Test Case 2
// Input
// 30 40 15 25 26
// Output
// Too High
// Too High
// Too Low
// Too Low
// Too Low
// Better Luck Next Time!

// Code:

import java.util.Scanner;

 

public class four {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

 

       int secret = 27;

       boolean guessed = false;

 

       for (int i = 1; i <= 5; i++) {

           int guess = sc.nextInt();

 

           if (guess == secret) {

               System.out.println("Congratulations! You guessed it.");

               guessed = true;

               break;

           } else if (guess < secret) {

               System.out.println("Too Low");

           } else {

               System.out.println("Too High");

           }

       }

 

       if (!guessed) {

           System.out.println("Better Luck Next Time!");

       }

 

       sc.close();

   }

}

