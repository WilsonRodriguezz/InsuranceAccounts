package exercise1;

public abstract class Insurance {

	
	//fields
	protected String typeOfInsurance;
	protected double monthlyCost;
	
	
	//default constructor
	public Insurance(){
		
	}
	
	//constructor
	public Insurance(String typeOfInsurance) {
	
		this.typeOfInsurance = typeOfInsurance;
		
	}
	
	//Get type of insurance
	public String getTypeOfInsurance() {
		return typeOfInsurance;
	}
	
	//Get Monthly cost
	public double getMonthlyCost() {
		return monthlyCost;
	}
	
	//Abstract methods
	public abstract void setInsuranceCost();
	
	public abstract String displayInfo();
	
	
	 

}
