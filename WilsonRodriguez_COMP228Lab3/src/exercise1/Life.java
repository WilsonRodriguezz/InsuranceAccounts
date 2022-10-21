package exercise1;
import java.text.*;
import javax.swing.JOptionPane;

public class Life extends Insurance{

	public Life(String typeOfInsurance) {
		super (typeOfInsurance);
	}
	
	public Life() {
		
	}
	
	@Override
	public void setInsuranceCost() {
		// TODO Auto-generated method stub
		 boolean verification; 
		 do {
			 try {
			 monthlyCost = Integer.parseInt(JOptionPane.showInputDialog(null,"Please insert the monthly fee that you would like to pay in your life insurance: "));
			 verification = true;
			 } catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Please insert a correct value");
				 verification = false;
			 }	 
		 }while(verification == false);
	}

	@Override
	public String displayInfo() {
		// TODO Auto-generated method stub
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		return String.format("Insurance type: %s%nMonthly cost: %s%n",typeOfInsurance, formatter.format(monthlyCost));
	}

}
