// Author: Isaac Smith
// Date: 05/11/2023
// File: Lab 7 Dog Kennel

public class DogKennel {

   public static void main (String [] args) {
   
      System.out.println("Welcome to the Dog Kennel.");
      
      // Create new Dogjects
      Dog dog1 = new Dog();
      Dog dog2 = new Dog();
      Dog dog3 = new Dog();
      
      // Dog 1
      dog1.setHeight(13.5);
      dog1.setAge(8);
      dog1.setName("Igor");
      dog1.setLikesBarking(true);
      
      // Dog 2
      dog2.setHeight(8.2);
      dog2.setAge(5);
      dog2.setName("Lev");
      dog2.setLikesBarking(false);
      
      // Dog 3
      dog3.setHeight(15.1);
      dog3.setAge(6);
      dog3.setName("Tatsie");
      dog3.setLikesBarking(true);
      
      
      // Sum and print the dog's ages
      int sumOfAges = dog1.getAge() + dog2.getAge() + dog3.getAge();
      
      System.out.println("The sum of the dog's ages is: " + sumOfAges);
      
      // Sum and print of the dog's heights
      double sumOfHeights = dog1.getHeight() + dog2.getHeight() + dog3.getHeight();
      
      System.out.println("The sum of the dog's heights is: " + sumOfHeights);
      
      // Retrieve and print all dog's names
      String allDogNames = dog1.getName() + ", " + dog2.getName() + ", " + dog3.getName();
      
      System.out.println("The dogs are named " + allDogNames);
      
      // Determine how many dogs like barking
      // Store how many dogs like barking
      int barkCount = 0;
      
      if (dog1.getLikesBarking()) {
         barkCount ++;
      }
      
      if (dog2.getLikesBarking()) {
         barkCount ++;
      }
      
      if (dog3.getLikesBarking()) {
         barkCount ++;
      }
      
      
      if (barkCount == 1) { // For if one dog likes barking
         System.out.println(barkCount + " dog likes barking.");
      }else { // For any other amount of dogs like barking
         System.out.println(barkCount + " dogs like barking.");
      }
      
      
      
   }     
}