/**
* This program is part of the driver program that enters a users info.
* Activity 4a UserInfo.java
* @author Anthony Tolbert 
* @version 02/07/2023
**/

public class UserInfo 
{
   //instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status; 
   private static final int OFFLINE = 0, ONLINE = 1;  
   
   /**
   * constructor.
   * @param firstNameIn for firstname
   * @param lastNameIn  for lastname
   */
 
   public UserInfo(String firstNameIn, String lastNameIn)
   {
     
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified"; 
      age = 0; 
      status = OFFLINE;
       
   }
   /**
   * constructor.
   * @param locationIn for location.
   */

   public void setLocation(String locationIn)
   {
      location = locationIn;
   
   }
   /**
   * constructor.
   * @param ageIn for age.
   * @return isSet 
   */

   public boolean setAge(int ageIn)
   {
           
      boolean isSet = false;
      if (ageIn > 0) 
      {
         age = ageIn;
         isSet = true; 
      }
      return isSet;
   
   }
   /**
      * constructor.
      * @return nothing.
      */

   public int getAge()
   {
            
      return age;
   }
   /**
      * constructor.
      * @return nothing.
      */

   public String getLocation()
   {
      return location;
   }
   /**
    * constructor.
    * 
    */

   public void logOff()
   {
            
      status = OFFLINE;
   }
   /**
   * constructor.
   * 
   */

   public void logOn()
   {
      /**
      * constructor.
      */
   
      status = ONLINE;
   }
   /**
   * constructor.
   * @return output
   */

   public String toString()
   {
            
      String output = "Name: " + firstName + " "
            + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE)
      {
         output += "Offline";
         
      }
      else
      {
         output += "Online";
      } 
      return output;
   }
   

}