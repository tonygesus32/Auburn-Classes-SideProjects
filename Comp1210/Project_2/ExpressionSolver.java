import java.util.Scanner;

/**
* Create a program that input values of type double for x,
* y,and z and solves for the result of the indicated formula.
*
* Project 2 ExpressionSolver.java 
* @author Anthony Tolbert 
* @version 01/24/2023
*/

public class ExpressionSolver
{
   /**
   * Creates the input value of type double for x,
   * y, and z solves for the result of the
   * formula.
   *
   * @param args Command line arguments - not used.
   */
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      double x = 0;
      double y = 0;
      double z = 0;
      double result = 0;
      double add = 0;
     //User enters the x,y, and z values.
      System.out.println("result = (7.1x + 3.6)"
             + " (5.0y + 4.9) (2.5z - 5.2) / xyz");
      System.out.print("\tEnter x: ");
      x = scan.nextDouble();
      System.out.print("\tEnter y: ");
      y = scan.nextDouble();
      System.out.print("\tEnter z: ");
      z = scan.nextDouble();
      
      
      result = 7.1 * x + 3.6;
      result *= 5.0 * y + 4.9;
      result *= 2.5 * z - 5.2;
      result /=  (x * y * z);
      //creates an if statement for the equation.
      if (x * y * z == 0.0)
      {
         System.out.println("result is undefined");
      }
      else
      {
         System.out.println("result = " + result);
      }
   }
}