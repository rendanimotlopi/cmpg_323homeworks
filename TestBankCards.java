
/**
 * Write a description of class TestBankCards here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestBankCards
{
    public static void main(String [] args)
    {
       System.out.print("\f"); 
       DebitCard customer1 = new DebitCard("Rendani", "Khorombi", "8707654230987", "0764350864", 4567);
       System.out.print(customer1.toString());
       System.out.printf("%sR%8.2f\n\n","Monthly Interest: ",customer1.calcint());
       
       CreditCard customer2 = new CreditCard("Joseph", "Smith", "7756098123456", "0974864298", 1500);
       System.out.print(customer2.toString());
       System.out.printf("%sR%8.2f\n\n","Monthly Interest: ",customer2.calcint());
       
       DebitCard customer3 = new DebitCard("john", "patel", "87678904987", "0764350864", 4567);
       System.out.print(customer1.toString());
       System.out.printf("%sR%8.2f\n\n","Monthly Interest: ",customer1.calcint());
       
       CreditCard customer4 = new CreditCard("Jenifer", "Smith", "74567893456", "0974864298", 1500);
       System.out.print(customer2.toString());
       System.out.printf("%sR%8.2f\n\n","Monthly Interest: ",customer2.calcint());
    }
}