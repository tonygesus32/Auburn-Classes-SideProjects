import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
* Class that test QuatrefoilTest.
* Project_8 QuatrefoilTest.java
* @version 03/31/2023
* @author AnthonyTolbert
*/


public class QuatrefoilListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void getNameTest() {
      Quatrefoil[ ] temp2 = new Quatrefoil[3];
      temp2[0] = new Quatrefoil("Small Example", 3.5);
      temp2[1] = new Quatrefoil(" Medium Example ", 38.44);
      temp2[2] = new Quatrefoil("Large Example", 111.4);
      QuatrefoilList qList = new QuatrefoilList("Test List", temp2, 2);
      Assert.assertEquals("Error: ", "Test List", qList.getName());
   }
   /** A test for numberOfQuatrefoils method. **/
   @Test public void numberOfQuatrefoilsTest() {
      Quatrefoil[ ] temp2 = new Quatrefoil[3];
      temp2[0] = new Quatrefoil("Small Example", 3.5);
      temp2[1] = new Quatrefoil(" Medium Example ", 38.44);
      temp2[2] = new Quatrefoil("Large Example", 111.4);
      QuatrefoilList qList = new QuatrefoilList("Test List", temp2, 2);
      Assert.assertEquals("Error: ", 2, qList.numberOfQuatrefoils());  
   } 
   /** A test for totalDiameters method. **/ 
   @Test public void totalDiametersTest() {
      Quatrefoil[ ] temp2 = new Quatrefoil[3];
      temp2[0] = new Quatrefoil("Small Example", 3.5);
      temp2[1] = new Quatrefoil(" Medium Example ", 38.44);
      temp2[2] = new Quatrefoil("Large Example", 111.4);
      QuatrefoilList qList = new QuatrefoilList("Test List", temp2, 3);
      Assert.assertEquals("Error: ", 153.34, qList.totalDiameters(),
         .001);
         
   }
   /** A test for totalPerimeters method. **/
   @Test public void totalPerimetersTest() {
      Quatrefoil[ ] temp2 = new Quatrefoil[3];
      temp2[0] = new Quatrefoil("Small Example", 3.5);
      temp2[1] = new Quatrefoil(" Medium Example ", 38.44);
      temp2[2] = new Quatrefoil("Large Example", 111.4);
      QuatrefoilList qList = new QuatrefoilList("Test List", temp2, 3);
      Assert.assertEquals("Error: ", 481.732, qList.totalPerimeters(),
         .001);
   }
   /** A test for totalAreas method.  **/
   @Test public void totalAreasTest() {
      Quatrefoil[ ] temp2 = new Quatrefoil[3];
      temp2[0] = new Quatrefoil("Small Example", 3.5);
      temp2[1] = new Quatrefoil(" Medium Example ", 38.44);
      temp2[2] = new Quatrefoil("Large Example", 111.4);
      QuatrefoilList qList = new QuatrefoilList("Test List", temp2, 3);
      Assert.assertEquals("Error: ", 8933.417, qList.totalAreas(),
         .001);
   
   }
   /** A test for averageDiameter method. **/ 
   @Test public void averageDiameter() {
      Quatrefoil[ ] temp2 = new Quatrefoil[3];
      temp2[0] = new Quatrefoil("Small Example", 3.5);
      temp2[1] = new Quatrefoil(" Medium Example ", 38.44);
      temp2[2] = new Quatrefoil("Large Example", 111.4);
      QuatrefoilList qList = new QuatrefoilList("Test List", temp2, 3);
      Assert.assertEquals("Error: ", 51.113, qList.averageDiameter(),
         .001);
   
   }
   /** A test for averagePerimeter method. **/
   @Test public void averagePerimeter() {
      Quatrefoil[ ] temp2 = new Quatrefoil[3];
      temp2[0] = new Quatrefoil("Small Example", 3.5);
      temp2[1] = new Quatrefoil(" Medium Example ", 38.44);
      temp2[2] = new Quatrefoil("Large Example", 111.4);
      QuatrefoilList qList = new QuatrefoilList("Test List", temp2, 3);
      Assert.assertEquals("Error: ", 160.577, qList.averagePerimeter(),
         .001);
   
   }
   /** A test for averageArea method. **/
   @Test public void averageArea() {
      Quatrefoil[ ] temp2 = new Quatrefoil[3];
      temp2[0] = new Quatrefoil("Small Example", 3.5);
      temp2[1] = new Quatrefoil(" Medium Example ", 38.44);
      temp2[2] = new Quatrefoil("Large Example", 111.4);
      QuatrefoilList qList = new QuatrefoilList("Test List", temp2, 3);
      Assert.assertEquals("Error: ", 2977.806, qList.averageArea(),
         .001);
   } 
   /** A test for getList method. **/
   @Test public void getListTest() {
      Quatrefoil[ ] temp2 = new Quatrefoil[3];
      temp2[0] = new Quatrefoil("Small Example", 3.5);
      temp2[1] = new Quatrefoil(" Medium Example ", 38.44);
      temp2[2] = new Quatrefoil("Large Example", 111.4);
      QuatrefoilList qList = new QuatrefoilList("Test List", temp2, 3);
      Assert.assertEquals("Error: ", temp2, qList.getList());
   }
   /** A test for addQuatrefoil. **/
   @Test public void addQuatrefoilTest() {
      Quatrefoil[ ] temp2 = new Quatrefoil[100];
      temp2[0] = new Quatrefoil("Small Example", 3.5);
      temp2[1] = new Quatrefoil(" Medium Example ", 38.44);
      temp2[2] = new Quatrefoil("Large Example", 111.4);
      QuatrefoilList qList = new QuatrefoilList("Test List", temp2, 3);
      Quatrefoil a = new Quatrefoil("Huge Example", 5.2);
      qList.addQuatrefoil("Huge Example", 5.2);
      Quatrefoil[] aI = qList.getList();
      Assert.assertEquals("Error: ", a, aI[3]);
   
   }
   /** A test for findQuatrefoil. **/
   @Test public void findQuatrefoil() {
      Quatrefoil[ ] temp2 = new Quatrefoil[100];
      temp2[0] = new Quatrefoil("Small Example", 3.5);
      temp2[1] = new Quatrefoil(" Medium Example ", 38.44);
      temp2[2] = new Quatrefoil("Large Example", 111.4);
      QuatrefoilList qList = new QuatrefoilList("Test List", temp2, 3);
      Quatrefoil result = qList.findQuatrefoil("Small Example");
      Assert.assertEquals("Error: ", temp2[0], result);
         
   }
   /** A test for deleteQuatrefoil. **/
   @Test public void deleteQuatrefoil() {
      Quatrefoil[ ] temp2 = new Quatrefoil[100];
      temp2[0] = new Quatrefoil("Small Example", 3.5);
      temp2[1] = new Quatrefoil(" Medium Example ", 38.44);
      temp2[2] = new Quatrefoil("Large Example", 111.4);
      QuatrefoilList qList = new QuatrefoilList("Test List", temp2, 3); 
      Assert.assertEquals("Error: ", temp2[0], 
         qList.deleteQuatrefoil("Small Example"));
          
   }
   /** A test for editQuatrefoil. **/
   @Test public void editQuatrefoil() {
      Quatrefoil[ ] temp2 = new Quatrefoil[100];
      temp2[0] = new Quatrefoil("Small Example", 3.5);
      temp2[1] = new Quatrefoil(" Medium Example ", 38.44);
      temp2[2] = new Quatrefoil("Large Example", 111.4);
      QuatrefoilList qList = new QuatrefoilList("Test List", temp2, 3);
      Assert.assertTrue("Error: ", qList.editQuatrefoil("Small Example", 3.5)); 
      
   } 
   /** A test for findQuatrefoilWithLargestDiameter. **/
   @Test public void findQuatrefoilWithLargestDiameter() {
      Quatrefoil[ ] temp2 = new Quatrefoil[100];
      temp2[0] = new Quatrefoil("Small Example", 3.5);
      temp2[1] = new Quatrefoil(" Medium Example ", 38.44);
      temp2[2] = new Quatrefoil("Large Example", 111.4);
      QuatrefoilList qList = new QuatrefoilList("Test List", temp2, 3);
      Quatrefoil result = qList.findQuatrefoilWithLargestDiameter();
      Assert.assertEquals("Error: ", temp2[2], result);
   } 
   /** A test toString. **/
   @Test public void toStringTest() {
      Quatrefoil[ ] temp2 = new Quatrefoil[100];
      temp2[0] = new Quatrefoil("Small Example", 3.5);
      temp2[1] = new Quatrefoil(" Medium Example ", 38.44);
      temp2[2] = new Quatrefoil("Large Example", 111.4);
      QuatrefoilList qList = new QuatrefoilList("Test List", temp2, 3);
      String a = "----- Summary for Test List -----" + "\n"
            + "Number of Quatrefoils: 3" + "\n" 
            + "Total Diameters: 153.34 inches" + "\n"
            + "Total Perimeters: 481.732 inches" + "\n"
            + "Total Areas: 8,933.417 square inches" + "\n"
            + "Average Diameter: 51.113 inches" + "\n"
            + "Average Perimeter: 160.577 inches" + "\n"
            + "Average Area: 2,977.806 square inches";
            
      Assert.assertEquals("Error: ", a, qList.toString());
   }
}
