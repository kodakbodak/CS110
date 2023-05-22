// Author: Isaac Smith
// Date: 05/04/2023
// File: Lab 6 Random Numbers

import java.util.Scanner;
import java.util.Random;

public class GenerateSomeRandomLotteryNums {

   public static void main (String [] args) {
      
      // Prompt user with instructions (input fo number of numbers to guess)
      System.out.print("I know you are busy, so I will guess\n" +
                       "your lottery numbers for you.\n" +
                       "How many numbers should I guess? ");
      
      // Create a new scanner object to take user input               
      Scanner keyboard = new Scanner(System.in);
      
      // Store the amount of numbers to guess here
      int howManyGuesses = keyboard.nextInt();
      
      // Prompt user to tell the highest possible lottery number
      System.out.println("What is the highest possible lottery number? ");
      
      // Store the value of the highest possible lottery number
      int highestNumber = keyboard.nextInt();
      
      // Create a new Random object
      Random randomNumbers = new Random();
      
      // This is where we will genertate the guesses 
      for (int i = 0; i < howManyGuesses; i++) {
         
         // Use this variable to store the value of the randomly generated integers
         // using the highestNumber variable from earlier as the top end of the range
         int randomNum = randomNumbers.nextInt(highestNumber);
            
            // First guess
            if (i == 0) {
               
               System.out.println("The first number is: " + randomNum);
               
            }
            
            // Last guess
            else if (i == (howManyGuesses - 1)) {
               
               System.out.println("The last number is: " + randomNum);
               
            }
            
            // All guesses between the first and last guess
            else {
               
               System.out.println("The next number is: " + randomNum);
            
            }
                     
      
      } 
      
      System.out.println("Good Luck!");   
   
   }

}