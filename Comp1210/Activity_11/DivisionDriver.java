import javax.swing.JOptionPane;
/**
* DivisionDriver class. 
* Activity_11 | DivisionDriver.java 
* @author Anthony Tolbert
* @version 04/18/2023
**/

public class DivisionDriver
{ 
   /**
   * the main Division Driver class.
   * @param args not used
   **/
   public static void main(String[] args) {
   
      String numInput = JOptionPane.showInputDialog("Enter the numerator:");
      String denomInput = JOptionPane.showInputDialog("Enter the denominator");
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
         String result = "Integer division: \n"
            + Division.intDivide(num, denom)
            + "\n\nFloating point division: \n"
            + Division.decimalDivide(num, denom);
      
         JOptionPane.showMessageDialog(null, result, "Result",
            JOptionPane.PLAIN_MESSAGE);
      } 
      catch (NumberFormatException e) 
      {
         JOptionPane.showMessageDialog(null,
            "Invalid input: enter numerical values only", "Error",
            JOptionPane.ERROR_MESSAGE);
      }
      catch (IllegalArgumentException e) 
      {
         JOptionPane.showMessageDialog(null,
            e, "Error", JOptionPane.ERROR_MESSAGE);
      }
   
   }
  
}