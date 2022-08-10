
/**
 * Abstract class BankCards - write a description of the class here
 *
 * @author (30151007 rendani khorombi)
 * @version (version number or date here) 
 */
// BankCards.Java Ths is the Super class from whch Creditcard and Debit cards will inherit the attributes of this class
// A java program that will calculate monthly interest rate depanding on the type of card and amount spent
public abstract class BankCards
{
    //Here we declare all of the superclass variables that will be used by both CreditCards and DebitCards
    //These are attributes of all bankCards
   private String name;      
   private String LastName;         
   private String UserID;
   private String cellnumber;
   protected double amount_spent; 
   
   public BankCards()
   {
   }
  public BankCards(String name, String LastName, String UserID, String cellnumber, double amount_spent)
    {
       setName(name);
       setLastName(LastName);
       setUserID(UserID);
       setcellnumber(cellnumber);
       setamount_spent(amount_spent); 
     }
       
    public String getName()
    {
        return name;
    }
    public String getLastName()
    {
        return LastName;
    }
    public String getUserID()
    {
        return UserID;
    }
    public String getcellnumber()
    {
        return cellnumber;
    }
       
    public double getamount_spent()
    {
        return amount_spent;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setLastName(String LastName)
    {
        this.LastName = LastName;
    }
    public void setUserID(String UserID)
    {
        this.UserID = UserID;
    }
    
    public void setcellnumber(String newNumber)
    {
        cellnumber = newNumber;
    }
        
    public void setamount_spent(double newamount_spent)
    {
        amount_spent = newamount_spent;
    }
    
    public void deposit(double amount)
    {
        if (amount >= 0)
            amount_spent = amount_spent + amount;
    }
    
    public String toString()
    {
        String str = String.format("%s%s\n%s%s\n%s%s\n%sR%8.2f\n","Card User: ", name + " " + LastName , "UserID: " , UserID,"Telephone number: ", cellnumber, "Amount Spent: ", amount_spent );
        return str;
    }
}
