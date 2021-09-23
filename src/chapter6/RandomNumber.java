package chapter6;

import java.util.Scanner;

public class RandomNumber {

        public static void main(String[] args){
            int secretNumber = (int) (Math.random() * 500 + 100);

             Scanner keyboard = new Scanner(System.in);
            int guess;
            do {

                System.out.println("Enter a guess: ");
                guess = keyboard.nextInt();
                if (guess == secretNumber)
                    System.out.println("Correct! Congratulation! ");

                if (guess < secretNumber)
                    System.out.println("Your guess is less than the secret number. ");

                if (guess > secretNumber)
                    System.out.println("Your guess is greater than the secret number. ");


            }
            while	 (guess != secretNumber);

        }


    }

