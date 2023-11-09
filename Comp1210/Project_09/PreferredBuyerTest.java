import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Test file for PreferredBuyerTest.
* Project09 | PreferredBuyerTest.java 
* @author Anthony Tolbert 
* @version 04/10/2023
**/


public class PreferredBuyerTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void accountNumberTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.setAcctNumber("12345");
      Assert.assertEquals("Get Acct #", "12345", pb.getAcctNumber());
   }
   /** Name method Test. **/
   @Test public void nameTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.setName("Tolbert, Anthony");
      Assert.assertEquals("Get Name", "Tolbert, Anthony", pb.getName());
   }
   /** purchases methods. */
   @Test public void purchasesTest() {
      double[] testPurchases = {12.0, 25.0};
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
         //set purchases
      pb.setPurchases(testPurchases);
      Assert.assertEquals("Set Purchases", pb.purchases, pb.getPurchases());
      Assert.assertEquals("Set Purchases", 37.0, pb.calcSubtotal(), 0.001);
         //add purchases
      pb.addPurchases(30.0, 35.0);
      Assert.assertEquals("add purchases", pb.purchases, pb.getPurchases());
      Assert.assertEquals("Total purchases", 102.0, pb.calcSubtotal(), 0.001);
         //delete one purchase
      pb.deletePurchase(30.0);
      Assert.assertEquals("delete purchase", pb.purchases, pb.getPurchases());
      Assert.assertEquals("Total purchases", 72.0, pb.calcSubtotal(), 0.001);
         //delete multiple purchases
      pb.deletePurchases(12.0, 35.0);
      Assert.assertEquals("delete purchases", pb.purchases, pb.getPurchases());
      Assert.assertEquals("total purchases", 25.0, pb.calcSubtotal(), 0.0001);
   }
   /** test for calcSubtotal. */
   @Test public void calcSubtotalTest() {
      double[] testPurchases = {17.0, 20.0};
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.setPurchases(testPurchases);
      Assert.assertEquals("Subtotal", 37.0, pb.calcSubtotal(), 0.001);
   
   }
   /** test for calTotal. */
   @Test public void calcTotalTest() {
      double[] testPurchases = {34.5, 100.0, 63.50, 350.0};
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.setPurchases(testPurchases);
      Assert.assertEquals("Total", 591.84, pb.calcTotal(), 0.001); 
   }
   
   /** test for calcAwardPoints. */
   @Test public void calcAwardPointsTest() {
      double[] testPurchases = {50.0, 50.0};
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.setPurchases(testPurchases);
      Assert.assertEquals("CalcAwardPoints", 100.0,
         pb.calcAwardPoints(), 0.001);
      pb.addPurchases(25.0, 25.0);
      Assert.assertEquals("CalcAwardPoints", 150.0,
         pb.calcAwardPoints(), 0.001);
   }
   
   /** test for toString. */
   @Test public void toStringTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.addPurchases(34.5, 100.0, 63.50, 350.0);
      String a = "Preferred Buyer"
            + "\nAcctNo/Name: 10001 Smith, Sam"
            + "\nSubtotal: $548.00"
            + "\nTax: $43.84"
            + "\nTotal: $591.84"
            + "\nAward Points: 548";
   
      Assert.assertEquals("String test", a, pb.toString());
            
   }
}
