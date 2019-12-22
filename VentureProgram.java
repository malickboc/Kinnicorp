public abstract class VentureProgram implements VentureConstants {
	protected int accountNumber;
	protected String CompanyName;
	protected static double amount;
	protected int period;
	protected double ROI;

	public VentureProgram(int accountNumber, String companyName, int period, double ROI) {
		super();
		this.accountNumber = accountNumber;
		this.CompanyName = companyName;
	
	}
	public VentureProgram() {
	
	}

	
	
	@Override
	public  String toString() {
		String msg=" ";
		return accountNumber+"\t\t"+CompanyName+"\t\t"+  period+"\t"+  ROI+"\t"+  calcTotalInterest()+"\n" ;
	}
	
	
}
