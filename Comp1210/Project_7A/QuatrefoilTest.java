import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
* Class that test Quatrefoil.
* Project_7 Quatrefoil.java
* @version 03/18/2023
* @author AnthonyTolbert
*/

public class QuatrefoilTest {
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that test getDiameterTest(). */
   @Test public void getDiameterTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5); 
      Assert.assertEquals(3.5, ex1.getDiameter(), 0.001);
            
   }
   /** A test that test setDiameterTest(). */
   @Test public void setDiameterTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5); 
      Assert.assertTrue(ex1.setDiameter(3.5));
      Assert.assertFalse(ex1.setDiameter(-0.6));
   }
   /** A test that test getLabelTest(). */
   @Test public void getLabelTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals("Small Example", ex1.getLabel()); 
   }
   /** A test that test setLabelTest(). */
   @Test public void setLabelTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertTrue(" ", ex1.getLabel().contains("Small Example"));
      Assert.assertFalse(ex1.setLabel(null));
      
   }
   /** A test that test perimeterTest(). */
   @Test public void perimeterTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(10.996, ex1.perimeter(), 0.001);
      
      
   }
   /** A test that test perimeterinFtTest(). */
   @Test public void perimeterInFtTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(0.916, ex1.perimeterInFt(), 0.001);
      
   }
   /** A test that test areaTest(). */
   @Test public void areaTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(7.873, ex1.area(), 0.001);
   }
   /** A test that test areaInSqFtTest(). */
   @Test public void areaInSqFtTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(0.055, ex1.areaInSqFt(), 0.001);
      
   }
   /** A test that test toStringTest(). */
   @Test public void toStringTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertTrue(" ", ex1.toString().contains("Small Example"));
      
   }
   /** A test that test getCountTest(). */
   @Test public void getCountTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      ex1.resetCount();
      Assert.assertEquals(0, ex1.getCount());
   }
   /** A test that test resetCodeTest(). */
   @Test public void resetCodeTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      ex1.resetCount(); 
      Assert.assertEquals(0, ex1.getCount());
         
   }
   /** A test that test equalsTest(). */
   @Test public void equalsTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      String example2 = "hello world"; 
      Quatrefoil example3 = new Quatrefoil("Small Example", 5.8);
      Quatrefoil ex5 = new Quatrefoil("Small Example", 3.5);
      
      Assert.assertFalse(" ", ex1.equals(example2));
      Assert.assertFalse(" ", ex1.equals(example3));
      Assert.assertTrue(" ", ex1.equals(ex5));
   }
   
   /** A test that test hashCodeTest(). */
   @Test public void hashCodeTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(" ", 0, ex1.hashCode());
   
   }
  
}
