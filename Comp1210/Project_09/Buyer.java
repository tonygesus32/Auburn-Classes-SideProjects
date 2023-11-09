import java.util.Arrays;
import java.text.DecimalFormat;
/**
* Buyer class is an abstract class from which all to Buyer classes
* are derived.
* Project_09 | Buyer.java
* @author Anthony Tolbert 
* @version 04/06/23
*/

public abstract class Buyer
{
   protected String category;
   protected String acctNumber;
   protected String name;
   protected double [] purchases;
   /** Sales_Tax_Rate. */
   public static final double SALES_TAX_RATE = 0.08;
   /**
   * Constructor for Buyer.
   * @param acctNumberIn for acctNumber
   * @param nameIn for name
   */
   public Buyer(String acctNumberIn, String nameIn)
   {
      acctNumber = acctNumberIn;
      name = nameIn;
      purchases = new double[0];
   
   }
   /**
   * Constructor for getAcctNumber.
   * @return acctNumber
   **/
   public String getAcctNumber()
   {
      
      return acctNumber;
   }
   /**
   * Constructor for setAcctNumber.
   * @param acctNumberIn for acctNumber
   */
   public void setAcctNumber(String acctNumberIn)
   {
      acctNumber = acctNumberIn;
   
   }
   /**
   * Constructor for getName.
   * @return name
   **/
   protected String getName()
   {
      return name;
   
   }
   /**
   * Constructor for setName.
   * @param nameIn for name
   */
   protected void setName(String nameIn)
   {
      name = nameIn;
   }
   /**
   * Constructor for getPurchases.
   * @return purchases
   */
   protected double[] getPurchases()
   {
      return purchases;
   
   }
   /**
   * Constructor for setPurchases.
   * @param purchasesIn for purchases
   */
   protected void setPurchases(double[] purchasesIn) 
   {
      purchases = purchasesIn;
   }
             
   protected void addPurchases(double...purchasesIn)
   {
      int originalLength;
      if (purchases == null) 
      {
         originalLength = 0;
         purchases = purchasesIn;
      }
      
      else
      {
         originalLength = purchases.length; 
         purchases = Arrays.copyOf(purchases, 
            originalLength + purchasesIn.length);
               
         for (int i = 0; i < purchasesIn.length; i++) 
         {
            purchases[i + originalLength] = purchasesIn[i];
         }
      }      
   }
   protected void deletePurchase(double deletedPurchase) 
   {
      int l = purchases.length;
      for (int i = 0; i < l; i++) 
      {
         if (deletedPurchase == purchases[i]) 
         {
            while (i < l - 1) 
            {
               purchases[i] = purchases[i + 1];
               i++;
            }
            purchases[l - 1] = 0.0;
            purchases = Arrays.copyOf(purchases, l - 1);
         }
      }
      
   }
   protected void deletePurchases(double... deletedPurchases) 
   {
      int l = purchases.length;
      int e = deletedPurchases.length;
         
      for (int i = 0; i < l; i++) 
      {
         for (int j = 0; j < e; j++) 
         {
            deletePurchase(deletedPurchases[j]);
         } 
      }
   }
   protected double calcSubtotal()
   {
      double purch = purchases.length;
      double total = 0;
      for (int i = 0; i < purch; i++)
      {
         total += purchases[i];
      
      }
      return total;
   }
   protected double calcTotal()
   {
      double tax = calcSubtotal() * SALES_TAX_RATE;
      double total = calcSubtotal() + tax;
   
      return total;
   }
   /**
   * Constructor for toString.
   * @return output
   **/
   public String toString()
   {
      DecimalFormat fmt = new DecimalFormat("$#,##0.00");
      String output = category;
      output += "\nAcctNo/Name: " + acctNumber + " " + name;
      output += "\nSubtotal: " + fmt.format(calcSubtotal());
      output += "\nTax: " + fmt.format(calcSubtotal() * SALES_TAX_RATE);
      output += "\nTotal: " + fmt.format(calcTotal()); 
      output += "\nAward Points: " + calcAwardPoints();
      
      return output;   
   } 
   
   protected abstract int calcAwardPoints();
   
}