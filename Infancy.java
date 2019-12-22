public class Infancy extends VentureProgram {

	//@Override
	public Infancy(int accountNumber, String companyName) { 
		this.accountNumber=accountNumber;
		this.CompanyName=companyName;
		amount=25000;
		ROI=0.05;
		period=3;
	}
		
	public double calcTotalInterest() {
		
		double interest = amount*Math.pow((1+ROI/1),period*1);
	
		
		return interest;
	}
	
	

}

