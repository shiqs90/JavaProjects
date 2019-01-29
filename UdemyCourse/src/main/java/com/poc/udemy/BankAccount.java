package com.poc.udemy;

public class BankAccount {
	private String accountNumber;
	private int balance;
	private String customerNumber;
	private String email;
	private int phoneNumber;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BankAccount ba=new BankAccount();
//		ba.depositFunds(100);
//		ba.withdrawFunds(1001);
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void depositFunds(int amt) {
		this.balance+=amt;
		System.out.println("Successfully deposited funds.Your Current balance:"+this.balance);
	
	}
	public void withdrawFunds(int amt) {
		if(amt<=this.balance) {
			this.balance=this.balance-amt;
			System.out.println("Successfully withdrawn funds.Your Current balance:"+this.balance);
		}
		else
			System.out.println("You don't have sufficient funds to withdraw");
	}
}
