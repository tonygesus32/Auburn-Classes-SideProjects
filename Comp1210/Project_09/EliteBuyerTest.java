import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Test file for EliteBuyerTest.
* Project09 | EliteBuyerTest.java 
* @author Anthony Tolbert 
* @version 04/10/2023
**/

public class EliteBuyerTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test for acctNumber. **/
   @Test public void acctNumberTest() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      eb.setAcctNumber("12345");
      Assert.assertEquals("Get Acct #", "12345",
         eb.getAcctNumber());         
   }
   
   /** A test for discountRate. **/
   @Test public void getDiscountRateTest() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      Assert.assertEquals("discount test", 0.05, eb.getDiscountRate(), 0.0001); 
   }
   
   /** A test for setDiscountRate. **/ 
   @Test public void setDiscountRateTest() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      eb.setDiscountRate(0.10);
      Assert.assertEquals("discount test", 0.10, eb.getDiscountRate(), 0.0001); 
   } 
   /** A test for calcAwardPoints. **/
   @Test public void calcAwardPointsTest() { 
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      eb.addPurchases(34.5, 100.0, 63.50, 300.0);
      Assert.assertEquals("Award Points", 4730, eb.calcAwardPoints(), 0.001);  
   
   } 
   /** A test for calcSubtotal. **/
   @Test public void calcSubtotalTest() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");   
      eb.addPurchases(34.5, 100.0, 63.50, 300.0);
      Assert.assertEquals("CalcSubtotal", 473.10, eb.calcSubtotal(), 0.001);
   }
   /** A test for toString. **/
   @Test public void toStringTest() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");   
      eb.addPurchases(34.5, 100.0, 63.50, 300.0);
      String a =  "Elite Buyer"
           + "\nAcctNo/Name: 10002 Jones, Pat"
           + "\nSubtotal: $473.10"
           + "\nTax: $37.85"
           + "\nTotal: $510.95"
           + "\nAward Points: 4730"
           + "\n(includes 0.05 discount rate applied to Subtotal)";
      Assert.assertEquals("String Test", a, eb.toString()); 
   } 
    
}
