import java.util.ArrayList; 
import java.util.Scanner; 
import java.io.File;
import java.io.FileNotFoundException;
/** 
* This program reads in the name of the data file entered by the user
* reads the list name.
* @author Anthony Tolbert 
* @version 02/15/2023
**/

public class HeartShapedBoxListApp
{
   public static void main(String[] args) throws FileNotFoundException
   {
      ArrayList<HeartShapedBox> myList = new ArrayList<HeartShapedBox>();
      String fileName = "";
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      fileName = scan.nextLine();
      Scanner scanFile = new Scanner(new File(fileName));
      
      
      String heartBox = scanFile.nextLine();
      while(scanFile.hasNext())
      {
         String label = scanFile.nextLine();
         String radius = scanFile.nextDouble();
         String height = scanFile.nextDouble();
         
         HeartShapedBox hsb = new HeartShapedBox(label, radius, height);
         myList.add(hsb);
         
      
      }
      scanFile.close();
      HeartShapedBoxList myHeartShapedBoxList = new HeartShapedBoxList(heartBox, myList);
      
      System.out.println(myHeartShapedBoxList);
   }

}
