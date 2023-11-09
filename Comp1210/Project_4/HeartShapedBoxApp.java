import java.util.Scanner;  
/**
* Create a HeartShapedBox class that stores the label, radius
* and height.
* Project4 HeartShapedBoxAPP.java
* @author Anthony Tolbert 
* @version 02/09/2023
**/

public class HeartShapedBoxApp
{
   /**
   * Inputs the label, radius, and height for a heart
   * shaped box.
   * @param args Command line arguments - not used.
   **/
   public static void main(String[] args)
   {
      String input;
      String radInput;
      String heightInput;
      Scanner scan = new Scanner(System.in); 
      
      System.out.println("Enter label, radius, and height for a " 
            + "heart shaped box.");
      System.out.print("\tlabel: ");
      input = scan.nextLine();
      
      System.out.print("\tradius: ");
      radInput = scan.nextLine();
      
      double rad = Double.parseDouble(radInput);
      if (rad <= 0) 
      {
         System.out.println("Error: radius must be greater than zero.");
      
      }
      else
      {
         System.out.print("\theight: ");
         heightInput = scan.nextLine();
         double hei = Double.parseDouble(heightInput);
         if (hei <= 0)
         {
            System.out.println("Error: height must be greater than zero.");
         }
         else
         {
            HeartShapedBox hsb = new HeartShapedBox(input, rad, hei);
            System.out.println("\n" + hsb);
         }
             
      
      }
   }

}
