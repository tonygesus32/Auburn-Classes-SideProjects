/**
* A program called scores. 
* Activity_8 Scores.java 
* @author Anthony Tolbert 
* @version 03/28/2023 
*
**/

public class Scores 
{
   private int [] numbers; 
   /**
   * Constructor of Scores.
   * @param numbersIn for numbers
   **/
   public Scores(int[] numbersIn)
   {
      numbers = numbersIn; 
    
   }
   /**
   * Constructor for findEvens.
   * @return evens
   *
   **/
   public int[] findEvens()
   {
      int numberEvens = 0;
   
      for (int i = 0; i < numbers.length; i++) 
      {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      int[] evens = new int[numberEvens];
        
      int count = 0;
         
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 == 0)
         {
            
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;  
   }
   /**
   * Constructor for findOdds.
   * @return for odds;
   **/
   public int[] findOdds()
   {
      int numberOdds = 0; 
      
      for (int i = 0; i < numbers.length; i++)
      {
         if (!(numbers[i] % 2 == 0)) {
            numberOdds++;
         }
      } 
      int[] odds = new int[numberOdds];
      
      int count = 0; 
      
      for (int i = 0; i < numbers.length; i++)
      {
         if (!(numbers[i] % 2 == 0))
         {
            odds[count] = numbers[i];
            count++; 
         }
      
      }
      return odds; 
   }
    /**
    * Constructor to calculateAverage.
    * @return sum 
    **/
   public double calculateAverage()
   {
      int sum = 0; 
      for (int i = 0; i < numbers.length; i++)
      {
         sum += numbers[i];
      
      } 
      return sum / numbers.length;
   }
    /**
    * Constructor for toString.
    * @return result 
    */
   public String toString()
   {
      String result = " ";
      for (int i = 0; i < numbers.length; i++)
      {
         result += numbers[i] + "\t"; 
      }
      return result; 
   }
   /**
   * Constructor for toStringInReverse.
   * @return result
   */
   public String toStringInReverse() 
   { 
      String result = " ";
      
      for (int i = numbers.length - 1; i >= 0; i--)
      {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
}