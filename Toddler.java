
public class  Toddler extends VentureProgram{

	//@Override
		public Toddler(int accountNumber, String companyName) { 
			this.accountNumber=accountNumber;
			this.CompanyName=companyName;
			amount=250000;
			ROI=0.03;
			period=6;
			
		}
			
		public double calcTotalInterest() {
			
			double interest = amount*Math.pow((1+ROI/1),period*1);
		
			
			return interest;
		}
		
		

}


