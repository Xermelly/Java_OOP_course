package entities;

public class AccountBank {
	
	private final double TAX = 5.0;
	private int accNumber;
	private String name;
	private double balance;
		
	public AccountBank(int accNumber, String name, double initialDeposit) {
		super();
		this.accNumber = accNumber;
		this.name = name;
		deposit(initialDeposit);
	}

	public AccountBank(int accNumber, String name) {
		this.accNumber = accNumber;
		this.name = name;
	}

	public int getAccNumber() {
		return accNumber;
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

	public void deposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		balance -= value + TAX;
	}
	
	
	public String toString() {
		return "Account "
				+getAccNumber()
				+", Holder: "
				+getName()
				+", Balance: $ "
				+String.format("%.2f", getBalance());
	}

}
