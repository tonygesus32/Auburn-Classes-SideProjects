/** 
* This activity creates a class called Customer.
* Activity_7B Customer.java 
* @author Anthony Tolbert 
* @version 03/21/2023
*/ 

public class Customer implements Comparable<Customer>
{
   private String name = " ";
   private String location;
   private double balance;
   /**
   * Constructor for Customer.
   * @param nameIn for name
   */
   public Customer(String nameIn)
   {
      name = nameIn;
      location = " ";
      balance = 0; 
   
   }
   /**
   * Constructor for setLocation.
   * @param locationIn for location
   */
   public void setLocation(String locationIn)
   {
      location = locationIn;
   
   }
   /**
   * Constructor for changeBalance.
   * @param amount for balance 
   */
   public void changeBalance(double amount)
   {
      balance = amount + getBalance();
      
   
   }
   /**
   * Constructor for getLocation.
   * @return location
   */
   public String getLocation()
   {
      return location;
   }
   /**
   * Constructor for getBalance.
   * @return balance 
   */
   public double getBalance()
   {
      return balance;
   }
   /**
   * Constructor for setLocation.
   * @param city for location
   * @param state for location
   */
   public void setLocation(String city, String state)
   {
      location = city + ", " + state;
   
   }
   /**
   * Constructor for toString.
   * @return name 
   */
   public String toString()
   {
                     
      return name + "\n" + location + "\n" + "$" + balance;
   }
   /**
   * Constructor for compareTo.
   * @param obj for obj
   * @return 0
   */
   public int compareTo(Customer obj)
   {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001)
      {
         return 0;
      
      }
      else if (this.balance < obj.getBalance())
      {
         return -1;
      
      }
      else 
      {
         return 1;
      }
   }
}