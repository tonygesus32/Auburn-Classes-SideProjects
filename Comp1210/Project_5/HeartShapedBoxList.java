import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;
/**
* Class that stores the name of the list and an ArrayList
* of HeartShapedBox objects.
* Project 5 HeartShapedBoxList.java 
* @author Anthony Tolbert
* @version 02/16/2023
**/

public class HeartShapedBoxList
{
   private String name = "";
   private ArrayList<HeartShapedBox> objects = new ArrayList<HeartShapedBox>();
   
   public HeartShapedBoxList(String nameIn, ArrayList<HeartShapedBox> object)
   {
      name = nameIn; 
      objects = object;      
   
   }
   public String getName()
   {
      
      return name;
   } 
   public int numberOfHeartShapedBoxes()
   {
       
      if (objects.size() == 0) 
      {
         return 0;
      
      }
      else 
      {
         return objects.size();
      }
   }
   public double grandTotalSurfaceArea()
   {
      double total = 0;
      int index = 0; 
      while(index < objects.size())
      {
         total += objects.get(index).heartShapedArea();
         index++;
         
      }
      return total;
   }
   public double totalVolume()
   {
      double volume = 0; 
      int index = 0; 
      while(index < objects.size())
      {
         volume += objects.get(index).volume();
         index++;
      
      }
      return volume; 
   
   }
   
   public double averageTotalSurfaceArea()
   {
      double avgtotal = 0; 
      int index = 0;
      while(index < objects.size())
      {
         avgtotal += objects.get(index).heartShapedArea();
         index++;
      }
      double average = avgtotal / objects.size();
      
      return average;
   
   }
   
   public double averageVolume()
   {
      double avgVolume = 0;
      int index = 0;
      while(index < objects.size())
      {
         avgVolume += objects.get(index).volume();
         index++;
      }
      double vaverage = avgVolume / objects.size();
      
      return vaverage;
   
   }
   public String toString()
   {  
      String output = "\n" + name + "\n"; 
      int index = 0; 
      while(index < objects.size())
      {
         output = "\n" + objects.get(index) + "\n"; 
         index++;  
      } 
      return output; 
   } 
   public String summaryInfo()
   {
      DecimalFormat fmt = new DecimalFormat("#,##0.##"); 
      String result = "";
      result += "----- Summary for " + getName() 
          + "-----";
      result += "\nNumber of HeartShapedBoxes: " 
         + numberOfHeartShapedBoxes();
      result += "\nTotal Surface Area: " 
         + fmt.format(numberOfHeartShapedBoxes()) + " square units";
      result += "\nTotal Volume: " + fmt.format(totalVolume())
         + " cubic units"; 
      result += "Average Surface Area: " 
         + fmt.format(averageTotalSurfaceArea()) + "square units";
      result += "Average Volume: " + fmt.format(averageVolume()) 
         + " cubic units";
      
         
      return result; 
   }
   
   //Begin new methods
   /**
   * Reads in HeartShapedBox data from file and creates a  
   * HeartShapedBoxList object.
   * @param filenameIn for fileName to read
   * @return HeartShapedBoxList
   * @throws FileNotFoundException if the file cannot be opened. 
   */
   public ArrayList<HeartShapedBox> getList()
   {
      return objects;
   
   }
   public HeartShapedBoxList readFile(String fileNameIn)
                                       throws FileNotFoundException 
   {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<HeartShapedBox> hList = new ArrayList<HeartShapedBox>();
      
      
      String lName = scanFile.nextLine();
      
      while (scanFile.hasNext())
      {
         String label = scanFile.nextLine();
         double radius = Double.parseDouble(scanFile.nextLine());
         double height = Double.parseDouble(scanFile.nextLine());
         
         HeartShapedBox hsb = new HeartShapedBox(label, radius, height);
         hList.add(hsb);
      }
      
      scanFile.close();
       
      HeartShapedBoxList mH = new HeartShapedBoxList(lName, hList);
      return mH;
   
   }
   
   public void addHeartShapedBox(String label, double radius, double height)
   {
      HeartShapedBox hsb = new HeartShapedBox(label, radius, height);
      objects.add(hsb);
   }
   
   public HeartShapedBox findHeartShapedBox(String label)
   {
      for(HeartShapedBox hsb : objects)
      {
         if (hsb.getLabel().equalsIgnoreCase(label));
         
         return hsb;
         
      }
      return null;
   }
   
   public HeartShapedBox deleteHeartShapedBox(String label)
   {
      for (int i =  0; i < numberOfHeartShapedBoxes(); i++)
      {
         HeartShapedBox hsb = objects.get(i);    
         if(hsb.getLabel().equalsIgnoreCase(label))
         {
            objects.remove(i);
            return hsb;
         }
      }
      return null;
    
   }
   public boolean editHeartShapedBox(String label, double radius, double height)
   {
      for(int i = 0; i < numberOfHeartShapedBoxes(); i++)
      {
         if(label.equalsIgnoreCase(objects.get(i).getLabel()))
         {
            objects.get(i).setRadius(radius);
            objects.get(i).setHeight(height);
            return true;
            
         }
      }
      
      return false;
   }
}