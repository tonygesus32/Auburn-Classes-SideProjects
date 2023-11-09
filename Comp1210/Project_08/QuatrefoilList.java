import java.text.DecimalFormat; 
/**
* This class is aclass representing a QuatreFoil list object.
* Project0_8 QuatrefoilList.java 
* @author Anthony Tolbert 
* @version 03/31/23
**/

public class QuatrefoilList
{

   private Quatrefoil[ ] array;
   private String name = " "; 
   private int number;
   
 /**
  * Constructor for QuatrefoilList.
  *
  * @param nameIn - used
  * @param arrayIn - used
  * @param numberIn - used
  */
   public QuatrefoilList(String nameIn, Quatrefoil[] arrayIn, int numberIn)  
   {
      name = nameIn;
      array = arrayIn;
      number = numberIn;
    
   } 
   /**
    * Returns name of a given list.
    *
    * @return String name of list
    */
   public String getName()
   {
      return name;
   
   }
   /**
    * Returns number of Quatrefoils in a given list.
    *
    * @return int number of Quatrefoils
    */
   public int numberOfQuatrefoils()
   {
      return number;
   }
   /**
    * Returns total Diameters of the list.
    *
    * @return double totalDiameters
    */
   public double totalDiameters()
   {
      double totalDiameters = 0.0;
      for (int i = 0; i < number; i++)
      {
         Quatrefoil temp = array[i];
         totalDiameters += temp.getDiameter();
      
      }
      return totalDiameters;
   }
   /**
    * Returns totalPerimeters of the list.
    *
    * @return double totalPerimeters
    */
   public double totalPerimeters()
   {
      double totalPerimeters = 0.0;
      for (int i = 0; i < number; i++)
      {
         Quatrefoil temp = array[i];
         totalPerimeters += temp.perimeter();
      
      }
      return totalPerimeters;
   }
   /**
    * Returns totalAreas of the list.
    *
    * @return double totalArea
    */
   public double totalAreas()
   {
      double totalAreas = 0.0;
      for (int i = 0; i < number; i++)
      {
         Quatrefoil temp = array[i];
         totalAreas += temp.area();
      
      }
      
      return totalAreas;
   }
   /**
    * Returns averageDiameter of the list.
    *
    * @return double averageDiameter
    */
   public double averageDiameter()
   {
      double averageDiameter = 0.0;
      if (number != 0)
      {
         averageDiameter = totalDiameters() / (double) number;
      
      }
      return averageDiameter;
   }
   /**
    * Returns averagePerimeter of the list.
    *
    * @return double averagePerimeter
    */
   public double averagePerimeter()
   {
      double averagePerimeter = 0.0;
      if (number != 0)
      {
         averagePerimeter = totalPerimeters() / (double) number;
      }
      return averagePerimeter;
   
   }
   /**
    * Returns averageArea of the list.
    *
    * @return double averageArea
    */
   public double averageArea()
   {
      double averageArea = 0.0;
      if (number != 0)
      {
         averageArea = totalAreas() / (double) number;
      }
      return averageArea;
   }
   /**
    * Returns String toString.
    *
    * @return String output
    */
   public String toString()
   {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + name + " -----";
      output += "\nNumber of Quatrefoils: " + number;
      output += "\nTotal Diameters: " + fmt.format(totalDiameters()) 
         + " inches";
      output += "\nTotal Perimeters: " + fmt.format(totalPerimeters())
         + " inches"; 
      output += "\nTotal Areas: " + fmt.format(totalAreas())
         + " square inches";
      output += "\nAverage Diameter: " + fmt.format(averageDiameter())
         + " inches"; 
      output += "\nAverage Perimeter: " + fmt.format(averagePerimeter())
         + " inches";
      output += "\nAverage Area: " + fmt.format(averageArea())
         + " square inches";
      
      return output;  
   
   }
   /**
    * Returns array.
    *
    * @return list ArrayList
    */
   public Quatrefoil[ ] getList()
   {
      return array;
   }
   /**
    * Adds a new QuatreFoil object.
    *
    * @param labelIn - used
    * @param diameterIn - used
    */
   public void addQuatrefoil(String labelIn, double diameterIn)
   {
      array[number++] = new Quatrefoil(labelIn, diameterIn);
   
   }
   /**
    * Finds Quatrefoil from list.
    *
    * @param labelIn - used
    * @return null 
    */
   public Quatrefoil findQuatrefoil(String labelIn)
   {
      for (int i = 0; i < number; i++)
      {
         if (array[i].getLabel().equalsIgnoreCase(labelIn))
         {
            return array[i];
         }
      
      }
      return null; 
   }
   /**
    * Deletes Quatrefoil from list.
    *
    * @param labelIn - used
    * @return result 
    */
   public Quatrefoil deleteQuatrefoil(String labelIn)
   {
      Quatrefoil result = findQuatrefoil(labelIn);
      for (int i = 0; i < number; i++)
      {
         if (array[i].getLabel().equalsIgnoreCase(labelIn))
         {
            for (int j = i; j < number; j++)
            {
               array[j] = array[j + 1];
            }
            array[number--] = null;
         }
      
      }
      return result; 
   }
   /**
    * Edits Quatrefoil from list.
    *
    * @param labelIn - used
    * @param diameterIn - used
    * @return boolean 
    */
   public boolean editQuatrefoil(String labelIn, double diameterIn)
   {
      boolean result = false;
      for (int i = 0; i < number; i++)
      {
         if (array[i].getLabel().equalsIgnoreCase(labelIn)) 
         {
            array[i].setDiameter(diameterIn);
            result = true;
         }
      }
      return result;
   }
   /**
    * Finds the largestQuatrefoilDiameter.
    * @return largestDiameterQuatrefoil 
    */
   public Quatrefoil findQuatrefoilWithLargestDiameter()
   {
      Quatrefoil largestDiameter = array[0];
      for (int index = 0; index < number; index++)
      {
         if (largestDiameter.getDiameter() < array[index].getDiameter())
         {
            largestDiameter = array[index];
         }
      }
      return largestDiameter;
   }
}