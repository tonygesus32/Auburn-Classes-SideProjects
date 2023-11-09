import java.util.Scanner;
import java.text.DecimalFormat;
/**
* This program solves for the result of the expression in the formula
* below for a value x of type double.
* Project 3A MathFormula.java 
* @author Anthony Tolbert 
* @version 1/30/2023
**/

public class MathFormula
{
   /**
   * Entering the the value for x to get the results.
   * @param args Command line arguments - not used.
   **/
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      double x; 
      double result;
      double result2;
      double answer;
      String fmtAnswer;
      
      
      
      System.out.print("Enter a value for x: ");
      x = scan.nextDouble();
      
      result = Math.pow(x, 9) + 10;
      result2 = Math.abs(5 * Math.pow(x, 3) - 3 * Math.pow(x, 2)); 
      result2 +=  Math.sqrt(4 * Math.pow(x, 6) - 2 * Math.pow(x, 2) + 1);
      
   
      answer = result / result2;
      fmtAnswer = Double.toString(answer);
      int position = fmtAnswer.indexOf(".");
      int right = fmtAnswer.length() - position - 1;
      
      
      
      System.out.println("Result: " + answer); 
      System.out.println("# digits to left of decimal point: " 
                  + position);
      System.out.println("# digits to right of decimal point: "
                  + right);
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      System.out.print("Formatted Result: " + fmt.format(answer));
               
   }

}