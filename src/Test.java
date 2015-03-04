public class Test {

	public static void main(String[] args) {

		Account a = new Account(1122, 20000);
		a.setAnnualInterestRate(.045);
		try {
				a.withdraw(2500);
				a.withdraw(5000);
	
		} catch(InsufficientFundsException e) { 
			
			System.out.println("Insuffecient Funds. Balance: $" + e.getAmount());
						
		}

		System.out.println("Balance: $" + a.getBalance());
		System.out.println("Monthly Interest: " + a.getMonthlyInterestRate());
		System.out.println("Date of Account Creation: " + a.getDateCreated());
	}
}
