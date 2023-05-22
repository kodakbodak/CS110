public class SchoolAndCity {
     public static void main (String[] args) {
  
          String schoolName = "CentralW";
          String city = "Ellensburg";
          int lengthSName = schoolName.length();
          int lengthCName = city.length();
          String shortenedSN = schoolName.substring(1, lengthSName/2);
          System.out.println(shortenedSN
                   + city.substring(lengthCName-5, lengthCName -2));
   }}