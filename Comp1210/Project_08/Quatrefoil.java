import java.text.DecimalFormat;
/**
* A class representing a Quatrefoil object.
* Project 7 Quatrefoil.java 
* @author Anthony Tolbert 
* @version 03/18/2023
**/

public class Quatrefoil implements Comparable<Quatrefoil> 
{
   private String label = ""; 
   private double diameter = 0; 
   private static int count = 0;
   /**
   * Constructor for Quatrefoil.
   * @param labelIn for label
   * @param diameterIn for diameter 
   *
   **/
   public Quatrefoil(String labelIn, double diameterIn)
   {
      setLabel(labelIn);
      setDiameter(diameterIn);
      count++;
   }
   /**
   * Constructor for getLabel.
   * @return label 
   */
   public String getLabel()
   {
      return label;
   
   }
   /**
   * Constructor for setLabel.
   * @param labelIn for label 
   * @return isSet 
   */
   public boolean setLabel(String labelIn)
   {
      boolean isSet = false; 
      if (labelIn != null) 
      {
         label = labelIn;
         label = label.trim(); 
         isSet = true; 
         
      
      }
      return isSet; 
      
   }
   /**
   * Constructor for getDiameter.
   * @return diameter
   * 
   */
   public double getDiameter()
   {
      return diameter;
   
   }
   /**
   * Constructor for setDiameter.
   * @param diameterIn for diameter 
   * @return isSet
   */
   public boolean setDiameter(double diameterIn)
   {
      boolean isSet = false;
      if (diameterIn > 0)
      {
         diameter = diameterIn;
         isSet = true; 
      }
      
      return isSet;
      
   }
   /**
   * Constructor for perimeter.
   * @return perimeter
   *
   */
   public double perimeter()
   {
      double perimeter = Math.PI * diameter;
      
      return perimeter;
   
   }
   /**
   * Constructor for perimeterInFT.
   * @return perimeterFT
   *
   */
   public double perimeterInFt()
   {
      double perimeterInFt = perimeter() / 12;
      
      return perimeterInFt;
   }
   /**
   * Constructor for area.
   * @return area
   */
   public double area()
   {
      double r = diameter / 2; 
      double radius = Math.pow(r, 2);
      double area = radius + 2 * (Math.PI * radius / 4);
      return area; 
   }
   /**
   * Constructor for areaInSqFt.
   * @return area() / 144;
   *
   */
   public double areaInSqFt()
   {
      return area() / 144;
   }
   /**
   * Construct for String. 
   * @return output
   *
   */
   public String toString()
   {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      String output = "Quatrefoil \"" + label + "\" with diameter " 
            + diameter + " inches has:\n";
      output += "\tperimeter = " + fmt.format(perimeter()) + " inches (or "
            + fmt.format(perimeterInFt()) + " feet)\n";
      output += "\tarea = " + fmt.format(area()) + " square inches (or "
            + fmt.format(areaInSqFt()) + " square feet)";        
   
      return output;
   }
   /**
   * Constructor for getCount. 
   * @return count
   *
   */
   public static int getCount()
   {
      return count;
   
   }
   /**
   * Constructor for resetCoutnt.
   *
   *
   */
   public static void resetCount()
   {
      count = 0;
   }
   /**
   * Constructor for equals. 
   * @return label
   * @param obj for obj
   */
   public boolean equals(Object obj) 
   {
      if (!(obj instanceof Quatrefoil)) {
         return false;
      }
      else
      {
         Quatrefoil qf = (Quatrefoil) obj;
         return (label.equalsIgnoreCase(qf.getLabel())
            && Math.abs(diameter - qf.getDiameter()) < .000001);
      }
   }
   /**
   * this method is required by checksyle.
   * @return 0;
   */
   public int hashCode()
   {
      return 0;
   }
   /**
   * Constructor for compareTo.
   * @param other for Quatrefoil
   * @return int 
   */
   public int compareTo(Quatrefoil other)
   {
      if (this.area() < other.area()) {
         return -1;
      }
      
      else if (this.area() > other.area()) {
         return 1;
      } 
      
      else {
      
         return 0;
      }  
   
   }
}