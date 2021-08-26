package com.curso.practica6eje1.practica6eje1;

public class Account {

	protected double balance;

	protected Account(double balance) {
		super();
		this.balance = balance;
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	public boolean deposit(double amt) {
		
		balance=balance+amt;
		
		return true;}
	
	
public boolean withdraw(double amt) {
	
	boolean result = false;// supone fallo de la operación
	if ( amt <= balance ) {balance = balance - amt;result = true;
	// éxito de la operación}return result;
	}
	
	return result;
	
	
}


}

