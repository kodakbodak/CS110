public class EmbeddedIfs {
       public static void main (String[] args) {
      
           int numberOfDaysInNonLeapYear = 365;
           if (numberOfDaysInNonLeapYear/10 == 36) {
               int numMonthsInYear = 12;
               if (numMonthsInYear*2 == 36) {
                    System.out.println("That's some odd math.");
                  } 
            if (numMonthsInYear/4 == 3){
                  System.out.println("Each 4 months is a season");  
                   }
                   } else {
                    System.out.println("Three hundred sixty-five "
                                  + " divided by 10 is NOT 36.");
                   }
             }}