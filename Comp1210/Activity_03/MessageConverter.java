import java.util.Scanner;
/**
* This program will exchange letters in a String to encode a message.
*
* Activity_3 MessageConverter.java 
* @author Anthony Tolbert 
* @version 01/30/2023
**/ 

public class MessageConverter
{
   /**
   * The message changes whichever option you choose.
   * @param args Command line arguments - not used.
   */

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      String message = "";
      int outputType; 
      String result = "";
      
      System.out.println("Type in a message and press enter:\n\t> ");
      message = scan.nextLine();
      
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
         
      outputType = Integer.parseInt(scan.nextLine());
      
      if (outputType == 0)
      {
         //as is 
         result = message; 
         System.out.println("\n" + result);
      }
      else if (outputType == 1) 
      {
         //trimmed
         result = message.trim();
         System.out.println("\n" + result);
      }
      else if (outputType == 2)
      {
         //lower case
         result = message.toLowerCase();
         System.out.println("\n" + result); 
      }
      else if (outputType == 3)
      {
         //UPPER CASE
         result = message.toUpperCase();
         System.out.println("\n" + result); 
      }
      else if (outputType == 4)
      {
         //replace vowels
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_'); 
         System.out.println("\n" + result);
      }
      else if (outputType == 5) 
      {
         //without first and last character
         result = message.substring(1, message.length() - 1);
         System.out.println("\n" + result);
      }
      else 
      {
         //invalid input.
         result = "Error: Invalid choice input.";
         System.out.println("\n" + result);
      }
   
   }

}