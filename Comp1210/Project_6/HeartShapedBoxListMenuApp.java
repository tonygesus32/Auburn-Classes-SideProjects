import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
/**
* Class with a main method that presents the user with a
* the user with a menu with eight options.
* Project 6 HeartShapedBoxListMenuApp.java 
* @author Anthony Tolbert 
* @version 02/23/2023
**/ 

public class HeartShapedBoxListMenuApp
{
   /**
   *
   *
   * @param args - is not used.
   * @throws FileNotFoundException if the file cannot be opened.
   **/

   public static void main(String[] args) throws FileNotFoundException
   {
      String aList = "no list name"; 
      ArrayList<HeartShapedBox> myList = new ArrayList<HeartShapedBox>();
      HeartShapedBoxList myHList = new HeartShapedBoxList(aList, myList);
      String fileName = "no file name";
      
      String label;
      double radius;
      double height;
      
      String code = "";
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("HeartShapedBox List System Menu\n"
               + "R - Read File and Create HeartShapedBox List\n"
               + "P - Print HeartShapedBox List\n"
               + "S - Print Summary\n"
               + "A - Add HeartShapedBox\n"
               + "D - Delete HeartShapedBox\n"
               + "F - Find HeartShapedBox\n"
               + "E - Edit HeartShapedBox\n"
               + "Q - Quit\n");
               
      do
      {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0)
         {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar)
         {
            case 'R': //Reads in file and Create HeartBoxList
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
               myHList = myHList.readFile(fileName);
               
               System.out.println("\tFile read in and "
                  + "HeartShapedBox List created\n");
                  
              break;
              
            
            case 'P': //Print HeartBoxList
               System.out.print(myHList);
               break;
               
            
            case 'S': //Print Summary
               System.out.print(myHList.summaryInfo());
               break;
               
            case 'A'://Add HeartShapeBox
               System.out.print("Label: ");
               
         }
      
      }
      
               
   } 

}