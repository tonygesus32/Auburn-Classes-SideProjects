import java.text.DecimalFormat; 
/**
* Create a HeartShapedBox class that stores the label, radius
* and height.
* Project4 HeartShapedBox.java
* @author Anthony Tolbert 
* @version 02/09/2023
**/

public class HeartShapedBox
{
   private String label = ""; 
   private double radius = 0; 
   private double height = 0; 
   /**
   * toString constructor.
   * @param labelIn for setLabel.
   * @param radiusIn for setRadius.
   * @param heightIn for setHeight.
   */

   public HeartShapedBox(String labelIn, double radiusIn, double heightIn)
   {
      setLabel(labelIn);
      setRadius(radiusIn);
      setHeight(heightIn);
   }
   /**
   * getLabel constructor.
   * @return label.
   */
 
   public String getLabel()
   {
      return label;
   
   }
   /**
   * setLabel constructor.
   * @param labelIn for label.
   * @return isSet.
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
   * getRadius constructor.
   * @return radius.
   */

   public double getRadius()
   {
   
      return radius;
   }
   /**
   * setRadius constructor.
   * @param radiusIn for radius.
   * @return isSet.
   */
   public boolean setRadius(double radiusIn)
   {
      boolean isSet = false; 
      if (radiusIn > 0) 
      {
         radius = radiusIn;
         isSet = true;
      
      }
      
      return isSet;
   
   }
   /**
   * getHeight constructor.
   * @return height.
   */

   public double getHeight()
   {
      return height; 
   
   }
   /**
   * setHeight constructor.
   * @param heightIn for height.
   * @return isSet.
   */

   public boolean setHeight(double heightIn)
   {
      boolean isSet = false;
      if (heightIn > 0)
      {
         height = heightIn;
         isSet = true;
      }
      
      return isSet;
   
   }
   /**
   * heartShapedArea constructor.
   * @return heart.
   */

   public double heartShapedArea()
   {
      
      double heart = Math.PI * Math.pow(radius, 2) + 4 * Math.pow(radius, 2);
      
      return heart;
   }
   /**
   * lateralSurfaceArea constructor.
   * @return lateral.
   */

   public double lateralSurfaceArea()
   {
      
   
      double lateral =  height * (4 * radius + 2 * Math.PI * radius);
      
      return lateral; 
   }
   /**
   * total constructor.
   * @return totals.
   */

   public double totalSurfaceArea()
   {
      double totals = 2 * heartShapedArea() + lateralSurfaceArea();
      
      return totals;
   }
   /**
   * volume constructor.
   * @return volumes.
   */

   public double volume()
   {
      double volumes = height * heartShapedArea();
      
      return volumes;
   }
   /**
   * toString constructor.
   * @return output.
   */

   public String toString()
   {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      String output = "HeartShapedBox \"" + label + "\" with radius " 
         + radius + " units and height " + height + " units:\n"; 
      output += "\theart shaped area = " + fmt.format(heartShapedArea()) 
         + " square units \n";
      output += "\tlateral surface area = " + fmt.format(lateralSurfaceArea()) 
               + " square units \n"; 
      output += "\ttotal surface area = " + fmt.format(totalSurfaceArea())  
               + " square units \n"; 
      output += "\tvolume = " + fmt.format(volume()) + " cubic units"; 
      
         
      return output; 
   }
   
   
   
}