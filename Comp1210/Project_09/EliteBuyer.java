import java.text.DecimalFormat;
/**
* Elite Buyer class is derived from the Buyer class.
* Project_09 | EliteBuyer.java
* @author Anthony Tolbert 
* @version 04/06/2023
**/
public class EliteBuyer extends Buyer
{
   protected double discountRate = 0.05;
   /**
   * Constructor for EliteBuyer.
   * @param acctNumberIn for acctNumber
   * @param nameIn for name
   */
   public EliteBuyer(String acctNumberIn, String nameIn)
   {
      super(acctNumberIn, nameIn);
      category = "Elite Buyer"; 
   
   }
    /**
    * Constructor for getDiscountRate.
    * @return discountRate
    */
   protected double getDiscountRate()
   {
      
      return discountRate;
   }
   /**
   * Constructor for setDiscountRate.
   * @param discountRateIn for discountRate
   */
   protected void setDiscountRate(double discountRateIn)
   {
      discountRate = discountRateIn;
   
   }
   /**
   * Constructor for calcAwardPoints.
   * @return points 
   */
   protected int calcAwardPoints()
   {
      int points = (int) Math.floor(calcSubtotal());
      points *= 10;
      
      return points;
   } 
   /**
   * Constructor for calcSubtotal.
   * @return total
   */
   protected double calcSubtotal()
   {
      double total = 0;
      total = super.calcSubtotal() * (1.0 - discountRate);
      return total;
   }
   /**
   * Constructor for toString.
   * @return super.toString 
   */ 
   public String toString()
   { 
      DecimalFormat df = new DecimalFormat("0.0%");
      DecimalFormat df1 = new DecimalFormat("$#,##0.00");
      DecimalFormat df2 = new DecimalFormat("#,##0");
      return super.toString()
               + "\n(includes " + discountRate + " discount rate "
               + "applied to Subtotal)";
   }    

}