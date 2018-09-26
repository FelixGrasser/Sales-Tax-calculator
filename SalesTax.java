import javax.swing.JOptionPane;

public class SalesTax
{
   public static void main(String[] arg)
   {
     final double st_tax = 4;
     final double cnt_tax = 2;
     double amount;
     String purchased;
     double countyTax;
     double stateTax;
     double totalTax;
     double totalSale;
     // The amount purchased
     
     purchased = JOptionPane.showInputDialog("Enter how much you purchased: ");
     
     amount = Double.parseDouble(purchased);
     
     totalTax = amount * ((cnt_tax / 100) + (st_tax / 100));
     
     totalSale = amount + totalTax;
     
     JOptionPane.showMessageDialog(null,"The amount purchased is: $"+amount+",\nThe states sales tax is "+st_tax+"%,\nThe county sales tax is: "+cnt_tax+
                                   "%,\nThe total sales tax is $"+totalTax+"\nand the total sale is: $"+totalSale);
    
     
     
     
     System.exit(0);
     }
     }