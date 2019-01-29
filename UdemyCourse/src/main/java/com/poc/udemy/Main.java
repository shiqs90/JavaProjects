package com.poc.udemy;

public class Main {
	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		ba.depositFunds(100);
		ba.withdrawFunds(20);
		ba.depositFunds(100);
	}

}
