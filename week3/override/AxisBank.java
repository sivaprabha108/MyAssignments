package week3.override;

public class AxisBank extends BankInfo{
	
	
	  public void deposit() {
	  System.out.println("Axis Bank offers interest rate of 6.05% for deposits");
	 	
	  }
	 
	 
	public static void main(String[] args) {
		
		
		//Here deposit method are Overridden
		AxisBank axisb = new AxisBank();
		axisb.saving();
		axisb.fixed();
		axisb.deposit();
		

	}

}
