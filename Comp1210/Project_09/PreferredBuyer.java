/**
* This classis derived from the buyer class. 
* Project_09 | Preferred Buyer 
* @author Anthony Tolbert 
* @version 04/06/2023
**/

public class PreferredBuyer extends Buyer
{
   /**
   * Constructor called PreferredBuyer.
   * @param acctNumberIn for acctNumber
   * @param nameIn for name
   */
   public PreferredBuyer(String acctNumberIn, String nameIn)
   {
      super(acctNumberIn, nameIn);
      category = "Preferred Buyer";
   
   }
   /**
   * Constructor for calcAwardPoints.
   *
   * @return points 
   */
   protected int calcAwardPoints()
   {
      int points = (int) Math.floor(calcSubtotal());
      return points;
   }
 

}