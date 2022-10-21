package exercise1;
import java.util.*;

import javax.swing.JOptionPane;

public class TestInsurance {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		welcomeMessage();	
	
			// TODO Auto-generated catch block
			
		
		
		
		
	}
	public static void welcomeMessage() {
		JOptionPane.showMessageDialog(null, "Hello welcome to our Insurance company.");
		String customerName = JOptionPane.showInputDialog(null, "To start please enter your name: ");
		List<Insurance> insuranceAccounts = control();
		System.out.printf("Dear customer %s.%nThis is the resumen of your session.%n", customerName);
		for( int i= 0; i <= (insuranceAccounts.size() - 1); i++) {
			System.out.printf("Insurance %d information: %n", i+1);
			System.out.println (insuranceAccounts.get(i).displayInfo());
		}
	}
	
	public static List<Insurance> control() {
		
		
		List<Insurance> insuranceAccounts = new ArrayList<>();
		//Insurance insuranceAccounts [] = new Insurance [10];
		boolean control;
		int counter = 0;
		do {
			Insurance account =  createInsuranceType(requestInsuranceType()); 
			insuranceAccounts.add(account); 
			int	verification = JOptionPane.showOptionDialog( null, "Do you want to get another insurance?" , "Insurance account creation",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[] { "Yes", "No"},"No");
			if(verification == 0){
				control = true;
				counter++;
			}
			else {
				control = false;
			}
		}while (control == true);
		return insuranceAccounts;
	}
	
	
	public static int requestInsuranceType() {
		
	
		int verification = 0;
		

		verification = JOptionPane.showOptionDialog( null, "Please choose a type of insurance" , "Insurance account creation",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[] { "Health", "Life"},"Life");
		
		return verification;
		
	}
	
	
	public static Insurance createInsuranceType( double insuranceType) {
	
	//Health	
	 if(insuranceType == 0) {
		 Insurance i1 = new Health("Health"); 
		 i1.setInsuranceCost();
		 return i1;
	 }
	 //Life
	 else {
		 Insurance i1= new Life("Life");
		 i1.setInsuranceCost();
		 return i1;
	  }
		
					
	}	
			
			
}
	



