import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Test file for PremierEliteBuyerTest.
* Project09 | PremierEliteBuyerTest.java 
* @author Anthony Tolbert 
* @version 04/10/2023
**/

public class PremierEliteBuyerTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test for getBonusAwards. **/
   @Test public void getBonusAwardsTest() {
      PremierEliteBuyer peb2 = 
         new PremierEliteBuyer("10004", "Jenkins, Jordan");
      Assert.assertEquals(1000, peb2.getBonusAwardPoints(), .001); 
   }
   /** A test for setBonusAwards. **/
   @Test public void setBonusAwardPointsTest() {
      PremierEliteBuyer peb2 =
         new PremierEliteBuyer("10004", "Jenkins, Jordan");
      peb2.setBonusAwardPoints(400); 
      Assert.assertEquals(400, peb2.getBonusAwardPoints(), .001); 
   } 
   /** A test for calcAwardPoints. **/
   @Test public void calcAwardPointsTest() {
      PremierEliteBuyer peb1 = new PremierEliteBuyer("10003", "King, Kelly");
      peb1.addPurchases(34.5, 100.0, 63.50, 300.0);
      Assert.assertEquals(8460, peb1.calcAwardPoints(), .001);
      //peb2 
      PremierEliteBuyer peb2 =
          new PremierEliteBuyer("10004", "Jenkins, Jordan");
      peb2.addPurchases(34.5, 100.0, 63.50, 300.0, 100.0);
      Assert.assertEquals(11160, peb2.calcAwardPoints(), .001);
   }
   /** A test for toString. **/
   @Test public void toStringTest() {
      PremierEliteBuyer peb1 = new PremierEliteBuyer("10003", "King, Kelly");
      peb1.addPurchases(34.5, 100.0, 63.50, 300.0);
      String a = "Premier Elite Buyer"
             + "\nAcctNo/Name: 10003 King, Kelly"
             + "\nSubtotal: $423.30"
             + "\nTax: $33.86"
             + "\nTotal: $457.16"
             + "\nAward Points: 8460"
             + "\n(includes 0.15 discount rate applied to Subtotal)";
             
      Assert.assertEquals("String test", a, peb1.toString());
   }
   /** A test for toString2. **/
   @Test public void toStringTest2() {
      PremierEliteBuyer peb2 = 
         new PremierEliteBuyer("10004", "Jenkins, Jordan");
      peb2.addPurchases(34.5, 100.0, 63.50, 300.0, 100.0);
      String a = "Premier Elite Buyer"
                 +  "\nAcctNo/Name: 10004 Jenkins, Jordan"
                 +  "\nSubtotal: $508.30"
                 +  "\nTax: $40.66"
                 +  "\nTotal: $548.96"
                 +  "\nAward Points: 11160"
                 +  "\n(includes 0.15 discount rate applied to Subtotal)"
                 +  "\n(includes 1000 bonus points added to Award Points)";
   
             
      Assert.assertEquals("String test", a, peb2.toString());
   }    
}
