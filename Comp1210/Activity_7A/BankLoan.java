/**
*  This is a program that creates a bankloan for the user.
*  Activity_07 Bankloan.java 
*  @version 03/15/2023
*  @author Anthony Tolbert 
**/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0; 
    /**
    * Constructor for BankLoan.
    * @param customerNameIn for customerIn
    * @param interestRateIn for interestRate
    **/
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++; 
   }
    /**
    * Custructor for borrowFromBank.
    * @param amount for amount 
    * @return wasLoanMade
    **/
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
    /**
    * Constructor for payBank.
    * @param amountPaid for amountPaid
    * 
    * @return 0
    **/
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
    /**
    * Constructor for getBalance.
    * @return balance
    *
    **/
   public double getBalance() {
      return balance;
   }
    /**
    * Constructor for setInterestRate. 
    * @param interestRateIn for interestRate
    * @return false
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
    /**
    * Constructor for getInterestRate.
    * @return interestRate
    *
    **/
   public double getInterestRate() {
      return interestRate;
   }
   /**
   * Constructor for chargeInterest.
   * 
   */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
    /**
    * Constructor for toString.
    * @return output
    **/
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
    /**
    * Constructor for isAmountValid.
    * @param amount for amount 
    * @return amount
    */
   public static boolean isAmountValid(double amount) {
      return amount >= 0; 
   }
    /**
    * Constructor for isInDebt.
    * @param loan for loan 
    * @return false 
    */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true; 
      }
      return false; 
      
   }
   /**
   * Constructor for getLoansCreated.
   * @return loansCreated
   */
   public static int getLoansCreated() {
      return loansCreated;
   }
   /**
   * Constructor for resetLoansCreated.
   *
   *
   */
   public static void resetLoansCreated() {
      loansCreated = 0; 
   }
}
