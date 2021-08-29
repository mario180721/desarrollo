package com.curso.practica6eje1.practica6eje1;

public class CheckingAccount extends Account{
	
	private double overdraftAmount;
	
	
	
	protected CheckingAccount(double initBalance, double 
			overdraftAmount) {
		super(initBalance);
		this.overdraftAmount = overdraftAmount;
		// TODO Auto-generated constructor stub
	}
	

	// Preguntar por esta parte
	
	
	public CheckingAccount(double initBalance) {
		
		this(initBalance,0.0);
		
	}
	
		
	public void withdraw(double amount) throws OverdraftException {
		   if (amount > 0 && this.balance - amount >= 0 - this.overdraftAmount) {
	            if (this.balance - amount < 0) {
	                this.overdraftAmount += this.balance - amount;;
	                this.balance = 0;
	            } else {
	                this.balance = this.balance - amount;
	            }
	        } else {
	            throw new OverdraftException("CheckingAccount.java OverdraftException!", this.balance - amount);
	        }
	}

}
