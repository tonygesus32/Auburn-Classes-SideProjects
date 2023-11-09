/**
* Division class.
* Activity_11 | Division.java
* @author Anthony Tolbert 
* @version 04/18/2023
*/

public class Division
{
   /**
   * intDivide class.
   * @return value
   * @param numIn in numerator
   * @param denomIn in denominator
   */
   public static int intDivide(int numIn, int denomIn) {
      try
      {
         int value = numIn / denomIn;
         return value;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }

   /**
   * decimalDivide class.
   * @return value
   * @param numIn in numerator
   * @param denomIn in denominator
   * @throws IllegalArgumentException ()
   */
   public static double decimalDivide(int numIn, int denomIn) 
   {
      if (denomIn == 0)
      {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      double value = (double) numIn / denomIn;
      return value;
   }

}