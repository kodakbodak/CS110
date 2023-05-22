//Author: Isaac Smith
// Date: 050/04/2023
// File: Lab 6 - Read File Line by Line


import java.util.Scanner; // Import the Scanner class
import java.io.*;         // Import Java I/O classes

// Define a new class
public class ReadFileLineByLine { 

    // the main method
    public static void main (String[] args) throws IOException{ 
	
   	// Declare a new String variable to hold file name      
      String myFileName = "ReadFileLineByLine.txt";
   	
      // Create a new File object      
      File myFile = new File(myFileName);
   	
      // Create a new Scanner object      
      Scanner inputFile = new Scanner(myFile);
   	
      // 4. declare a variable, loopNumber, of type int, and 
   	// assign it the value 0
      
      int loopNumber = 0;
      
   	// Use a while loop to determine which lines to print and print the appropriate lines
      while (inputFile.hasNext()) {
         
         loopNumber++;
         
         String fileLine = inputFile.nextLine();
            
            if (loopNumber % 7 == 0) {
            
               System.out.println(fileLine);
            
            }
                
      }
   	// Close the file
	   inputFile.close();
    }
}
	
	