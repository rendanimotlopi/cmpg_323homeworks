
/**
 * Write a description of class CreditCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCards //This class inherits attributes from its super class BankCards. 
{
   private String type;
   private static int cout = 100;
   private final double rate = 2.7;
   
    public CreditCard()
    {
    }  
    public CreditCard(String name, String LastName, String UserID, String cellnumber, double amount_spent)
    {
       super(name, LastName, UserID, cellnumber, amount_spent);
       cout++;
       setType(cout);        
    }
       
    public String getType()
    {
        return type;
    }
    public void setType(int cout)
    {
        this.type = "Credit Card" + cout;
    }
    
    public void withdraw(double amount)
    {
        double result = super.getamount_spent() - amount;
        super.setamount_spent(result);
    }
    
    public double calcint()
    {
      double interest = super.getamount_spent() * (rate/100);
      return interest;
    }
    @Override
    public String toString()
    {
        String str = String.format("%s%s%s\n",super.toString(),"Type: ", type );
        return str;
    }
}