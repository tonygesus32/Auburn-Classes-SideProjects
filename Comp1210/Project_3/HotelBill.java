import java.util.Scanner;
import java.util.Random; 
import java.text.DecimalFormat;
/**
* The purpose of this program is to accept a hotel bill 
* code as input that includes the room number, price per
* night, check-in date, and number of nights,followed by 
* the guest’s name. 
* Project3b HotelBill.java
* @author Anthony Tolbert 
* @version 01/31/2023
**/

public class HotelBill 
{
   /**
   * Enter in the bill code and it proccess the information
   * properly.
   * @param args Command line arguments - not used.
   **/

   public static void main(String[] args) 
   {
      Scanner scan = new Scanner(System.in); 
      String code;
      int below = 22; 
      
      
      System.out.print("Enter hotel bill code: ");
      code = scan.nextLine();
      System.out.println(); 
      
      code = code.trim();
      int length = code.length();
      
      if (length < below)
      {
         //Print Invalid Error Message
         
         System.out.println("Invalid Hotel Bill Code.");
         System.out.println("Hotel Bill Code must have " 
                       + "at least 22 characters.");
                       
      }
      else 
      {
         //Prints name.
         String name = code.substring(21, code.length());
         System.out.println("Name: " + name);
         
         //Prints room number.
         String room = code.substring(0, 3);
         System.out.println("Room: " + room);
         
         //Prints Check-In Date.
         String checkIn = code.substring(9, 19);
         System.out.println("Check-in Date: " + checkIn);
         
         //Prints number of nights.
         String nights = code.substring(19, 21);
         int night = Integer.parseInt(nights);
         System.out.println("Nights: " + night);
         
         DecimalFormat fmt = new DecimalFormat("$#,##0.00");
         String costPN = code.substring(3, 9);
         double cost = Double.parseDouble(costPN);
         double tax = cost * .15;
         double totalCost = cost * (1 + .15);  
         System.out.print("Cost Per Night: " + fmt.format(totalCost));
         System.out.println("   (Room: " + fmt.format(cost) 
                     + "   Tax: " + fmt.format(tax) + ")");
         
         double total = totalCost * night;
         System.out.println("Total: " + fmt.format(total)); 
         
         //Prints random number.
         Random generator = new Random();
         DecimalFormat fmt2 = new DecimalFormat("000000");
         int lucky = generator.nextInt(1000000);
         System.out.println("Lucky Number: " + fmt2.format(lucky));
      
      }
   }

}