import java.util.ArrayList;
/**
* This project which will hold a set of integer values representing daily 
* temperatures.
* Activity 6 Temperatures.java 
* @author Anthony Tolbert 
* @version 02/20/2023
**/

public class Temperatures
{
   ArrayList<Integer> temperatures = new ArrayList<Integer>();

   public Temperatures(ArrayList<Integer> temperaturesIn)
   {
      temperatures = temperaturesIn;
   
   }
   
   public int getLowTemp()
   {
      if(temperatures.isEmpty())
      {
         return 0;
      }
      else
      {
         int low = temperatures.get(0);
         for (int i = 1; i < temperatures.size(); i++)
         {
            if (temperatures.get(i) < low)
               low = temperatures.get(i); 
         }
         
         return low; 
      }
   }
   
   public int getHighTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      else 
      {
         int high = temperatures.get(0);
         for (Integer temp : temperatures)
            if (temp > high)
               high = temp;
      
         return high; 
      }
   }
   
   public int lowerMinimum(int lowIn)
   {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
   public int higherMaximum(int highIn)
   {
   
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   public String toString()
   {
      String output = "\tTemperatures: "+ temperatures;
      output += "\n\tLow: " + getLowTemp();
      output += "\n\tHigh: " + getHighTemp();
      return output;
   }

}