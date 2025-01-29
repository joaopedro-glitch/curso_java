package entities;

public class Bank {
	
	private static final double WITHDRAWAL_FEE = 5.0; // Taxa fixa de saque
	
	private int accountNumber;
	private String name;
	private double balance;
	
	
	public Bank(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public Bank(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		double totalWithdrawal = withdraw + WITHDRAWAL_FEE; // Valor total a ser debitado (saque + taxa)
		
		this.balance -= totalWithdrawal;
	}
	
	@Override
	public String toString() {
		return "Account: " 
					+ accountNumber 
					+ ", Holder: " 
					+ name 
					+ ", Balance: $ " 
					+ String.format("%.2f", balance) 
					+ "\n";
	}
	
	
}
