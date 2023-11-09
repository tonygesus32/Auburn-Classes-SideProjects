import java.util.ArrayList;
import java.util.Scanner;
/**
* Temperature After all of the temperatures have been read in and added to tempsList, 
*  create a Temperatures object with the tempsLis
*  Activity 6B TemperatureInfo.java 
* @author Anthony Tolbert 
* @version 02/21/2023
**/

public class TemperatureInfo
{
   public static void main(String[] args)
   {
      String tempInput = ""; 
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      Scanner scan = new Scanner(System.in);
      
      do
      {
         System.out.print("Enter a temperature (or nothing to end list): "); 
         tempInput = scan.nextLine();
         if (!tempInput.equals("")); 
         { 
            tempsList.add(Integer.parseInt(tempInput)); 
         }
      }
      
       
      while (!tempInput.equals("")); 
      Temperatures temps = new Temperatures(tempsList);
      char choice = 'E';
      do
      {
         System.out.println("Enter choice - [L]ow temp, [H]igh temp, "
            + "[P]rint, [E]nd: ");
         choice = scan.nextLine().toUpperCase().charAt(0);
         switch (choice)
         {
            case 'L': 
               System.out.println("\tLow is " + temps.getLowTemp());
               break; 
               
            case 'H': 
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
             
            case 'P': 
               System.out.println(temps);
               break;
               
            case 'E':
               System.out.println("\tDone");
               break;
           
            default: 
               System.out.println("\tInvalid choice!");  
         }
         
      } while (choice != 'E');
      scan.close();
     
     
    
            
     
      
   
   }  

}