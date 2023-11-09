import java.text.DecimalFormat;
/**
* Premier Elite Buyer derives from the EliteBuyer class.
* Project_09 | PremierEliteBuyer.java 
* @author Anthony Tolbert 
* @version 04/06/2023
**/

public class PremierEliteBuyer extends EliteBuyer
{
   private int bonusAwardPoints = 1000; 
   /**
   * Constructor for PremierEliteBuyer.
   * @param acctNumberIn for acctNumber
   * @param nameIn for name 
   */
   public PremierEliteBuyer(String acctNumberIn, String nameIn)
   {
      super(acctNumberIn, nameIn);
      category = "Premier Elite Buyer";
      discountRate = 0.15; 
   
   }
   /**
   * Constructor for getBonusAwardPoints.
   * @return bonusAwardPoints 
   */
   public int getBonusAwardPoints()
   {
      return bonusAwardPoints; 
   }
   /**
   * Constructor for setBonusAwardPoints.
   * @param bonusAwardPointsIn for bonusAwardPoints
   */
   public void setBonusAwardPoints(int bonusAwardPointsIn)
   {
      bonusAwardPoints = bonusAwardPointsIn;
   
   }
   /**
   * Constructor for calcAwardPoints.
   * @return points 
   */
   protected int calcAwardPoints()
   {
      int points = (int) Math.floor(calcSubtotal());
      points *= 20; 
      
      if (calcSubtotal() > 500) 
      {
         points += bonusAwardPoints;
         return points;
      } 
      else
      {
         return points; 
      }
     
   }
   /**
   * Constructor for toString.
   * @return toString 
   */
   public String toString() 
   {
      DecimalFormat fmt = new DecimalFormat("0.0%");
      DecimalFormat fmt1 = new DecimalFormat("$#,##0.00");
      DecimalFormat fmt2 = new DecimalFormat("#,##0");
         
      String bonus = "\n(includes " + bonusAwardPoints
               + " bonus points added to Award Points)";
      if (calcSubtotal() > 500) 
      {
         return super.toString() + bonus;
      } 
      else
      {
         return super.toString();
      }
   }
   
}