import java.util.ArrayList;

import java.util.Scanner;

public class CreatePrograms {
	private ArrayList<VentureProgram> Kinnico;

	public static void main(String[] args) {
		ArrayList<VentureProgram> Kinnico = new ArrayList<VentureProgram>();
		
		int accountNumber;
		String CompanyName;
		String type;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Enter Account number");
			accountNumber=input.nextInt();
			if(accountNumber!=-1) {
				System.out.println("Enter Company Name");
				CompanyName=input.next();
				System.out.println("Enter Type of Seeding data:Infancy/Toddler");
				type=input.next();
				if(type.equals("Infancy"))
					Kinnico.add(new Infancy(accountNumber,CompanyName));
				else
					Kinnico.add(new Toddler(accountNumber,CompanyName));
			}
		} while (accountNumber!=-1);
		

		System.out.printf("\nAccountNumber\tCompanyName\tPeroid\t Roi\tinterest");
		//System.out.print("n");
		System.out.printf("\n----------" +"\t"+ "----------" +"\t"+ "------ "+"\t"+"-----"+"\t"+"---------");
		System.out.print("\n");
		
	
		for (VentureProgram ventureProgram : Kinnico) {
			System.out.println(ventureProgram.toString());
}
		
	
	}

}