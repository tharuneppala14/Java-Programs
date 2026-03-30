package com.exception.handeling;

//Custom exception
class InsufficientFundsException extends Exception {
	private double amount;

	public InsufficientFundsException(double amount) {
		super("Insufficient funds. Short by: $" + amount);
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
}

//Bank account class
class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount > balance) {
			throw new InsufficientFundsException(amount - balance);
		}
		balance -= amount;
		System.out.println("Withdrawn: $" + amount + " | Balance: $" + balance);
	}
}

//Main
public class CustomExceptionExample {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(100.0);

		try {
			account.withdraw(60.0); // succeeds
			account.withdraw(80.0); // throws exception
		} catch (InsufficientFundsException e) {
			System.out.println("Error: " + e.getMessage());
			System.out.println("Short by: $" + e.getAmount());
		}
	}
}
