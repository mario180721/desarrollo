package com.curso.practica6eje1.practica6eje1;

public class SavingsAccount extends Account{
	private double interestRate;
	protected SavingsAccount(double initBalance, double 
			interestRate) {
		super(initBalance);
		this.interestRate = interestRate;
		// TODO Auto-generated constructor stub
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	
	
	

}
