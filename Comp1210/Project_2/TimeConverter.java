import java.util.Scanner;
/**
* A program that accepts a raw time measurements in seconds
* and then displays the time time in combinations.
*
* Project 2b TimeConverter.java 
* @author Anthony Tolbert 
* @version 01/24/2023
*/

public class TimeConverter
{
   /**
   * program that accepts a raw time.
   *
   * @param args Command line arguments - not used.
   */
  
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int seconds = 0;
      int day = 0;
      int hour = 0;
      int minute = 0;
      int second = 0; 
      
      System.out.print("Enter the raw time measurement "
            + "in seconds: ");
      seconds = scan.nextInt();
      
      day = seconds / 86400;
      hour = (seconds % 86400) /  3600;
      minute = (seconds % 86400) % 3600 / 60;
      second = (seconds % 86400) % 3600 % 60;
      
      if (seconds < 0)
      {
         System.out.println("Measurement must be non-negative!");
      
      }
      else 
      {
         System.out.println();
         System.out.println("Measurement by combined days, hours, "
                + "minutes, seconds:");
         System.out.println("\tdays: " + day);
         System.out.println("\thours: " + hour);
         System.out.println("\tminutes: " + minute);
         System.out.println("\tseconds: " + second);
         System.out.println();
         System.out.println(seconds + " seconds = " + day + " days, "
               + hour + " hours, " + minute + " minutes, " + second 
               + " seconds");
      }
   }


}