import java.util.Date;
import java.util.Scanner;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	private Account() {

	}

	public Account(int id, double balance) {
		this();
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();

	}

	// Setters
	public void setID(int x) {
		this.id = x;
	}

	public void setBalance(double x) {
		this.balance = x;
	}

	public void setAnnualInterestRate(double x) {
		this.annualInterestRate = x;
	}

	// Getters
	public int getID() {
		return this.id;
	}

	public double getBalance() {
		return this.balance;
	}

	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	// Methods
	public double getMonthlyInterestRate() {
		return (this.annualInterestRate / 12);
	}

	public void withdraw(double x) throws InsufficientFundsException {
		
		if (x <= balance) {
			this.balance = balance - x;
		} else {
			double remainder = x - balance;
			throw new InsufficientFundsException(remainder);
		}
	}

	public void deposit(double x) {
		
		this.balance = balance + x;
		
	}

}
