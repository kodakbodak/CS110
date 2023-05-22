// Author: Isaac Smith
// Date: 04/27/2023
// File: ASCII art using for loops

import java.util.Scanner;

public class ForLoopAsciiArt {

   public static void main (String [] args) {
      
      // Create a new scanner object and declare variables
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("How tall should the triangle be: ");
      
      int triangleHeight = keyboard.nextInt();
      
      // Use for loops to print the triangle
      for (int row = 0; row <= triangleHeight; row ++) {
      
         for (int column = 0; column < row; column ++) {
         
            System.out.print("%");
         
      }
         
         System.out.println();
      
      }
         
   
   }

}