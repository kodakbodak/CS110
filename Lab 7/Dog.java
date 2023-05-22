// Author: Isaac Smith
// Date: 05/11/2023
// File: Lab 7 Dog Class

public class Dog {

   double heightIn;
   int ageYears;
   String name;
   boolean likesBarking;
   
   public void setHeight(double height) {
   
      heightIn = height;
   
   }

   public void setAge(int age) {
   
      ageYears = age;
   
   }

   public void setName(String dogName) {
   
      name  = dogName;
   
   }

   public void setLikesBarking(boolean barking) {
   
      likesBarking = barking;
   
   }

   public int getAge() {
   
      return ageYears;
   
   }

   public double getHeight() {
   
      return heightIn;
   
   }

   public String getName() {
   
      return name;
   
   }
   
   public boolean getLikesBarking() {
   
      return likesBarking;
   
   }
   
   
}