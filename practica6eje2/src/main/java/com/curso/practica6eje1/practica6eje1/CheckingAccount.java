package com.curso.practica6eje1.practica6eje1;

public class CheckingAccount extends Account{
	
	private double overdraftAmount;
	
	
	
	protected CheckingAccount(double initBalance, double 
			overdraftAmount) {
		super(initBalance);
		this.overdraftAmount = overdraftAmount;
		// TODO Auto-generated constructor stub
	}
	
	
	public CheckingAccount(double initBalance) {
		
		this(initBalance,0.0);
		
	}
	
		
		
	public boolean withdraw(double amount) {
		boolean result = true;
		if ( balance < amount ) {
		double overdraftNeeded = amount - balance;
		if ( overdraftAmount < overdraftNeeded ) {
		result = false;
		} else {
		balance = 0.0;
		overdraftAmount -= overdraftNeeded;
		}
		} else {
		balance -= amount;
		}
		return result;
	}

}
