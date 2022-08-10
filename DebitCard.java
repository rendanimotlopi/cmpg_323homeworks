
/**
 * Write a description of class DebitCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//This is the Debitcardsub class that will inherit attributes/properties from the FBankcard class
public class DebitCard extends BankCards
{
    private String type;
   private static int cout = 500;
   private final double rate = 2.5;
   //Defualt constructor
    public DebitCard()
    {
    }
    public DebitCard(String name, String LastName, String UserID, String cellnumber, double amount_spent)
    {
       super(name, LastName, UserID, cellnumber, amount_spent);
       cout++;
       setType(cout);       
    }
        
    public String gettype()
    {
        return type;
    }
    
    public void setType(int cout)
    {
       this.type= "Debit Card" + cout;
    }
    
    public void withdraw(double amount)
    {
        double newamount_spent = super.getamount_spent() - amount;
        super.setamount_spent(newamount_spent);
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