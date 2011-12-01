package reges.projects;

public class C03P02_AnnuitetsOpsparing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double interest, balance, newBalance;
		
	
		balance = 1000;
		interest = balance * 0.065;
		newBalance = interest + balance;
		
		System.out.println("\t\t" + "Year"    + "\t\t" + "Balance"    + "\t\t" + "Interest" + "\t" + "Deposit" + "\t\t"	+ "New Balance");
		System.out.println("\t\t" + "---------------------------------------------------------------------------");
		System.out.println("\t\t" + "1   "    + "\t\t" + "1000$  "    + "\t\t" + Math.round(interest) + "$"   + "\t\t" + "1000$" + "\t\t" + Math.round(newBalance) + "$");
	
		for(int year = 2; year <= 25; year++){
			balance = newBalance + 100;
			interest = balance * 0.065;
			newBalance = interest + balance;
			System.out.println("\t\t" + year + "\t\t" + Math.round(balance) + "$"    + "\t\t" + Math.round(interest) + "$"   + "\t\t" + "100$" + "\t\t" + Math.round(newBalance) + "$");
			
			
			
		}
		
	}
	
	

}
