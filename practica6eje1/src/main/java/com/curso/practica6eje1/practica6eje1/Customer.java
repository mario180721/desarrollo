package com.curso.practica6eje1.practica6eje1;


public class Customer {

	
	private  String firstName;
	private  String lastName;
	Account account;
	
	
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public Account getAccount() {
		return account;
	}
	 
	
	public Account setAccount(Account acct) {
		return account;
	}
	
	
	
}
