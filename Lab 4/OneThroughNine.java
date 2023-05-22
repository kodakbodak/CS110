// Author: Isaac Smith
// Date: 04/20/2023
// File: Lab 4 - Integer Facts 1-9

import java.util.Scanner;

public class OneThroughNine {

   public static void main (String [] args) {
      
      // Declare variables and assign variables, also create a new scanner object
      int interestingInteger = 0;
      Scanner keyboard = new Scanner(System.in);
      
      // Prompt user to input an integer to learn about
      System.out.print("Pick a number, 1-9, that you want to know more about: ");
      interestingInteger = keyboard.nextInt();
      
      // Use a switch ststement to determine which info to print out to the user
      switch(interestingInteger) {
      
         case 1:
            System.out.print("1 can be written as 1*1, thus it has 2 factors, but they are not different hence it is not a prime number.");
            break; 
        
         case 2:
            System.out.print("2 is the only even prime number and it is the smallest prime number.");
            break;
         
         // 3 and 9 have the same fun fact   
         case 3, 9:
            System.out.print("3 squared is 9, and the square root of 9 is 3.");
            break;
              
         case 4:
            System.out.print("4 is the smallest square greater than 1.");
            break;
            
         case 5:
            System.out.print("5 is half of 10! Wow!");
            break;
            
         case 6:
            System.out.print("6 is the smallest numbers that is equal to the sum of its proper divisors! Interesting!");
            break;
         
         // 7 and 8 have the same fun fact   
         case 7, 8:
            System.out.print("The numbers 7 and 8 are both less than 9! Wow!");
            break;
                     
                        
      
      }
      
   
   }

}