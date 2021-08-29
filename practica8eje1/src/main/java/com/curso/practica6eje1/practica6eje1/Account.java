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
	
	public void deposit(double amt) {
		
		balance=balance+amt;
		
		//return true;
		
		}
	
	
public void withdraw(double amt) throws OverdraftException {
	
	boolean result = false;// supone fallo de la operación
	if ( amt <= balance ) {balance = balance - amt;result = true;
	// éxito de la operación}return result;
	}else {
		
		throw new OverdraftException("Fondos insufientes, tiene un deficit de:",this.balance-amt);
		
	}
	
	//return;
	
	
}


}

