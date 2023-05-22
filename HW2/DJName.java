// Author: Isaac Smith
// Date: 04/12/2023
// File: Homework 2 DJ Name

// 1. Declare variables to hold name parts, all type String
// 2. Collect first and last names using Scanner
// 3. Assign first name part (using substring method) to be all
//    characters from string index location 0 to location (len/2)
//    of first name String
// 4. Assign last name second half (using substring method), to be all
//    characters from (length / 2), until the (last-1) index location of last
//    name if odd number of characters and until the last, if even.
// 5. Output first name first half concatenated with last name second half
//    concatenated with "Jayster"


//Import the Java Scanner class to take user input
import java.util.Scanner;

public class DJName {

   public static void main(String[] args) {
            
      // Create a new Scanner object
      Scanner userName = new Scanner(System.in);
      
      // Set 2 String variables to hold name information using null as current value
      String firstHalf = null;     
      String lastHalf = null;
      
      // Use our scanner object to assign a value to String firstName
      System.out.print("Please enter your first name: ");
      String firstName = userName.nextLine();
     
      // Use our scanner object to assign a value to String lastName
      System.out.print("Please enter your last name: ");
      String lastName = userName.nextLine();   
              
 
      // Set firstName as equal to the first half of the string
      firstHalf = firstName.substring(0, firstName.length() / 2);
              
      // If last name has an EVEN number of characters, do this
      if (lastName.length() % 2 == 0) {
         lastHalf = lastName.substring(lastName.length() / 2, lastName.length());
      }
      
      // If last name has an ODD amount of characters, do this 
      else if (lastName.length() % 2 != 0) {
         lastHalf = lastName.substring(lastName.length() / 2, lastName.length() - 1);
      }
           
      System.out.println("Your DJ Name is " + firstHalf + lastHalf + "Jayster.");
      
  } 
      
    
}


