package com.oops;

class BankAccount {
	// private variables(data hiding)
	private String accountNumber;
	private String accountHolder;
	private double balance;
	private String pin;

	public BankAccount(String accountNumber, String accountHolder, double intialbalance, String pin) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = intialbalance;
		this.pin = pin;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getBalance() {
		return balance;

	}

	public void setAccountHolder(String accountHolder) {
		if (accountHolder != null && !accountHolder.isEmpty()) {
			this.accountHolder = accountHolder;

		}
		else {
			System.out.println("Invalid name");
		}
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance = balance+amount;
			System.out.println("Deposited Amount: " + amount);
			System.out.println("New Balance: " + balance);
		}
		else {
			System.out.println("Invalid aamount");
		}
	}
	
	public void withdraw(double amount,String enteredPin) {
		//pin Verification
		if(!this.pin.equals(enteredPin)) {
			System.out.println("Invalid PIn");
			return;
		}
		if(amount>0 && amount<=balance) {
			balance = balance - amount;
			System.out.println("Withdraw amount :" + amount);
			System.out.println("Remaining Balance: " + balance);
		}else if(amount>balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			System.out.println("Invalid amount");
		}
	}
}

public class EncapsulationExample {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("ACC001", "Tharun", 10000.0, "1234");
		
		//Accessing through public methods only
		System.out.println("Account Holder: " + account.getAccountHolder());
		System.out.println("Initial Balance: " + account.getBalance());
		
		account.setAccountHolder("Varun");
		System.out.println("Account Holder: " + account.getAccountHolder());

		account.deposit(500.0);
		
		account.withdraw(500.0, "1234");
		
		//wrong pin
        account.withdraw(100.0, "9999");
        
        
        System.out.println("\nFinal Balance: $" + account.getBalance());


		

		
		

	}

}
